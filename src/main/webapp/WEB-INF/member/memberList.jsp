
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1><%= "임시 MemberList 화면. 임시 메인" %>
</h1>

<h1>JSTL 이용해서 반복문 출력해보기1.단순 반복문</h1>
<ul>
    <c:forEach var="dto" items="${list}">
        <li>
                ${dto}
        </li>
    </c:forEach>
</ul>
</body>
</html>
