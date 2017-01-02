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
      #grounding{
        width: 90%;
        margin:0 auto;
      }
      table{
        text-align: center;
      }
      h1{
        text-align: center;
      }
      .ok{
        width: 200px;
        text-align: center;
      }
      .footer-hr{
        margin-top: 100px;
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
    </style>
  </head>
  <!-- 购物车组成：图片，商品名，商品ID，数量，卖家，买家 -->
  <body>
    <div id="grounding">
      <h1>商品上架</h1>
      <hr>
      <form action="Auth/AddCommodity.action" enctype="multipart/form-data" method="post">
      <table class="table table-striped">
      <tr>
        <td><label>图片:</label></td>
        <td><input type="file" name="image"/></td>
        <td><label>书名:</label></td>
        <td><input type="text" name="bookName"/></td>
        <td><label>标题:</label></td>
        <td><input type="text" name="title"/></td>
        <td><label>描述:</label></td>
        <td><input type="text" name="description"/></td>
      </tr>
      <tr>
        <td><label>价格:</label> </td>
        <td><input type="text" name="price"/></td>
        <td><label>数量:</label> </td>
        <td><input type="text" name="number"/></td>
        <td><label>作者:</label></td>
        <td><input type="text" name="author"/></td>
        <td><label>出版社:</label> </td>
        <td><input type="text" name="press"/></td>
      </tr>
        
      <tr>
        <td><label>出版日期:</label></td>
        <td><input type="text" name="press_date"/></td>
        <td><label>ISBN:</label></td>
        <td><input type="text" name="isbn"/></td>
        <td><label>版本:</label> </td>
        <td><input type="text" name="version"/></td>
        <td><label>页数:</label></td>
        <td><input type="text" name="pages"/></td>
      </tr>
      <tr>
        <td><label>字数:</label> </td>
        <td><input type="text" name="words"/></td>
        <td><label>开本:</label> </td>
        <td><input type="text" name="size"/></td>
        <td><label>纸张:</label></td>
        <td><input type="text" name="paper"/></td>
        <td><label>类别:</label></td>
        <td><input type="text" name="categories"/></td>
      </tr>
      <tr>
        <td colspan="8"><label><input type="submit" value="上架" class="btn btn-warning ok" /></label></td>
      </tr>  
        
      </table>
      </form>
    </div>



      <hr class="footer-hr">
      
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