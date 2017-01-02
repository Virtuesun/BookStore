<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bookstore.entity.*" %>
<%@ page import="java.util.Vector" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>后台管理</title>

    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
      *{
        font-family: "微软雅黑";
      }
      #managePage{
        width: 90%;
        text-align: center;
        margin:0 auto;
      }
      a{
        color:white;
        text-decoration: none;
      }
      a:hover{
        text-decoration: none;
      }
      img{
        width:100px;
        height:140px;
      }
      footer{
        margin-top: 80px;
      }
      footer ul {
        text-align: center;
        list-style-type: none;
      }
      footer ul li{
        display:inline;
        margin-left: 10px;
      }
      .back-to-index{
        position: fixed;
        bottom: 30px;
        right: 30px;
        background-color: #00a1d6;
        border:1px solid #888;
        font-family: "微软雅黑";
      }
    </style>
 </head>
  <body>

  <div id="managePage">
   <h1>库存管理</h1>
      <hr>
    <table class="table table-striped">
     <tr>
      <th>商品</th>
      <th>名称</th>
      <th>价格</th>
      <th>数量</th>
      </tr>
      <tr>
        <td><img src="./images/02.jpg"></td>
        <td>《莎士比亚》</td>
        <td>$300</td>
        <td>300</td>
      </tr>
      <tr>
        <td><img src="./images/01.jpg"></td>
        <td>《福尔摩斯》</td>
        <td>$300</td>
        <td>300</td>
      </tr>
      <tr>
      <td colspan="4"><button class="btn btn-warning" onclick="javascript:window.location.href='grounding.jsp';">上架</button>
      <button class="btn btn-warning" onclick="javascript:;">下架</button>
      <button class="btn btn-warning" onclick="javascript:window.location.href='record.jsp';">销售记录</button>
      </td>
      </tr>
    </table>
    <jsp:useBean id="commodityItems" class="java.util.Vector" scope="request"></jsp:useBean>
      bookName: ${commodityItems[0].bookName }
      title: ${commodityItems[0].title }
      price: ${commodityItems[0].price }
      image: ${commodityItems[0].image }
      <img src="${commodityItems[0].image }">
  </div>
	

  <hr>
      
      <footer>
        <ul>
          <li>Copyright©617store</li>
          <li>2016-2018</li>
          <li>All Rights Reserved</li>
        </ul>
      </footer>

      <button class="back-to-index btn" onclick="javascript:window.location.href='index.jsp'">返回首页</button>

  <script src="./js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="./js/myJquery.js"></script>
  </body>
  </html>