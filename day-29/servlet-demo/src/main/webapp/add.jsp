<html>
<body bgcolor="#f5f5dc">
<%
int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));
out.println(i+j);
%>
</body>
</html>
