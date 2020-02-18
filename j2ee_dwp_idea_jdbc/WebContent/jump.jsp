<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jump</title>
</head>
<body>
    <%
        request.getRequestDispatcher("hello.jsp").forward(request,response);
    %>
</body>
</html>
