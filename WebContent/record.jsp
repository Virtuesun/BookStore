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
* {
	font-family: "微软雅黑";
}

#record {
	width: 90%;
	margin: 0 auto;
}

footer {
	margin-top: 80px;
}

footer ul {
	text-align: center;
	list-style-type: none;
}

footer ul li {
	display: inline;
	margin-left: 10px;
}

img {
	width: 100px;
	height: 140px;
}

h1 {
	text-align: center;
}
</style>
</head>
<!-- 购物车组成：图片，商品名，商品ID，数量，卖家，买家 -->
<body>
	<div id="record">
		<h1>销售记录</h1>
		<hr>
		<table class="table table-striped">
			<tr>
				<th>商品</th>
				<th>名称</th>
				<th>价格</th>
				<th>数量</th>
				<th>销售额</th>
				<th>库存</th>
			</tr>
			<tr>
				<td><img src="./images/02.jpg"></td>
				<td>《莎士比亚》</td>
				<td>$300</td>
				<td>30</td>
				<td>$9000</td>
				<td>50</td>
			</tr>

			<tr>
				<td colspan="6"><label>销售总额：<span>$18000</span></label></td>
			</tr>
		</table>
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
</body>
</html>