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
<form method="post" action="/menu/input">

    <div>
        <input type="text" name="MenuTitle" placeholder="메뉴를 입력해주세요">
    </div>
    <div>
        <input type="date" name="dueDate">
    </div>
    <div>
        <button type="reset">초기화</button>
        <button type="submit">작성</button>
    </div>
</form>
</body>
</html>
