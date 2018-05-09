package exercicio;

import javax.swing.JOptionPane;

public class Exercicio1301 {
	public static void main(String[] args) {
		//pegar dados
		String aux = JOptionPane.showInputDialog(null, "Forneça valor numérico entre 0 e 10");
		
		if(aux != null) {
			try {
				float x = Float.parseFloat(aux);
				if(x >= 0 && x <= 10) {
					JOptionPane.showMessageDialog(null, "O " + x +" é válido");
				}else {
					JOptionPane.showMessageDialog(null, "O " + x +" é inválido");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, aux+" é um valor inválido, digite apenas valores numéricos!");
			}
		}
		System.exit(0);
	}
}
