<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门介绍界面</title>
<link href="/Department/css/bootstrap.css" rel="stylesheet">
<script src="/Department/js/jquery.1.9.min.js"></script>
<script src="/Department/js/bootstrap.js"></script>
<style type="text/css">
.scrollspy-example {
	height: 200px;
	overflow: auto;
	position: relative;
}
</style>
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
	<div class="container">
		<!-- 轮播图整体框架 -->
		<div id="carousel-example-generic" class="carousel slide"
			data-ride="carousel">

			<!-- 轮播图的小圆点位置 -->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0"
					class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				<li data-target="#carousel-example-generic" data-slide-to="3"></li>
				<li data-target="#carousel-example-generic" data-slide-to="4"></li>
				<li data-target="#carousel-example-generic" data-slide-to="5"></li>
				<li data-target="#carousel-example-generic" data-slide-to="6"></li>
			</ol>

			<!-- 轮播图的每一张图片 -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="img/300.jpg">
				</div>
				<div class="item">
					<img src="img/301.jpg">
				</div>
				<div class="item">
					<img src="img/302.jpg">
				</div>
				<div class="item">
					<img src="img/303.jpg">
				</div>
				<div class="item">
					<img src="img/304.jpg">
				</div>
				<div class="item">
					<img src="img/305.jpg">
				</div>
			</div>

			<!-- 左右切换按钮位置 -->
			<a class="left carousel-control" href="#carousel-example-generic"
				role="button" data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#carousel-example-generic"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<script>
		function fun1(){
			//返回到上一次浏览的页面
			history.back(-1);
		}
	</script>
	<!-- 滚动窗格部分 -->
	<div class="container">
		<nav id="navbar-example" class="navbar navbar-default navbar-static"
			role="navigation">
		<div class="navbar-header">
			<button class="navbar-toggle" type="button" data-toggle="collapse"
				data-target=".bs-js-navbar-scrollspy">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">部门介绍</a>
		</div>
		<div class="collapse navbar-collapse bs-js-navbar-scrollspy">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#董事部">董事部</a></li>
				<li><a href="#人力资源部">人力资源部</a></li>
				<li><a href="#销售部">销售部</a></li>
				<li><a href="#技术部">技术部</a></li>
				<li><a href="#财务部">财务部</a></li>
				<li class="dropdown"><a href="#" id="navbarDrop1"
					class="dropdown-toggle" data-toggle="dropdown">查看更多 <b
						class="caret"></b></a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="navbarDrop1">
						<li><a href="#采购部" tabindex="-1">采购部</a></li>
						<li><a href="#客服部" tabindex="-1">客服部</a></li>
						<li class="divider"></li>
						<li><a href="#安保部" tabindex="-1">安保部</a></li>
					</ul></li>
			</ul>
		</div>
		</nav>

		<script type="text/javascript">
			var $$ = function(id) {
				return "string" == typeof id ? document.getElementById(id) : id;
			};

			function Event(e) {
				var oEvent = document.all ? window.event : e;
				if (document.all) {
					if (oEvent.type == "mouseout") {
						oEvent.relatedTarget = oEvent.toElement;
					} else if (oEvent.type == "mouseover") {
						oEvent.relatedTarget = oEvent.fromElement;
					}
				}
				return oEvent;
			}

			function addEventHandler(oTarget, sEventType, fnHandler) {
				if (oTarget.addEventListener) {
					oTarget.addEventListener(sEventType, fnHandler, false);
				} else if (oTarget.attachEvent) {
					oTarget.attachEvent("on" + sEventType, fnHandler);
				} else {
					oTarget["on" + sEventType] = fnHandler;
				}
			};

			var Class = {
				create : function() {
					return function() {
						this.initialize.apply(this, arguments);
					}
				}
			}

			Object.extend = function(destination, source) {
				for ( var property in source) {
					destination[property] = source[property];
				}
				return destination;
			}

			var GlideView = Class.create();
			GlideView.prototype = {
				//容器对象 容器宽度 展示标签 展示宽度
				initialize : function(obj, iHeight, sTag, iMaxHeight, options) {
					var oContainer = $$(obj), oThis = this, len = 0;

					this.SetOptions(options);

					this.Step = Math.abs(this.options.Step);
					this.Time = Math.abs(this.options.Time);

					this._list = oContainer.getElementsByTagName(sTag);
					len = this._list.length;
					this._count = len;
					this._height = parseInt(iHeight / len);
					this._height_max = parseInt(iMaxHeight);
					this._height_min = parseInt((iHeight - this._height_max)
							/ (len - 1));
					this._timer = null;
					this.Each(function(oList, oText, i) {
						oList._target = this._height * i;//自定义一个属性放目标left
						oList.style.top = oList._target + "px";
						oList.style.position = "absolute";
						addEventHandler(oList, "mouseover", function() {
							oThis.Set.call(oThis, i);
						});

					})

					//容器样式设置
					oContainer.style.height = iHeight + "px";
					oContainer.style.overflow = "hidden";
					oContainer.style.position = "relative";
					//移出容器时返回默认状态
					addEventHandler(
							oContainer,
							"mouseout",
							function(e) {
								//变通防止执行oList的mouseout
								var o = Event(e).relatedTarget;
								if (oContainer.contains ? !oContainer
										.contains(o)
										: oContainer != o
												&& !(oContainer
														.compareDocumentPosition(o) & 16))
									oThis.Set.call(oThis, -1);
							})
				},
				//设置默认属性
				SetOptions : function(options) {
					this.options = {//默认值
						Step : 20,//滑动变化率
						Time : 3,//滑动延时
						TextTag : "",//说明容器tag
						TextHeight : 0
					//说明容器高度
					};
					Object.extend(this.options, options || {});
				},
				//相关设置
				Set : function(index) {
					if (index < 0) {
						//鼠标移出容器返回默认状态
						this.Each(function(oList, oText, i) {
							oList._target = this._height * i;
							if (oText) {
								oText._target = this._height_text;
							}
						})
					} else {
						//鼠标移到某个滑动对象上
						this.Each(function(oList, oText, i) {
							oList._target = (i <= index) ? this._height_min * i
									: this._height_min * (i - 1)
											+ this._height_max;
							if (oText) {
								oText._target = (i == index) ? 0
										: this._height_text;
							}
						})
					}
					this.Move();
				},
				//移动
				Move : function() {
					clearTimeout(this._timer);
					var bFinish = true;//是否全部到达目标地址
					this.Each(function(oList, oText, i) {
						var iNow = parseInt(oList.style.top), iStep = this
								.GetStep(oList._target, iNow);
						if (iStep != 0) {
							bFinish = false;
							oList.style.top = (iNow + iStep) + "px";
						}
					})
					//未到达目标继续移动
					if (!bFinish) {
						var oThis = this;
						this._timer = setTimeout(function() {
							oThis.Move();
						}, this.Time);
					}
				},
				//获取步长
				GetStep : function(iTarget, iNow) {
					var iStep = (iTarget - iNow) / this.Step;
					if (iStep == 0)
						return 0;
					if (Math.abs(iStep) < 1)
						return (iStep > 0 ? 1 : -1);
					return iStep;
				},
				Each : function(fun) {
					for (var i = 0; i < this._count; i++)
						fun.call(this, this._list[i],
								(this.Showtext ? this._text[i] : null), i);
				}
			};
		</script>
		<style type="text/css">
