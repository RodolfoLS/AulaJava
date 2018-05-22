package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Especializacao;
import entity.Professor;

public class EspecializacaoDAO extends DAO {

	private Connection conn;
	
	public EspecializacaoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void gravar(Especializacao e) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into especializacao values (null, ?, ?)");
			stmt.setString(1, e.getTitulo());
			stmt.setInt(2, e.getProfessor().getId());
			
			int flag = stmt.executeUpdate();
			
			if(flag == 0)
				throw new SQLException("Erro ao gravar a especialização");
			
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
		}
	}
	
	public Especializacao localizarEspecializacao(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("select * from especializacao where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			Especializacao especializacao = null;
			if(rs.next())
				especializacao = criaObjEsp(rs);
			
			return especializacao;
		} finally {
			if(conn != null)
				conn.close();
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
		}
	}
	// Método responsável por criar o obj de especialização
	private Especializacao criaObjEsp(ResultSet rs) throws SQLException {
		Especializacao esp = new Especializacao();
		
		esp.setId(rs.getInt(1));
		esp.setTitulo(rs.getString(2));
		esp.setProfessor(new Professor());
		esp.getProfessor().setId(rs.getInt(3));
		
		return esp;
	}
}
