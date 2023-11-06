<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="java.sql." import="database.DBConnection"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("pw");
    String sql = "SELECT from user where id = ? and password = ?";

    try {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = conn.preparedStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,password);
        ResultSet result = pstmt.executeQuery();

        while(result.next()){
            out.print(result.getString("name"));
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }


%>
</body>
</html>