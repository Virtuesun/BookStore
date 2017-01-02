<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>個人信息</title>

    <link href="/BookStore/css/bootstrap.min.css" rel="stylesheet">
    
    <style type="text/css">
      *{
        font-family: "微软雅黑";
      }
       
      #selfInfo{
        margin-top: 100px;
        text-align: center;
        width: 100%;
        height: auto;
        
      }
      #info-box{
        margin-top: 200px;
        width: 300px;
        height: 400px;
        background-color: rgb(255,251,240);
        margin: 0 auto;
        border-radius: 5px;
        box-shadow: 0 0 8px 0;
      }
      input{
        outline:none;
      }
      input,textarea{
        border-radius: 5px;
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
    <body>
      
      <div id="selfInfo">
        <div id="info-box">
        <h1>个人信息</h1>
        <hr>
        <jsp:useBean id="login" class="com.bookstore.entity.User" scope="session"></jsp:useBean>
       
        <form action="Auth/UpdateUserInfo.action" method="post">
        <table class="table table-striped">
          <tr>
            <td><label>用户名：</label></td>
            <td><input type="text" name="" value=${login.username }></td>
          </tr>
          <tr>
            <td><label>昵称：</label></td>
            <td><input type="text" name="showname" value=${login.showname }></td>
          </tr>
          <tr>
            <td><label>邮箱：</label></td>
            <td><input type="email" name="email" value=${login.email }></td>
          </tr>
          <tr>
            <td><label>地址：</label></td>
            <td><textarea name="address">${login.address }</textarea></td>
          </tr>
          <tr>
            <td colspan="2"><input type="submit" class="btn btn-primary" value="保存"></td>
          </tr>
        </table>
         </form>
        </div>
      </div>

      <hr>
      
 
      <footer>
        <ul>
          <li>Copyright©617store</li>
          <li>2016-2018</li>
          <li>All Rights Reserved</li>
        </ul>
      </footer>

      <script src="/BookStore/js/jquery-3.1.1.min.js"></script>
      <script src="/BookStore/js/bootstrap.min.js"></script>
    </body>
  </html>