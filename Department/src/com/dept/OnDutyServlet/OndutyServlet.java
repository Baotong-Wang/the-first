package com.dept.OnDutyServlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.OnDutyDao;
import com.dept.Daomain.Onduty;

/**
 * Servlet implementation class OndutyServlet
 */
public class OndutyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//从前端界面获取值
		String dept = request.getParameter("dept");
		String wname = request.getParameter("wname");
		String time = request.getParameter("O_time");
		
		//创建Onduty类对象，用来存储前端界面的获取值
		Onduty onduty = new Onduty();
		onduty.setDept(dept);
		onduty.setO_name(wname);
		onduty.setO_time(time);
		
		//查看是否获取到了值
		System.out.println(onduty);
		
		
		//创建持久层对象
		OnDutyDao dao = new OnDutyDao();
		//调用添加方法
		dao.addOnDuty(onduty);
		
		//跳转页面
		response.sendRedirect("/Department/OnDuty.jsp");
	}

}
