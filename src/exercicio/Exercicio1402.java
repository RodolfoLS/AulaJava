package exercicio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1402 {
	public static void main(String[] args) {
		Date agora = new Date();
		DateFormat df1,df2,df3,df4;
		
		String f1  = "dd/MM/yyyy";
		df1 = new SimpleDateFormat(f1);
		
		String f2  = "EEE, d MMM, yy";
		df2 = new SimpleDateFormat(f2);
		
		String f3  = "DD/mm/yy";
		df3 = new SimpleDateFormat(f3);
		
		String f4  = "hh:mm:ss:SS";
		df4 = new SimpleDateFormat(f4);
		
		JOptionPane.showMessageDialog(null, "Dia/Mês/Ano com 4 digitos: "+df1.format(agora)+
											"\nDia da semana, mes por extenso, dia e ano com 2 digitos: "+df2.format(agora)+
											"\nDia no ano/minuto da hora/ano com 2 digitos: "+df3.format(agora)+
											"\nHora:minuto:segundo:milésimo de segundo: "+df4.format(agora));
	}
}
