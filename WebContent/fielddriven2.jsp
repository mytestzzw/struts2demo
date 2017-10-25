<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- field driven 1 -->
	账号1:<input type="text" value=${account} /><br/>
	密码1:<input type="password" value=${password} /><br/>
	<!-- field driven 2 -->
	账号2:<input type="text" value=${user.account} /><br/>
	密码2:<input type="password" value=${user.password} /><br/>
</body>
</html>