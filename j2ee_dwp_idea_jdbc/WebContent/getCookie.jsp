<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>getCookie</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    if(null!=cookies){
        for(int d=0;d<=cookies.length-1;d++){
            out.print(cookies[d].getName()+":"+cookies[d].getValue()+"<br>");
        }
    }
%>
</body>
</html>
