package br.com.numbersapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/cadastraPessoaGET"})
public class CadastraPessoaGETServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String numerocelular = req.getParameter("numerocelular");
        String dataaniversario = req.getParameter("dataaniversario");
        String dataintegracao = req.getParameter("dataintegracao");
        String curso = req.getParameter("curso");

        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Pessoa Cadastrada</h1>");
        System.out.println("<p>Nome: " + nome + "</p>");
        System.out.println("<p>Sobrenome: " + sobrenome + "</p>");
        System.out.println("<p>CPF: " + cpf + "</p>");
        System.out.println("<p>Email: " + email + "</p>");
        System.out.println("<p>Número Celular: " + numerocelular + "</p>");
        System.out.println("<p>Data de Aniversário: " + dataaniversario + "</p>");
        System.out.println("<p>Data de Integração: " + dataintegracao + "</p>");
        System.out.println("<p>Curso: " + curso + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
