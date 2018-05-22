package extra01.ex08;

import java.util.ArrayList;
import java.util.List;

public class Triangulo {

	private List<PlanoCartesiano> coordenadas = new ArrayList<PlanoCartesiano>();
	
	public Triangulo(int... vertices) {

		coordenadas.add(new PlanoCartesiano(vertices[0], vertices[1]));
		coordenadas.add(new PlanoCartesiano(vertices[2], vertices[3]));
		coordenadas.add(new PlanoCartesiano(vertices[4], vertices[5]));

		System.out.println("Coordenadas informadas foram:");

		int cont = 1;
		for (PlanoCartesiano pc : coordenadas) {
			System.out.println("Vertice " + cont + " - (" + pc.getPontoX() + ", " + pc.getPontoY() + ")");
			cont++;
		}
	}

	private int calcularDeterminar() {
		int pSLado = (coordenadas.get(0).getPontoX() * coordenadas.get(1).getPontoY() * 1);
		int sSLado = (coordenadas.get(0).getPontoY() * 1 * coordenadas.get(2).getPontoX());
		int tSLado = (1 * coordenadas.get(1).getPontoX() * coordenadas.get(2).getPontoY());

		int pILado = (coordenadas.get(0).getPontoY() * coordenadas.get(1).getPontoX() * 1);
		int sILado = (coordenadas.get(0).getPontoX() * 1 * coordenadas.get(2).getPontoY());
		int tILado = (1 * coordenadas.get(1).getPontoY() * coordenadas.get(2).getPontoX());

		int determinante = (pSLado + sSLado + tSLado) - (pILado + sILado + tILado);
		System.out.println("det1: " + (pSLado + sSLado + tSLado));
		System.out.println("det2: " + (pILado + sILado + tILado));

		System.out.println("determinante: " + determinante);
		int superficie = (int) (((double) 1 / 2) * determinante);

		return (superficie < 0) ? superficie * (-1) : superficie;

	}

	public int getSuperficie() {
		return calcularDeterminar();
	}
}
