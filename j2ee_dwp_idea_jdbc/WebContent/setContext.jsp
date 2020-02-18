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
    <title>setContent</title>
</head>
<body>
<%
    pageContext.setAttribute("name","gareen");
    request.setAttribute("name","teemo");
    application.setAttribute("name","Veigar");
    request.getServletContext().setAttribute("name","Vector");
%>
<%=pageContext.getAttribute("name")%>
<jsp:forward page="getContext.jsp"></jsp:forward>
</body>
</html>
