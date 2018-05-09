package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datautil.ConversaoData;
import entidade.Aluno;
import entidade.Endereco;
import persistencia.AlunoDAO;


@WebServlet("/ControleAluno")
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControleAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// cria a lista alunos no servlet, que recebe os dados
			// vindo da lista consultarAlunos
			List<Aluno> alunos = new AlunoDAO().consultarAlunosEnderecos();
				request.setAttribute("listaAluno", alunos);
				request.getRequestDispatcher("consulta.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Aluno a  = new Aluno(null,
								 request.getParameter("nome"),
								 request.getParameter("email"),
								 new ConversaoData().converterStringDate(request.getParameter("nascimento")));
			
			Endereco e = new Endereco(null,
									  request.getParameter("rua"),
									  request.getParameter("bairro"),
									  request.getParameter("cidade"));
			
			//Associação
			a.setEndereco(e);
			
			new AlunoDAO().inserirAluno(a);
			
			request.setAttribute("msg", "Aluno cadastrado");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
		}
	}

}
