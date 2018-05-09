package exercicio;

public class Exercicio1304 {
	public static void main(String[] args) {
		int x = 10, y =0, z = 0;
		
		try {
			z = x / y;//gera uma exceção
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
