package app;

import entidade.Aluno;
import entidade.Situacao;

public class TestEnum {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Luc�o");
		aluno.setNota1(7.3);
		aluno.setNota2(9);
		
		System.out.println("Informa��es do aluno: \nNome: "+aluno.getNome()+"\nNota1: "+aluno.getNota1()+"\nNota2: "+aluno.getNota2()+"\nSitua��o: "+aluno.situacao());
	}
}
