package exemplo;

public class ExemploFibonacci {
	public static void main(String[] args) {
		
		int primeiroTermo = 1;
		int segundoTermo = 1;
		int proximo = primeiroTermo + segundoTermo;
		
		System.out.print(primeiroTermo + ", " + segundoTermo + ", " + proximo + ", ");
		
		for (int i = 4; i < 10; i++) {
			primeiroTermo = segundoTermo;
			segundoTermo = proximo;
			proximo = primeiroTermo + segundoTermo;
			System.out.print(proximo + ", ");
		}
	}
}
