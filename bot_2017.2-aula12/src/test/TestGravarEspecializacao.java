package test;

import entity.Especializacao;
import entity.Professor;
import implement.EspecializacaoDAOImp;

public class TestGravarEspecializacao {
	public static void main(String[] args) {
		Especializacao e = new Especializacao();
		
		e.setTitulo("Mestrando");
		e.setProfessor(new Professor());
		e.getProfessor().setId(1);
		
		EspecializacaoDAOImp imp = new EspecializacaoDAOImp();
		if(imp.gravar(e))
			System.out.println("Dados gravados com sucesso");
	}
}
