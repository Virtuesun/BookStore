<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>
<form action="LoginServlet.action" method="post">
<input type="text" name="username" placeholder="username">
<input type="password"  name="password">
<input type="submit" value="登录">
</form>
message:<%=request.getAttribute("message")%>

</body>
</html>