package com.shopNest1.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopNest1.admin.ProductServlet;
import com.shopNest1.product.Product;

public class DataFetcher {

	public static String fetchPassword(String uname) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost/ShopNest";
	    String user="root";
	    String pwd ="Sourav@19";
	    String sql = "Select pass from Customer where uname=?";
		String dbPass="";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			rs.next();
			dbPass = rs.getString(1);
			
		} catch (Exception e) {
			System.out.println("Login Issue");
			e.printStackTrace();
		} 
			return dbPass;
		
	}
	public static List fetchUsersInfo() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost/ShopNest";
	    String user="root";
	    String pwd ="Sourav@19";
	    String sql = "Select uname,mail,gender,address from Customer";
		List ulist = new ArrayList();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pwd);
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String temp = rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
				ulist.add(temp);
			}
		}
		catch (Exception e) {
			System.out.println("Problem in login");
		}
		return ulist;
		
	}
	

public static List fetchProductInfo() {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url ="jdbc:mysql://localhost/ShopNest";
    String user="root";
    String pwd ="Sourav@19";
    String sql = "Select pid,pname,pdesc,pprice,pimg from Product";
	List ilist = new ArrayList();
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			String temp = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4)+":"+rs.getString(5);
			ilist.add(temp);
		}
	}
	catch (Exception e) {
		System.out.println("Problem in fetching product");
	}
	return ilist;
	
}
public static Product getProductById(int pid) {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url ="jdbc:mysql://localhost/ShopNest";
    String user="root";
    String pwd ="Sourav@19";
    String sql = "Select pname,pprice from Product where pid=?";
    Product p=null;
    
    try {
    	Class.forName(driver);
    	Connection con = DriverManager.getConnection(url,user,pwd);
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1,pid);
    	ResultSet rs = ps.executeQuery();
    	rs.next();
    	String pname = rs.getString(1);
    	int pprice = rs.getInt(2);
    	
    	p = new Product(pid,pname,pprice);
    }catch(Exception e){
    	System.out.println("Problem in fetching product");
    	e.printStackTrace();
    }
    finally {
		return p;
	}
}


}