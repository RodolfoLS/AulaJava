package exercicio;

public class Exercicio1306 {
	public static void main(String[] args) {
		String palavra = "     Bagulho é eeu";
		System.out.println("Minusculo: "+ palavra.toLowerCase());
		System.out.println("MAIUSCULOo: "+ palavra.toUpperCase());
		
		System.out.println();
		
		System.out.println("Com espaço: "+palavra+"*");
		System.out.println("Sem espaço: "+palavra.trim()+"*");
		
		System.out.println("-----------------------------");
		
		String frase = "o macaco gosta de banana";
		System.out.println(frase.replace(" ", "."));
		System.out.println(frase.replace("a", "A"));
		
		
	}
}
