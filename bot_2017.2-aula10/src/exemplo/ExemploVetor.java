package exemplo;

public class ExemploVetor {
	public static void main(String[] args) {

		int[] numeros = new int[3];
		numeros[0] = 29;
		numeros[1] = 30;
		numeros[2] = 31;
		
		String nomes[] = {"Luiz", "Rose", "Julia"};

		// for com tamanho fixo
		for (int i = 0; i < 3; i++) {
			System.out.println(numeros[i]);
		}

		// for com tamanho do vetor(ler o tamanho)
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// foreach simplificação do for para "varrer" o array
		for (int numero : numeros) {
			System.out.println(numero);
		}
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
