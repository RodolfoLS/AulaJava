package implement;

import java.sql.SQLException;

import entity.Especializacao;
import persist.EspecializacaoDAO;

public class EspecializacaoDAOImp {

	private EspecializacaoDAO dao;
	
	public EspecializacaoDAOImp() {
		dao = new EspecializacaoDAO();
	}
	
	public boolean gravar(Especializacao e) {
		try {
			dao.gravar(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
}
