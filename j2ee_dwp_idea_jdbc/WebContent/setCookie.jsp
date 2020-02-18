<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Cookie</title>
</head>
<body>
    <%
        Cookie c = new Cookie("name","Gareen");
        c.setMaxAge(24*60*60);
        c.setPath("/");
        response.addCookie(c);
    %>
    <a href="getCookie.jsp">跳转到获取cookie的页面</a>
</body>
</html>
