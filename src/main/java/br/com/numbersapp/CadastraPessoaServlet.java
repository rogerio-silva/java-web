package br.com.numbersapp;

import br.com.numbersapp.dao.PessoaDAO;
import br.com.numbersapp.infra.ConnectionFactory;
import br.com.numbersapp.model.Curso;
import br.com.numbersapp.model.Pessoa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(urlPatterns = {"/cadastraPessoa"})
public class CadastraPessoaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String numerocelular = req.getParameter("numerocelular");
        String dataaniversario = req.getParameter("dataaniversario");
        String dataintegracao = req.getParameter("dataintegracao");
        String curso = req.getParameter("curso");

        Pessoa pessoa = new Pessoa(nome, sobrenome, cpf, email, numerocelular,
                LocalDate.parse(dataaniversario, DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                LocalDate.parse(dataintegracao, DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                Curso.valueOf(curso));
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.save(pessoa);

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<p>Pessoa cadastrada com sucesso!</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
