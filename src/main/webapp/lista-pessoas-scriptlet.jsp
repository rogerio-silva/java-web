<%@ page import="br.com.numbersapp.dao.PessoaDAO" %>
<%@ page import="br.com.numbersapp.model.Pessoa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: rogerio
  Date: 19/09/2024
  Time: 01:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Listagem de Pessoas</title>
</head>
<body>
    <table>
        <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>e-mail</th>
            <th>Celular</th>
            <th>Aniversário</th>
            <th>Integração</th>
            <th>Curso</th>
        </tr>
        <% PessoaDAO pessoaDAO = new PessoaDAO();
           List<Pessoa> pessoas = pessoaDAO.findAll(); %>
        <% for (Pessoa pessoa : pessoas) { %>
            <tr>
                <td><%= pessoa.getNome() + " " + pessoa.getSobrenome() %></td>
                <td><%= pessoa.getCpf() %></td>
                <td><%= pessoa.getEmail() %></td>
                <td><%= pessoa.getNumerocelular() %></td>
                <td><%= pessoa.getDataaniversario() %></td>
                <td><%= pessoa.getDataintegracao() %></td>
                <td><%= pessoa.getCurso() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
