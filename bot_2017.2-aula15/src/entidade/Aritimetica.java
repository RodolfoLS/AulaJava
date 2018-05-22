package entidade;

public class Aritimetica {
	public double soma(double ...valores) {
		double resultado = 0;
		for (double d : valores) {
			resultado += d;
		}
		return resultado;
	}
	
	public double multiplicacao(double ...numeros) {
		double resultado = 1;
		for (double d : numeros) {
			resultado *= d;
		}
		return resultado;
	}
	
	public double divisao(double ...seila) {
		double resultado = 1;
		for (double d : seila) {
			resultado /= d;
		}
		return resultado;
	}
	
	public double subtracao(double ...aham) {
		//A variavel resultado será iniciada com a primeira posição do meu array
		double resultado = aham[0];
		for (int i = 1; i < aham.length; i++) {
			resultado -= aham[1];
		}
		return resultado;
	}
}
