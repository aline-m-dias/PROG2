package minhasExcessoes;

import principal.Conta;

public class ContaException extends RuntimeException{
	private String mensagem;
    private double saldo;
    
	public ContaException(String mensagem, double saldo) {
		this.mensagem=mensagem;
		System.out.println("Seu saldo:" + saldo);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
