<%--
  Created by IntelliJ IDEA.
  User: koooooooo5
  Date: 2020/10/7
  Time: 09:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form role="form" action = "/form_login" method="post">
    账号：<input type="text" id="user_name" name = "user_name"> <br>
    密码：<input type="password" id = "user_password" name = "user_password"> <br>
    <input type="submit" id = "login" value = "login">
</form>
</body>
</html>
