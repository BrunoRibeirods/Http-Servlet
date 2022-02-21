<%@ page import="com.example.demo1.model.ClienteModel" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <%
            List<ClienteModel> clientesList = (List<ClienteModel>) request.getAttribute("clientes");
            for (ClienteModel cliente: clientesList) {
        %>
        <li><%=cliente.getNome()%></li>
        <%}%>
    </ul>
</body>
</html>
