<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/14
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    application.setAttribute("test", 1);
    application.setAttribute("test", 2);
    application.removeAttribute("test");
    session.setAttribute("test", 1);
    session.setAttribute("test", 2);
    session.removeAttribute("test");
    request.setAttribute("test", 1);
    request.setAttribute("test", 2);
    request.removeAttribute("test");
%>
</body>
</html>
