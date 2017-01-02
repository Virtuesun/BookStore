<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>617Store</title>

    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    	body{
	    	font-family: "微软雅黑";
	    	padding-top: 50px;
	    	padding-bottom: 50px;
    	}
    	.carousel{
    		height:500px;
    		background-color: #000;
    		margin-bottom: 30px;
    	}
    	.carousel .item{
    		height:500px;
    		background-color: #000;
    	}
    	.carousel .item img{
    		width:100%;
    	}
    	.nav-tabs li a{
    		font-size: 20px;
    		color: black;
    	}
    	.container-fluid{
    		margin-top: 40px;
    	}
    	.container-fluid .col-md-3{
    		text-align: center;
    	}
    	.col-md-3:hover{
    		color:red;
    	}
    	footer{
    		margin-top: 100px;
    	}
    	footer ul {
    		text-align: center;
    		list-style-type: none;
    	}
    	footer ul li{
    		display:inline;
    		margin-left: 10px;
    	}
    	#login-box{
    		width:300px;
    		height: 200px;
    		background-color: #333;
    		text-align: center;
    		opacity:0.9;
    		position: absolute;
    		top:51px;
    		left:-300px;
    		transition: left,0.5s;
    		border-radius: 0 0 50% 0;
    	}
    	.login-item{
    		width:200px;
    		margin-top: 20px;
    	}
      .error{
      width:200px;
        height:20px;
        margin-top: 10px;
        color:red;
      }
      .submit{
        margin-top: 0px;
      }
    	.mask{
    		position: fixed;
    		left: 0px;
    		right: 0px;
    		top: 0px;
    		bottom: 0px;
    		background-color: rgba(0,0,0,0.3);
    		display: none;
    	}
    	.back-to-top{
    		position: fixed;
    		bottom: 30px;
    		right: 30px;
    		background-color: #333;
    		color: white;
    		border:1px solid #888;
    	}
      .warning{
        color:red;
        margin-left: 5px;
        width: 20px;
        height: 20px;
      }
      .dropdown{
        display: none;
      }
    </style>
  </head>
  <body>
 <nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">617Store</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#" id="login-btn">登录</a></li>
        <li><a href="reg.jsp">注册</a></li>
        <li class="dropdown"><a href="cart.jsp">购物车</a></li>


        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">用户操作 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="selfInfo.jsp">个人信息</a></li>
            <li><a href="#" class="exit">退出登录</a></li>
          </ul>
        </li>



      </ul>
      <form class="navbar-form navbar-left" role="search" action="SearchServlet.action" method="get">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



<!-- 图片轮播 -->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="./images/0.jpg" alt="...">
      <div class="carousel-caption">
        ONE PIECE
      </div>
    </div>
    <div class="item">
      <img src="./images/1.jpg" alt="...">
      <div class="carousel-caption">
        ONE PIECE
      </div>
    </div>
    <div class="item">
      <img src="./images/2.jpg" alt="...">
      <div class="carousel-caption">
        ONE PIECE
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>



	<!-- 导航 -->
	<ul class="nav nav-tabs nav-justified" role="tablist">
	  <li class="active"><a href="#wenyi" role="tab" data-toggle="tab">文艺</a></li>
	  <li><a href="#shenghuo" role="tab" data-toggle="tab">生活</a></li>
	  <li><a href="#jiaoyu" role="tab" data-toggle="tab">教育</a></li>
	  <li><a href="#keji" role="tab" data-toggle="tab">科技</a></li>
	  <li><a href="#tongshu" role="tab" data-toggle="tab">童书</a></li>
	</ul>

	<div class="tab-content">
		<div class="tab-pane active" id="wenyi">
			<!-- 商品摆卖 -->
			<div class="container-fluid">
		  	  <div class="row">
			    <div class="col-md-3">
			    	<img src="./images/00.jpg">
			    	<h1>NO1</h1>
			    	<p>This is book one</p>
			    </div>
			  	<div class="col-md-3">
			  		<img src="./images/01.jpg">
			    	<h1>NO2</h1>
			    	<p>This is book two</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/02.jpg">
			    	<h1>NO3</h1>
			    	<p>This is book three</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/03.jpg">
			    	<h1>NO4</h1>
			    	<p>This is book four</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/04.jpg">
			    	<h1>NO5</h1>
			    	<p>This is book five</p>
			  	</div>
  	  		  </div>
			</div>
		</div>
		<div class="tab-pane" id="shenghuo">
		<!-- 商品摆卖 -->
			<div class="container-fluid">
		  	  <div class="row">
			    <div class="col-md-3">
			    	<img src="./images/00.jpg">
			    	<h1>NO1</h1>
			    	<p>This is book one</p>
			    </div>
			  	<div class="col-md-3">
			  		<img src="./images/01.jpg">
			    	<h1>NO2</h1>
			    	<p>This is book two</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/02.jpg">
			    	<h1>NO3</h1>
			    	<p>This is book three</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/03.jpg">
			    	<h1>NO4</h1>
			    	<p>This is book four</p>
			  	</div>
  	  		  </div>
			</div>
		</div>
		<div class="tab-pane" id="jiaoyu">
			<!-- 商品摆卖 -->
			<div class="container-fluid">
		  	  <div class="row">
			    <div class="col-md-3">
			    	<img src="./images/00.jpg">
			    	<h1>NO1</h1>
			    	<p>This is book one</p>
			    </div>
			  	<div class="col-md-3">
			  		<img src="./images/01.jpg">
			    	<h1>NO2</h1>
			    	<p>This is book two</p>
			  	</div>
			  	<div class="col-md-3">
			  		<img src="./images/02.jpg">
			    	<h1>NO3</h1>
			    	<p>This is book three</p>
			  	</div>
  	  		  </div>
			</div>
		</div>
		<div class="tab-pane" id="keji">
			<!-- 商品摆卖 -->
			<div class="container-fluid">
		  	  <div class="row">
			    <div class="col-md-3">
			    	<img src="./images/00.jpg">
			    	<h1>NO1</h1>
			    	<p>This is book one</p>
			    </div>
			  	<div class="col-md-3">
			  		<img src="./images/01.jpg">
			    	<h1>NO2</h1>
			    	<p>This is book two</p>
			  	</div>
  	  		  </div>
			</div>
		</div>
		<div class="tab-pane" id="tongshu">
			<!-- 商品摆卖 -->
			<div class="container-fluid">
		  	  <div class="row">
			    <div class="col-md-3">
			    	<img src="./images/00.jpg">
			    	<h1>NO1</h1>
			    	<p>This is book one</p>
			    </div>
  	  		  </div>
			</div>
		</div>
	</div>


<!-- 遮罩 -->
<div class="mask"></div>

<!-- 登录框 -->
	<div id="login-box">
		<form action="LoginServlet.action" method="post">
			<input type="text" name="username" class="login-item username" placeholder="用户名">

			<input type="password" name="password" class="login-item password" placeholder="密码">
      <label class="error">
      ${message}
      </label>
			<input type="submit" name=""  class="login-item submit btn btn-primary" value="登录">
		</form>
	</div>



	<hr>
	
	<footer>
		<ul>
			<li>Copyright©617store</li>
			<li>2016-2018</li>
			<li>All Rights Reserved</li>
      <li><a href="SearchServlet.action?keywords=自在独行" id="manage">后台管理</a></li>
		</ul>
	</footer>

	<button class="back-to-top">返回顶部</button>

    <script src="./js/jquery-3.1.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/myJquery.js"></script>
  </body>
</html>