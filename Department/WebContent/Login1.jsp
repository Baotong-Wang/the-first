<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录界面</title>
	<link href = "/Department/css/bootstrap.css" rel = "stylesheet">
	<script src = "/Department/js/jquery.1.9.min.js" ></script>
	<script src = "/Department/js/bootstrap.js" ></script>
</head>
	<body>
<!-- 		<div style="text-align: center;"> -->
<!-- 			<h1>xxxxxxxxxxxxxx</h1> -->
<!-- 		</div> -->
	<div class="jumbotron">
		<h2 style="text-align: center;">欢迎登录部门管理系统</h2>
		<!-- 设置当前界面的信息	 -->
		<div class="container">
			<form method = "post" action = "/Department/LoginServlet">
				<div class="form-group">
					<label for="exampleInputEmail1">用户名：</label>
					<input type="text" class="form-control" name = "username" placeholder="请输入账号">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码：</label>
					<input type="password" class="form-control" name = "password" placeholder="请输入密码">
				</div>
				<div>
			  		<input type="submit" value="登录" class="btn btn-info"/>
			  		<input type="submit" onclick = 'fun1()' value="注册" class="btn btn-info"/>
			  		<input type="submit" value="忘记密码" class="btn btn-info"/>
			  	</div>
			</form>
		</div>
		
		<!-- 注册按钮的触发事件，跳转到zhuce.jsp中-->
		<script>
			function fun1(){
				//点击注册后，跳转到zhuce.jsp
				window.open("/Department/zhuce.jsp");
			}
		</script>
	</div>
	</body>
</html>