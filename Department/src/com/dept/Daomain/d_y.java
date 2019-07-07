package com.dept.Daomain;
/**
 * @author Wangbaotong
 *
 *
 */
public class d_y {

	//定义字段属性
	private int d_id;
	private int y_id;
	private String y_title;
	private int y_tel;
	
	//分别提供get/set方法
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public int getY_id() {
		return y_id;
	}
	public void setY_id(int y_id) {
		this.y_id = y_id;
	}
	public String getY_title() {
		return y_title;
	}
	public void setY_title(String y_title) {
		this.y_title = y_title;
	}
	public int getY_tel() {
		return y_tel;
	}
	public void setY_tel(int y_tel) {
		this.y_tel = y_tel;
	}
	//重写toString方法
	@Override
	public String toString() {
		return "d_y [d_id=" + d_id + ", y_id=" + y_id + ", y_title=" + y_title
				+ ", y_tel=" + y_tel + "]";
	}

}
