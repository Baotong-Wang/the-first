package com.dept.Daomain;
/**
 * @author Wangbaotong
 *
 *
 */
public class admin {
	//管理员模型对象，根据表列的内容，进行设置属性
	private String username;
	private String password;
	/*
	 * 当前属性设置完毕后，我们需要传递数据，需要设置get和set
	 */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "admin [username=" + username + ", password=" + password + "]";
	}
	
}
