package app;

import entidade.Aritimetica;

public class TestAritimetica {
	public static void main(String[] args) {
		Aritimetica ar = new Aritimetica();
		
		System.out.println("A soma dos valores é: "+ ar.subtracao(5,2));
		
		System.out.println("A soma dos valores é: "+ ar.multiplicacao(1,13,12,6,4,10,9,11,8));
	}
}
