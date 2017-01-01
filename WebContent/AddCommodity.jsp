<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

<form action="AddCommodity.action" enctype="multipart/form-data" method="post">
   		<p>image：<input type="file" name="image"/></p> 
   		<p>bookName:<input type="text" name="bookName"/></p> 
   		<p>title:<input type="text" name="title"/></p> 
   		<p>description:<input type="text" name="description"/></p> 
   		<p>price:<input type="text" name="price"/></p> 
   		<p>number:<input type="text" name="number"/></p> 
   		<p>author:<input type="text" name="author"/></p> 
   		<p>press:<input type="text" name="press"/></p> 
   		<p>press_date:<input type="text" name="press_date"/></p> 
   		<p>isbn:<input type="text" name="isbn"/></p> 
   		<p>version:<input type="text" name="version"/></p> 
   		<p>pages:<input type="text" name="pages"/></p> 
   		<p>words:<input type="text" name="words"/></p> 
   		<p>size:<input type="text" name="size"/></p> 
   		<p>paper:<input type="text" name="paper"/></p> 
   		<p>categories:<input type="text" name="categories"/></p> 
   		<p><input type="submit" value="提交"/></p>
 </form>

</body>
</html>