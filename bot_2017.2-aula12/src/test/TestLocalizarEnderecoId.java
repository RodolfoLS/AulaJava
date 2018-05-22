package test;

import implement.EnderecoDAOImp;

public class TestLocalizarEnderecoId {
	public static void main(String[] args) {

		EnderecoDAOImp imp = new EnderecoDAOImp();
		
		System.out.println(imp.buscarPorId(1));
	}
}
