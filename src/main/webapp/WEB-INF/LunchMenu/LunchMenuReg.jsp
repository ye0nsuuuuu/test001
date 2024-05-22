<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP-Model2(MVC)-todoReg</title>
</head>
<body>
<h1><%= "임시 lunchmenuReg 화면." %>
</h1>
<form method="post" action="/lunchmenu/register">
  <div>
    <input type="text" name="MenuTitle" placeholder="제목을 입력해주세요.">
  </div>
  <div>
    <input type="date" name="MenuRegDate">
  </div>
  <div>
    <button type="reset">초기화</button>
    <button type="submit">작성</button>
  </div>
</form>
</body>
</html>
