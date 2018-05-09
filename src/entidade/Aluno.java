package entidade;

import java.util.Date;

public class Aluno {
	private Integer matricula;
	private String nome;
	private String email;
	private Date nascimento;
	
	private Endereco endereco;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer matricula, String nome, String email, Date nascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", nascimento=" + nascimento
				+ ", endereco=" + endereco + "]";
	}
	
}
