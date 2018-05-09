package exercicio;

public class Exercicio1303 {
	public static void main(String[] args) {
		try {
			System.out.println("Como aprender");
			throw new Exception("MinhaExceção"); // gera exceção
		} catch (Exception e) {
			System.out.println("A linguagem Java ");
		}
		
	}
}
