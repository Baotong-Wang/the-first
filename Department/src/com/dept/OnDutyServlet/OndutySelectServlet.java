package com.dept.OnDutyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dept.Dao.OnDutyDao;
import com.dept.Daomain.Onduty;

/**
 * Servlet implementation class OndutySelectServlet
 */
public class OndutySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//创建持久层对象
		OnDutyDao dao = new OnDutyDao();
		//调用查询方法,用一个集合对象来接受查询的值
		List<Onduty> selectOnduty = dao.selectOnduty();
		
		//将查询到的值返回给前端界面
		response.getWriter().write(JSONObject.toJSONString(selectOnduty));
	}

}
