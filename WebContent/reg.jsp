<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册</title>

    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
      *{
        font-family: "微软雅黑";
      }
      body{
        padding-top: 50px;
        padding-bottom: 30px;
      }
      input{
        outline: none;
      }
      label{
        font-size: 8px;
        color:red;
        
      }
      #reg-box{
        width: 100%;
        height: auto; 
        text-align: center;
      }
      .reg-items{
        display: block;
        margin:0 auto;
        border: 1px solid #00a1d6;
        width:300px;
        height:40px;
        border-radius: 5px;
        margin-top: 10px;
      }
      #checkcode-box{
        width: 300px;
        height: 40px;
        margin: 0 auto;
      }
      .checkcode{
        width: 200px;
        float: left;
      }
      .select{
        margin:10px 0px;
      }
      img{
        width: 90px;
        height: 40px;
        margin-top: 10px;
      }
      footer{
        margin-top: 40px;
      }
      footer ul {
        text-align: center;
        list-style-type: none;
      }
      footer ul li{
        display:inline;
        margin-left: 10px;
      }
      .checkcode-img{
        width:60px;
        height:20px;
        margin-top:30px;
        margin-left:20px;
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
        <li><a href="index.jsp">登录</a></li>
        <li class="active"><a href="#">注册</a></li>
        <li class="dropdown"><a href="#">购物车</a>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


  <div id="reg-box">
    <h1>注册</h1>
    <hr>
    <form action="RegisterServlet.action" method="post">
    <input type="text" name="username" class="reg-items" placeholder="用户名">
    <jsp:useBean id="user" class="com.bookstore.entity.User"></jsp:useBean>
    <label>${error_username }</label>
    <input type="text" name="showname" class="reg-items" placeholder="昵称">
    <label>${error_showname }</label>
    <input type="password" name="password" class="reg-items" placeholder="密码">
    <label>${error_password }</label>
    <input type="password" name="" class="reg-items" placeholder="确认密码">
    <label>${error_password }</label>
    <input type="email" name="email" class="reg-items email" placeholder="邮箱">
    <label>${error_email }</label>
    <select class="select" name="sex">
      <option value="男">男</option>
      <option value="女">女</option>
    </select>
    <select id="type" class="select" name="role">
      <option value="买家">买家</option>
      <option value="卖家">卖家</option>
    </select>
    <div id="checkcode-box">
      <input type="text" name="captcha" placeholder="checkcode" class="reg-items checkcode">
      <img src="CaptchaServlet.action">
    </div>
    <label>${ error_captcha}</label>

    <section>
      <h3>《617公约》</h3>
          <input type="checkbox" value="1" id="checkboxInput" name="" />
          <label for="checkboxInput"></label>
    </section>

    <input type="submit" name="" class="reg-items btn btn-primary save" value="保存">
    </form>
  </div>

    <hr>
      
      <footer>
        <ul>
          <li>Copyright©617store</li>
          <li>2016-2018</li>
          <li>All Rights Reserved</li>
        </ul>
      </footer>

    <script src="./js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="./js/myJquery.js"></script>
  </body>
  </html>