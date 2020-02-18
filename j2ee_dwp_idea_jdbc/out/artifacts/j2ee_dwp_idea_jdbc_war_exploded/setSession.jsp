<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie"%>
<html>
<head>
    <title>setSession</title>
</head>
<body>
    <%
        session.setAttribute("name","teemo");
    %>
<a href="<%=response.encodeURL("getSession.jsp")%>">跳转到获取session的页面</a>
</body>
</html>
