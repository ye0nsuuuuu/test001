<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP-Model2(MVC)-lunchmenuUpd</title>
</head>
<body>
<h1><%= "임시 lunchmenu 수정폼 화면." %>
</h1>
<form method="post" action="/lunchmenu/update">
  <div>
    <%--   화면에서, EL 표기법 ${sample.title} --%>
    <%--    -> 서버에 sample.getTitle()동일한 효과--%>
    <input type="text" name="menuTitle" placeholder="제목을 입력해주세요." value="${sample.menuTitle}" >
  </div>
  <div>
    <input type="date" name="menuRegDate" value="${sample.menuRegDate}" >
  </div>

  <div>
    <%--    몰래 tno 번호를 서버에 넘기기, 사용자는 볼수 없음.--%>
    <input type="hidden" name="menuNo" value="${sample.menuNo}">
    <button type="submit">수정하기</button>
  </div>
</form>

<%--삭제--%>
<form method="post" action="/lunchmenu/delete">
  <%--  화면에는 안보임. --%>
  <input type="hidden" name="menuNo" value="${sample.menuNo}">
  <button type="submit">삭제하기.</button>
</form>

<form method="get" action="/lunchmenu/list">
  <button type="submit">전체메뉴</button>
</form>
</body>
</html>
