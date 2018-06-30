<%--
  Created by IntelliJ IDEA.
  User: Mr.Admin
  Date: 29.06.2018
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form action="Registration" method="post">
    <table style="with: 50%">
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>E-Mail Adress</td>
            <td><input type="text" name="eMail" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" /></td>
        </tr>
        </table>
    <input type="submit" value="Registration" /></form>
</body>
</html>
