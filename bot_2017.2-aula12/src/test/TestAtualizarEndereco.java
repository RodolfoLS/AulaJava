package test;

import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestAtualizarEndereco {
	public static void main(String[] args) {
		EnderecoDAOImp daoImp = new EnderecoDAOImp();
		
		Endereco endereco = new Endereco();
		
		endereco.setId(1);
		endereco.setLogradouro("Rua Bambina, nº 107");
		endereco.setBairro("Botafogo");
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("22251-050");
		
		if(daoImp.atualizar(endereco))
			System.out.println("Endereço atualizado");
	}
}
