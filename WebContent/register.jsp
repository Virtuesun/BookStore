<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register.jsp</title>
</head>
<body>
<form action="RegisterServlet.action" method="post">
<input type="text" name="username" placeholder="username">
<input type="text" name="showname" placeholder="showname">
<input type="password"  name="password">
<input type="text" name="captcha" placeholder="验证码">
<img id="captchaImg" src="CaptchaServlet.action" />
<input type="submit" value="注册">
</form>
error_username:<%=request.getAttribute("error_username")%><br />
error_showname:<%=request.getAttribute("error_showname")%><br />
error_password:<%=request.getAttribute("error_password")%><br />
error_captcha:<%=request.getAttribute("error_captcha") %><br />
message:<%=request.getAttribute("message")%><br />
</body>
</html>