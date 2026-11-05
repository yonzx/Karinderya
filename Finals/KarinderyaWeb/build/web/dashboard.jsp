<%@ page contentType="text/html;charset=UTF-8" %>
<%
  if (session.getAttribute("user") == null) {
      response.sendRedirect("login.jsp");
      return;
  }
%>
<html>
<head><title>Dashboard</title></head>
<body>
  <h2>Welcome, ${user.username}!</h2>
  <a href="#">Edit Menu</a> |
  <a href="#">Edit Employee</a> |
  <a href="#">Orders</a>
</body>
</html>