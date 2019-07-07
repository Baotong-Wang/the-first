package com.dept.jdbc;

import org.junit.Test;

public class TestUtil {
	/**
	 * 判断某一个字符串是否为空
	 * @param s
	 * @return
	 */
	//CharSequence 这个是实现了字符串的接口
	public static boolean isEmpty(CharSequence s){
		return s==null || s.length()== 0;
	}

}
