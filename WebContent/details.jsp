<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>商品详情</title>

    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
      *{
        font-family: "微软雅黑";
      }
      body{
        padding-top: 60px;
      }
      #content{
        max-width: 900px;
        height:500px;
        
        margin: 0 auto;
        text-align: center;
      }
      img{
        float: left;
        margin-left: 50px;
        margin-top: 10px;
      }
      #details{
        margin-top: 70px;
      }
      .introduce{
        margin-left: 50px;
      }
      .price{
        font-size: 20px;
        color:red;
      }
      table{
        margin:0 auto;
      }
      table tr td{
        text-align: left;
        width:200px;
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
        <li><a href="#">登录</a></li>
        <li class="active"><a href="#">注册</a></li>
        <li class="dropdown"><a href="#">购物车</a>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



  <div id="content">
    <img src="./images/04.jpg">
    <h1>小鸡球球触感玩具书：全5册</h1>
    <p class="introduce">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;触摸书只是摸一摸还不够，其实可以更好玩！和畅销百万册的小鸡球球一起玩触摸游戏，1种发声器+5种互动游戏+14种模切洞洞+ 28种触摸材料，以发展触感为主，其他感官为辅，助力早期认知发展！心喜阅童书出品</p><p><span>作者：[日]入山 智/著绘，崔维燕/译</span><span>出版社:长江少年儿童出版社</span></p>
    <p class="price">价格:¥125.00</p>
    <button class="btn btn-warning">加入购物车</button>
    <button class="btn btn-danger">立即购买</button>
    <div id="details">
      <h1>商品详情</h1>
      <hr>
      <table>
        <tr>
          <td><span>图书ISBN：</span><span>24105221</span></td>
          <td><span>版次：</span><span>1</span></td>
          <td><span>页数：</span><span>500</span></td>
        </tr>
        <tr>
          <td><span>字数：</span><span>200万</span></td>
          <td><span>印刷时间：</span><span>2015-09-08</span></td>
          <td><span>开本：</span><span>48开</span></td>
        </tr>
        <tr>
          <td><span>纸张：</span><span>胶版纸</span></td>
        </tr>
      </table>
    </div>
  </div>



      <script src="./js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>