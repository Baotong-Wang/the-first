package com.dept.Daomain;
/**
 * @author Wangbaotong
 */
public class Dept {
	
	//用户模型对象，根据表列的内容，进行设置属性
	private int did;
	private String dname;
	private int dnumber;
	private String director;
	private String dlocation;
	
	/*
	 * 当前属性设置完毕后，我们需要传递数据，需要设置get和set
	 */
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDnumber() {
		return dnumber;
	}
	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	
	//由于可能会用到打印信息，在这里也重写一下toString
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", dnumber=" + dnumber
				+ ", director=" + director + ", dlocation=" + dlocation + "]";
	}
}
