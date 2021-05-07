package MinhasExcessoes;

public class ContaException  extends RuntimeException{

	private String mensagem;
	
	public ContaException(String mensagem) {
		this.mensagem=mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
