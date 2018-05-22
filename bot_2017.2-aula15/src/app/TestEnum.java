package app;

import entidade.Aluno;
import entidade.Situacao;

public class TestEnum {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Lucão");
		aluno.setNota1(7.3);
		aluno.setNota2(9);
		
		System.out.println("Informações do aluno: \nNome: "+aluno.getNome()+"\nNota1: "+aluno.getNota1()+"\nNota2: "+aluno.getNota2()+"\nSituação: "+aluno.situacao());
	}
}
