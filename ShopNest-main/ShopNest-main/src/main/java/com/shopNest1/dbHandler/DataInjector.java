package com.shopNest1.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInjector {

	public static String addCustomer(String uname, String mail, String pass, String gender, String address) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost/ShopNest";
		String user="root";
		String pwd ="Sourav@19";
		String sql = "Insert into Customer values(?,?,?,?,?)";
		String regStatus="";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, uname);
			ps.setString(2, mail);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, address);

			ps.executeUpdate();

			regStatus = "Success";
		}
		catch (Exception ex) {
			System.out.println("Problem in adding customer");
			ex.printStackTrace();
			regStatus="Fail";
		}
		finally {
			return regStatus;

		}
	}

	public static boolean addProduct(int pid, String pname, String pdesc, int pprice, String pimg) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost/ShopNest";
		String user="root";
		String pwd ="Sourav@19";
		String sql = "Insert into Product values(?,?,?,?,?)";


		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setString(3, pdesc);
			ps.setInt(4, pprice);
			ps.setString(5, pimg);

			ps.executeUpdate();


		}
		catch (Exception e) {
			System.out.println("Problem in adding product");
			e.printStackTrace();
			return false;
		}
		finally {
			return true;

		}

	}

}
