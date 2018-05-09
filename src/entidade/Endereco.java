package entidade;

public class Endereco {
	private Integer id;
	private String rua;
	private String bairro;
	private String cidade;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Integer id, String rua, String bairro, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}
	
	
}
