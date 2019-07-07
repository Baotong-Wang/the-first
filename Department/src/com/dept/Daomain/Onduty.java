package com.dept.Daomain;
/**
 * @author Wangbaotong
 *
 */
public class Onduty {
	//定义数据库字段属性
	private String dept;
	private String o_name;
	private String O_time;
	
	
	//提供get/set方法
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_time() {
		return O_time;
	}
	public void setO_time(String o_time) {
		O_time = o_time;
	}
	
	
	//重写一下toString方法，以便观察
	@Override
	public String toString() {
		return "Onduty [dept=" + dept + ", o_name=" + o_name + ", O_time="
				+ O_time + "]";
	}
	

	
	
	
}
