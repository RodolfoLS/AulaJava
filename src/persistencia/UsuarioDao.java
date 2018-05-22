package persistencia;

import entidade.Usuario;

public class UsuarioDao extends Dao {

		public void cadastrar(Usuario user)throws Exception{
			open();
			
			stmt = conn.prepareStatement("insert into usuario values(null, ?,?,?, null)");
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getSenha());
			stmt.setString(3, user.getNome());
			
			stmt.execute();
			
			close();
		}
		
		public Usuario logar(String login, String senha)throws Exception{
			Usuario user = null;
			
			open();
			
			stmt = conn.prepareStatement("select * from usuario where email = ? and senha = ? ");
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
			rs = stmt.executeQuery();
			if(rs.next()){
				user = new Usuario(rs.getInt("idusuario"), rs.getString("email"), null, 
						rs.getString("nome"), rs.getInt("tentativa"));
			}
			
			close();
			
			return user;
		}
		
		public Usuario buscarUsuario(String login)throws Exception{
			Usuario user = null;
			
			open();
			
			stmt = conn.prepareStatement("select * from usuario where email = ?");
			stmt.setString(1, login);
			
			rs = stmt.executeQuery();
			if(rs.next()){
				user = new Usuario(rs.getInt("idusuario"), rs.getString("email"), null, 
						rs.getString("nome"), rs.getInt("tentativa"));
			}
			
			close();
			
			return user;
		}
		
		public void atualizarTentativa(int id, int tentativa)throws Exception{
			open();
			
			stmt = conn.prepareStatement("update usuario set tentativa = ? where idUsuario = ?");
			
			stmt.setInt(1, tentativa);
			stmt.setInt(2, id);
			
			stmt.execute();
			close();
		}
		
	}
