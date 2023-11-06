<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8"%>
<head>
    <meta charset="UTF-8">

    <title>Document</title>
</head>
<body>
    <div>
        <form action="/src/subPage.jsp">
        ID: <input type="text" name="id">
        PASSWORD: <input type="text" name="password">
        <button type="submit">로그인</button>
        </form>
    </div>

    ID는 <%= session.getAttribute("id")%>
    PASSWORD는 <%= session.getAttribute("password")%>

    <% if (session.getAttribute("id").equals("sm201") && session.getAttribute("password").equals("sm201!234"))
            out.println("로그인 성공");
        else { out.println("로그인 실패");  
        }
    %>
</body>
</html>
