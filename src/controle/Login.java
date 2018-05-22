package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidade.Usuario;
import persistencia.UsuarioDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// peguei da tela o login e a senha
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			// Instancia de objeto Usuário para receber o login e a senha
			Usuario user = new Usuario();
			// aqui... o objeto está recebendo os dados da tela
			user.setEmail(login);
			user.setSenha(senha);
			// Instacio um objeto do tipo usuario dao... para poder verificar
			// se existe este usuario no banco, existindo deixa passar...
			UsuarioDao ud = new UsuarioDao();
			
			Usuario usuario = ud.buscarUsuario(login);
			
			if (usuario != null) {
				int tentativa = usuario.getTentativa();
				if(ud.logar(login, user.getSenha())!= null){
					//encontrou... digitou o login e a senha corretos
					// carregar a sessão
					// sessão é um espeaço da memoria do navegador
					// permanece até que o navegador seja fechado
					HttpSession session = request.getSession();
					session.setAttribute("id", usuario.getIdUsuario());
					session.setAttribute("email", usuario.getIdUsuario());
					session.setAttribute("nome", usuario.getIdUsuario());
					
					// atualizar a variavel tentativa
					ud.atualizarTentativa(usuario.getIdUsuario(),0);
				}
			} else {
				request.setAttribute
				("msg", "<div class='alert alert-info'> Usuario Invalido</div>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.jsp");
	}
	}

}
