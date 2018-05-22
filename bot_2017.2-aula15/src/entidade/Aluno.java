package entidade;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public String situacao() {
		double media = (nota1 + nota2)/2;
		if(media >=6)
			return Situacao.APROVADO.getMsg();
		else if(media>4)
			return Situacao.RECUPERACAO.getMsg();
		else
			return Situacao.REPROVADO.getMsg();
	}
	
	//Vai retornar a situação do aluno(aprovado,recuperação,reprovado) a partir da media dele
	@Override
	public String toString() {
		return "";
	}
	
}