#idGlideView {
	height: 100%;
	width: 100%;
	margin: 0 auto;
}

#idGlideView div {
	width: 100%;
	height: 100%;
}
</style>
		</head>
		<body>
			<div id="idGlideView">
				<div style="background-color: #87CEEB;">
					<h4 id="董事部">@董事部</h4>
					<p>《董事部》直接面向董事长。董事长是公司董事会的领导，公司的最高领导者。其职责具有组织、协调、代表的性质。董事长的权力在董事会职责范围之内，不管理公司的具体业务，一般也不进行个人决策，只在董事会开会或董事会专门委员会开会时才享有与其他董事同等的投票权。CEO的权力都来源于他，只有他拥有召开董事会，罢免CEO等最高权力，他掌握行政权力。
						董事长（Chairman）可以随时解除任何人的职务，除了董事（Member of the Board）和监事（Member of
						the Board of
						Supervisors），因为董事和监事不是公司雇员，而是公司的主人和仲裁人。还带领企业做出正确的战略战策，更好的完成工作任务。</p>
					<h4 id="人力资源部">@人力资源部</h4>
					<p>《人力资源部》主要是涉及人员的招聘、培训、定岗、考核、绩效、成长等各个方面，当然，很多电力企业在人力资源部门的工作人员不止一人，所以每个人负责若干人力资源的模块，如有人负责招聘和培训，有人负责绩效考核的制定及员工的学习及福利等。</p>
					<h4 id="销售部">@销售部</h4>
					<p>《销售部》就是阐述在不同的市场状态下、不同的市场阶段中如何因不同策略对应管理形式的问题，也就是说企业因不同的市场条件制订不同的策略，而不同的策略对应不同的管理形式。
						销售部是企业市场营销工作中满足市场需求的重要部门。企业在面对市场需求的时候，需要利用销售的手段满足市场的需求。但由于市场的需求方式、需求形态多种多样，也就造成了企业在销售行为的形式上、销售形态的管理上存在着不同的差异性。销售部门的成立与管理需要注意的是根据市场的形态制订相应的销售策略，而相应的策略达成也需要与之相匹配的管理形式才能实现。</p>
					<h4 id="技术部">@技术部</h4>
					<p>《技术部》负责对新产品的设计和开发的控制，编制各类技术文件；制定并组织实施施工工艺操作规程、技术标准，并在施工过程中对有关人员进行技术培训、技术指导和检查；对产品的技术指标和技术参数进行到位说明；和销售部门配合，对研发新品进行综合掌控。</p>
					<h4 id="财务部">@财务部</h4>
					<p>《财务部》是指在本机构一定的整体目标下，关于资产的购置（投资），资本的融通（筹资）和经营中现金流量（营运资金），以及利润分配的管理的部门。</p>
				</div>
				<div style="background-color: #F0E68C;">
					<h4 id="采购部">@采购部</h4>
					<p>《采购部》是公司中生产中负责生产物资采购的部门。</p>
					<h4 id="客服部">@客服部</h4>
					<p>《客服部》是直接面向客服的，客户的需求不断变化，通过回访不但了解不同客户的需求、市场咨询，还可以发现自身工作中的不足，及时补救和调整，满足客户需求，提高客户满意度。</p>
					<h4 id="安保部">@安保部</h4>
					<p>《安保部》是用来保证公司一切安全隐患能够得到解除。专责维持治安、出入境、海关管制、协助罪犯改过自新、协助滥用药物者戒毒，以及提供可靠的消防及紧急救援服务等。</p>
				</div>
			</div>

			<SCRIPT>
				var gv = new GlideView("idGlideView", 600, "div", 460, "");
			</SCRIPT>
		</body>

		<script src="js/jquery-2.0.3.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
</body>
</html>