package com.shopNest1.product;

public class Product {
	int pid;
	String name;
	int pprice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public Product(int pid, String name, int pprice) {
		super();
		this.pid = pid;
		this.name = name;
		this.pprice = pprice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", pprice=" + pprice + "]";
	}
	
}
