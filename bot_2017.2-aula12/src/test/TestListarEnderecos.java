package test;

import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestListarEnderecos {
	public static void main(String[] args) {

		EnderecoDAOImp dao = new EnderecoDAOImp();

		// foreach padrão
		/*
		 * for (Endereco end : dao.listar()) { 
		 *	 System.out.println(end);
		 * }
		 */

		// foreach usando o expressão lambda (imprimir tudo)
	 /*dao.listar().forEach(endereco->System.out.println(endereco));*/

		// foreach usando o expressão lambda (imprimir somente o endereço de id 2)
	dao.listar().forEach(endereco -> {
		if (new Integer(2).equals(endereco.getId())) {
			System.out.println(endereco);
		}
	});

		// foreach usando o método por referência
		// dao.listar().forEach(System.out::println);

		/**
		 * @method dao.listar() - retorna a lista de endereços
		 * @method forEach - método responsável por implementar o loop foreach a partir
		 *         da lista(internamente)
		 * @param (System.out)
		 *            - parametro de inicialização(origem) do método referencia que quer
		 *            trabalhar
		 * @param (::)
		 *            - caracter para representar passagem de referencia
		 * @param (println)
		 *            - método utilizado na referencia
		 **/
	}
}
