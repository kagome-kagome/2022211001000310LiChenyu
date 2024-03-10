<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2024/3/10
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="https://www.ecjtu.edu.cn/">go to ecjtu</a>
<form>
    Name:<input type="text" name="name"><br/>
    ID:<input type="text" name="id"><br/>
    Email:<input type="text" name="Email"><br/>
    <label for="male">Male</label>
    <input type="radio" id="male" name="gender" value="male">

    <label for="female">Female</label>
    <input type="radio" id="female" name="gender" value="female"><br/>
    Date of birth:<input type="text" name="birthday"><br/>
    <input type="submit" value="Send data to server"/>
</form>
</body>
</html>
