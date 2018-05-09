package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vetor {

		public static void main(String[] args) {
			
			List<Integer> li = new ArrayList<>();
			
			// carregar a lista
			
			li.add(3);
			li.add(30);
			li.add(35);
			li.add(3000);
			li.add(700);
			li.add(3500);
			
			System.out.println("Valores da lista "+li);
			
			li.set(2, 50);// troca de valor para a posição 2 de 35 para 50
			System.out.println("Valores da lista "+li);
			
			//adicionar valores a lista
			li.add(33);
			li.add(303);
			li.add(500);
			li.add(353);
			li.add(400003);
			li.add(7003);
			li.add(35003);
			
			System.out.println("Valores da lista "+li);
			
			System.out.println("Remover item da lista");
			li.remove(5);
			System.out.println("Valores da lista "+li);
			
			Collections.sort(li);//ordenação
			System.out.println("Valores da lista: "+li);
			System.out.println("-----------------------------------");
			for (int i = 0; i < li.size(); i++) {
				System.out.println("Posição: "+i+" - Valor: "+li.get(i));
			}
		}
}