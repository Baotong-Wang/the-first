<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>删除职工界面</title>
	<link href = "/Department/css/bootstrap.css" rel = "stylesheet">
	<script src = "/Department/js/jquery.1.9.min.js" ></script>
	<script src = "/Department/js/bootstrap.js" ></script>
</head>
	<body>
		<div>
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header"	 >
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        				<span class="sr-only">Toggle navigation</span>
       					<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
      					</button>
						<a class="navbar-brand" href="#" onclick = 'fun1()'>返回</a>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li>
								<a href="/Department/DeptIntroduce.jsp">部门介绍 </a>
							</li>
							<li>
								<a href="/Department/workers.jsp">员工信息<span class="sr-only">(current)</span></a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">员工管理<span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li>
										<a href="/Department/addworkers.jsp">新增员工信息</a>
									</li>
									<li>
										<a href="/Department/deleteworkers.jsp">删除员工信息</a>
									</li>
									<li>
										<a href="/Department/modifyworkers.jsp">修改员工信息</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="/Department/OnDuty.jsp">查询当日值日人员</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="/Department/InstallOnDuty.jsp">设置值日人员</a>
									</li>
								</ul>
							</li>
							<li class="dropdown">
								<a  href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">部门管理<span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li class="active">
										<a href="/Department/add.jsp">新增部门信息</a>
									</li>
									<li>
										<a href="/Department/delete.jsp">删除部门信息</a>
									</li>
									<li>
										<a href="/Department/select.jsp">查询部门信息</a>
									</li>
									<li>
										<a href="/Department/modify.jsp">修改部门信息</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="/Department/PersonAdmin.jsp">查询管理人员</a>
									</li>
								</ul>
							</li>
						</ul>
						<form class="navbar-form navbar-left">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="点击一下，你就知道">
							</div>
							<button type="submit" class="btn btn-default">搜索</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li style="width: 25%;">
								<a href="#" >→</a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">关于我们 <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">系统简介</a>
									</li>
									<li>
										<a href="#">帮助文档</a>
									</li>
									<li>
										<a href="/Department/Login.jsp">退出</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid -->
			</nav>
		</div>
		<!-- 显示内容数据 -->
	 	<div class = "container">
	 		<table id="t1" class="table table-hover">
	 			<tr>
	 				<td>编号</td>
	 				<td>姓名</td>
	 				<td>年龄</td>
	 				<td>性别</td>
	 				<td>联系电话</td>
	 				<td>所属部门</td>
	 			</tr>
			</table>
		</div>
		<!-- 我们需要用到当前的jQuery对象，进行数据的访问，通过AJAX -->
	 	<script type="text/javascript">
	 		
	 		//通过ajax去请求服务器，获取对应的员工信息数据
	 		$.post("/Department/WorlersServlet",function(data){
	 			//第一步：将字符串封装成集合对象
	 			var json = eval("(" + data + ")");
	 			//循环遍历的里面
	 			for(var i = 0; i < json.length; i++){
	 				//第二步：将一个个的集合对象内容，封装到表格当中
		 			$("#t1").append("<tr><td>" 
		 					+ json[i].yid + "</td><td>"
		 					+ json[i].wname + "</td><td>"
		 					+ json[i].wage + "</td><td>"
		 					+ json[i].wsex + "</td><td>"
		 					+ json[i].wtel + "</td><td>"
		 					+ json[i].dept + "</td><td>"
		 					+ "<button onclick='del("+json[i].yid+")' class='btn btn-link'>删除</button></td></tr>");
	 			}
	 		});
	 		
	 		function del(id){
	 			//通过异步请求，AJAX删除当前的操作
	 			$.post("/Department/DeleteWorkersServlet",{"yid":id},function(data){
	 				//提示删除编号为id的员工
	 				alert( "员工编号为"+ id + "已被删除！");
	 				//重新刷新一下界面
	 				window.location.reload();
	 			});
	 		}
	 		function fun1(){
	 			//返回到上一次浏览的页面
				history.back(-1);
			}
	 	</script>
	</body>
</html>