<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册界面</title>
	<!-- 导入css与js包 -->
	<link href="/Department/css/bootstrap.css" rel="stylesheet">
	<script src="/Department/js/jquery.1.9.min.js"></script>
	<script src="/Department/js/bootstrap.js"></script>
</head>
	<body>
		<div class="jumbotron">
			<h1 style="text-align: center;">Hello, WelCome!</h1>
			<div class="container">
			<form method = "post" action = "/Department/ZhuCeServlet">
				<div class="form-group">
					<label for="exampleInputEmail1">用户名：</label>
					<input type="text" class="form-control" name="username" placeholder="请输入账号">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码：</label>
					<input type="password" class="form-control" name="password" placeholder="请输入密码">
				</div>
				<div>
			  		<input type="submit" onclick = 'fun1()' value="注册" class="btn btn-info"/>
			  		<input type="submit" onclick = 'fun2()' value="返回" class="btn btn-info"/>
			  	</div>
			</form>
		</div>
		</div>
		<script>
			function fun1(){
				//弹出提示
				alert("注册成功！")
				//跳转到登录界面
				window.open("/Department/Login.jsp");
			}
			function fun2(){
//  			alert("注册成功！")
// 				window.open("/Department/Login.jsp");
				//返回到上一次浏览的页面
				history.back(-1);
			}
		</script>
</body>
</html>