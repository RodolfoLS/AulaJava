package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Endereco;

// C.R.U.D - Endereço
public class EnderecoDAO extends DAO {

	private Connection conn;
	
	public EnderecoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexao: " + e.getMessage());
		}
	}

	// Create
	// Método responsável por salvar(gravar) o endereço
	public void save(Endereco e) throws SQLException {
		// ele prepara contexto de instrução SQL para ser enviado para o SGBD
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into endereco values (null, ?, ?, ?, ?, ?)");
			
			stmt.setString(1, e.getLogradouro());
			stmt.setString(2, e.getBairro());
			stmt.setString(3, e.getCidade());
			stmt.setString(4, e.getCep());
			stmt.setInt(5, e.getPessoa().getId());
			
			// retorna "0" caso ocorra uma falha
			int flag = stmt.executeUpdate();
			
			if(flag == 0)
				throw new SQLException("Erro ao gravar no banco");
		} finally {
			if(stmt != null)
				stmt.close();
			
			if(conn != null)
				conn.close();
		}
	}
	
	public Endereco localizaEndereco(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement("select * from endereco where id = ?");
			stmt.setInt(1, id);
			
			// vai carregar o rs com o resultado do banco
			rs = stmt.executeQuery();
			Endereco end = null;
			
			if(rs.next()) {
				end = criaObjEndereco(rs);
			}
			
			return end;
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			if(rs != null)
				rs.close();
		}
	}
	
	public List<Endereco> buscarEnderecos() throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement("select * from endereco");
			
			// vai carregar o rs com o resultado do banco
			rs = stmt.executeQuery();

			// recebe uma coleção de endereços
			List<Endereco> listaEndereco = new ArrayList<Endereco>();
			
			/*
			 * Endereco[] vEndereco = new Endereco[10];
			 * vEndereco[0] = criaObjEndereco(rs);
			 */
			
			while(rs.next()) {
				listaEndereco.add(criaObjEndereco(rs));
			}
			
			return listaEndereco;
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			if(rs != null)
				rs.close();
		}
	}
	
	private Endereco criaObjEndereco(ResultSet rs) throws SQLException {
		// Criação da referencia e instancia de Endereco
		Endereco endereco = new Endereco();
		
		endereco.setId(rs.getInt(1));
		endereco.setLogradouro(rs.getString(2));
		endereco.setBairro(rs.getString(3));
		endereco.setCidade(rs.getString(4));
		endereco.setCep(rs.getString(5));
		
		return endereco;
	}
}
