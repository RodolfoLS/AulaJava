package implement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Endereco;
import persist.EnderecoDAO;

public class EnderecoDAOImp {

	private EnderecoDAO dao;
	
	public EnderecoDAOImp() {
		dao = new EnderecoDAO();
	}
	
	public boolean gravar(Endereco e) {
		try {
			dao.save(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false;
	}
	
	public Endereco buscarPorId(int id) {
		try {
			return dao.localizaEndereco(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new Endereco();
		}
	}
	
	public List<Endereco> listar() {
		try {
			return dao.buscarEnderecos();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new ArrayList<Endereco>();
		}
	}
	
	public Boolean atualizar(Endereco e) {
		try {
			dao.atualizaEndereco(e);
			return Boolean.TRUE;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return Boolean.FALSE;
	}
	
	public boolean excluir(int id) {
		return false;
	}
}
