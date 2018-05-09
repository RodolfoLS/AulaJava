package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1301 {
	public static void main(String[] args) {
		//pegar dados
		String aux = JOptionPane.showInputDialog(null, "Forne�a valor num�rico entre 0 e 10");
		
		if(aux != null) {
			try {
				float x = Float.parseFloat(aux);
				if(x >= 0 && x <= 10) {
					JOptionPane.showMessageDialog(null, "O " + x +" � v�lido");
				}else {
					JOptionPane.showMessageDialog(null, "O " + x +" � inv�lido");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, aux+" � um valor inv�lido, digite apenas valores num�ricos!");
			}
		}
		System.exit(0);
	}
}
