package entidade;

public class Usuario {
	private Integer idUsuario;
	private String email;
	private String senha;
	private String nome;
	private int tentativa;
	public Usuario(Integer idUsuario, String email, String senha, String nome,
			int tentativa) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.tentativa = tentativa;
	}
	public Usuario() {
		super();
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTentativa() {
		return tentativa;
	}
	public void setTentativa(int tentativa) {
		this.tentativa = tentativa;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email
				+ ", senha=" + senha + ", nome=" + nome + ", tentativa="
				+ tentativa + "]";
	}
}
