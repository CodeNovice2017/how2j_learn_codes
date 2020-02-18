<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>getSession</title>
</head>
<body>
    <%
        String name = (String)session.getAttribute("name");
    %>
    session中的name:<%=name%>
</body>
</html>
