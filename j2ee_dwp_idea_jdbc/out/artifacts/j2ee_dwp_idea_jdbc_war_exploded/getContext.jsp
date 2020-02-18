<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getContent</title>
</head>
<body>
    <%=pageContext.getAttribute("name")%>
    <%=request.getAttribute("name")%>
<%=application.getAttribute("name")%>
</body>
</html>
