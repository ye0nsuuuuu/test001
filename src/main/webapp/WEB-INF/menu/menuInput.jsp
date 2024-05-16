<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 5. 16.
  Time: 오후 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MenuInput</title>
</head>
<body>
<h1><%= "임시 MenuInput 화면." %>
</h1>
<form method="post" action="/menu/input ">
    <input type="text" name="menu1" placeholder="메뉴1 입력해주세요">
    <input type="text" name="menu2" placeholder="메뉴2 입력해주세요">
    <button type="submit">임시 menu 등록</button>
</form>
</body>
</html>
