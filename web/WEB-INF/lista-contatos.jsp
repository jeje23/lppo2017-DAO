

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Contatos</title>
    </head>
    <body>
         <%@include file="jspf/menu.jspf" %>
        <h1>Lista de contatos</h1>
        <div style ="color: red;">${mensagem}</div>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Telefone</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contato" items="${contatos}">
                    <tr>
                        <td><a href="detalhes.html?id=${contato.id}"> ${contato.id}</td>
                        <td>${contato.nome}</td>
                        <td>${contato.sobrenome}</td>
                        <td>${contato.telefone}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
