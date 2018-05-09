package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1302 {
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog(null, "Forne�a o 1� n�mero");
		if (aux == null)
			System.exit(0);
		String aux1 = JOptionPane.showInputDialog(null, "Forne�a o 2� n�mero");
		if (aux1 == null)
			System.exit(0);
		try {
			int num1 = Integer.parseInt(aux);
			int num2 = Integer.parseInt(aux1);
			JOptionPane.showMessageDialog(null, "Soma � igual a: " + (num1+num2));
			JOptionPane.showMessageDialog(null, "Subtra��o � igual a: " + (num1-num2));
			JOptionPane.showMessageDialog(null, "Multiplica��o � igual a: " + (num1*num2));
			JOptionPane.showMessageDialog(null, "Divis�o � igual a: " + (num1/num2));
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro de divis�o por zero", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		System.exit(0);
	}
}
