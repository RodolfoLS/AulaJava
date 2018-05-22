package entidade;

public enum Situacao {
	APROVADO("Vai dar role menor"), REPROVADO("Ih vai fica estudano mais um mucado"), RECUPERACAO("Se fodeu");
	
	String msg;
	
	private Situacao(String msg) {
		this.msg = msg; 
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
