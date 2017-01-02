<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>购物车</title>

    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <style type="text/css">
      *{
        font-family: "微软雅黑";
        
      }
      body{
        padding-bottom: 30px;
      }
      #cart{
        width: 90%;
        text-align: center;
        margin:0 auto;
      }
      img{
        width:100px;
        height:140px;
      }
      td{
        vertical-align: middle;
        font-size: 20px;
      }
      .total{
        margin-top: 20px;
        width: 200px;
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
    </style>
  </head>
  <!-- 购物车组成：图片，商品名，商品ID，数量，卖家，买家 -->
  <body>
    <div id="cart">
    <h1>购物车</h1>
        <hr>
      <table class="table table-striped">
        <tr>
        <th><input type="checkbox" name="" id="chooseall"><label for="chooseall">全选</label></th>
        <th>商品</th>
        <th>名称</th>
        <th>价格</th>
        <th>数量</th>
        <th>删除</th>
        </tr>
        <tr>
          <td><input type="checkbox" name=""></td>
          <td><img src="./images/01.jpg"></td>
          <td>《福尔摩斯》</td>
          <td>￥200</td>
          <td>3</td>
          <td><button class="btn btn-warning">delete</button></td>
        </tr>
        <tr>
          <td><input type="checkbox" name=""></td>
          <td><img src="./images/01.jpg"></td>
          <td>《福尔摩斯》</td>
          <td>￥200</td>
          <td>3</td>
          <td><button class="btn btn-warning">delete</button></td>
        </tr>
      </table>
      <button class="btn btn-danger total">结算</button>
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
  </body>
</html>