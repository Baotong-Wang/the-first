<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<head>
	<title>登录界面</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0)
		; }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- font files  -->
	<link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
	<!-- /font files  -->
	<!-- css files -->
	<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
	<!-- /css files -->
</head>
	<body>
	<h1>Please login first</h1>
	<div class="log">
		<div class="content1">
			<h2>员工部门管理系统</h2>
			<form method = "post" action = "/Department/LoginServlet">
				<input type="text" name="username" value="USERNAME" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'USERNAME';}">
				<input type="password" name="password" value="PASSWORD" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'PASSWORD';}">
				<div class="button-row">
					<input type="submit"  onclick = 'fun2()' class="sign-in" value="登录">
					<input type="reset" onclick = 'fun1()' class="reset" value="注册">
					<div class="clear"></div>
				</div>
			</form>
		</div>
		<!--
	    	作者：121777269@qq.com
	    	时间：2019-06-26
	    	描述：
	    
		<div class="content2">
			<h2>Sign Up Form</h2>
			<form>
				<input type="text" name="userid" value="USERNAME" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'NAME AND SURNAME';}">
				<input type="tel" name="usrtel" value="PHONE" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'PHONE';}">
				<input type="email" name="email" value="EMAIL ADDRESS" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'EMAIL ADDRESS';}">
				<input type="password" name="psw" value="PASSWORD" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'PASSWORD';}">
				<input type="submit" class="register" value="Register">
			</form>
		</div>
		-->
		<div class="clear"></div>
	</div>
	<div class="footer">
		<p>Copyright &copy; 2019.Company name All rights reserved.See more <a href="/Department/heihei.jsp" target="_blank" title="模板之家">王宝铜</a> </p>
	</div>
	<!-- 注册按钮的触发事件，跳转到zhuce.jsp中-->
		<script>
			function fun1(){
				//点击注册后，跳转到zhuce.jsp
				window.open("/Department/zhuce.jsp");
			}
		</script>

		<script type = "text/javascript">
			function fun2(){
				//点击注册后，跳转到home.jsp
				alert("登录成功！"),
				window.open("/Department/home.jsp");
// 				$.post("/Department/LoginServlet",function(data){
// 				alert(data);	
			}
			
		</script>
	</body>
	
</html>