package componentes;

import MinhasExcessoes.ContaException;

public class Conta {

	private String nomeDono;
	private int numConta;
	private double saldo;
	private double limite;
	
	public Conta() {
		
	}
	
	public Conta (String nomeDono,int numConta,double saldo, double limite){
		this.nomeDono=nomeDono;
		this.numConta=numConta;
		this.saldo=saldo;
		this.limite=limite;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void deposita (double valor) {
		this.saldo= this.saldo +valor;
	}
	
	public void saca (double valor) throws ContaException {
		if ( this.saldo < valor) {
			ContaException c = new ContaException("n?o ha saldo disponivel para esse saque.");
			throw c;
		}
		this.saldo= this.saldo -valor;
		System.out.println("Saldo:" + this.getSaldo());
	}
	
}
