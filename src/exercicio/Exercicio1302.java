package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1302 {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog(null, "Forneça o 1° número");
		if (aux == null)
			System.exit(0);
		String aux1 = JOptionPane.showInputDialog(null, "Forneça o 2° número");
		if (aux1 == null)
			System.exit(0);
		try {
			int num1 = Integer.parseInt(aux);
			int num2 = Integer.parseInt(aux1);
			JOptionPane.showMessageDialog(null, "Soma é igual a: " + (num1+num2));
			JOptionPane.showMessageDialog(null, "Subtração é igual a: " + (num1-num2));
			JOptionPane.showMessageDialog(null, "Multiplicação é igual a: " + (num1*num2));
			JOptionPane.showMessageDialog(null, "Divisão é igual a: " + (num1/num2));
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro de divisão por zero", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		System.exit(0);
	}
}
