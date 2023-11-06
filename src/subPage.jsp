<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8"%>
<head>
    <meta charset="UTF-8">

    <title>Document</title>
</head>
<body>
<%
    session = request.getSession();

    session.setAttribute("id", request.getParameter("id"));
     session.setAttribute("password", request.getParameter("password"));
%>

<button type="button" onclick=location.href="/src/test.jsp">홈으로</button>
</body>
</html>