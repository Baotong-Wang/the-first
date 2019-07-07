package com.dept.Daomain;
/**
 * @author Wangbaotong
 *
 *
 */
public class workers {
	//定义字段属性
	private int yid;
	private String  wname;
	private int wage;
	private String wsex;
	private int wtel;
	private String dept;
	private float wsalary;
	
	//给出属性的对应的get/set方法
	public int getYid() {
		return yid;
	}
	public void setYid(int yid) {
		this.yid = yid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public String getWsex() {
		return wsex;
	}
	public void setWsex(String wsex) {
		this.wsex = wsex;
	}
	public int getWtel() {
		return wtel;
	}
	public void setWtel(int wtel) {
		this.wtel = wtel;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getWsalary() {
		return wsalary;
	}
	public void setWsalary(float wsalary) {
		this.wsalary = wsalary;
	}
	
	//重写toString方法
	@Override
	public String toString() {
		return "workers [yid=" + yid + ", wname=" + wname + ", wage=" + wage
				+ ", wsex=" + wsex + ", wtel=" + wtel + ", dept=" + dept
				+ ", wsalary=" + wsalary + "]";
	}
}
