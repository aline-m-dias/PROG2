package principal;

import MinhasExcessoes.ContaException;
import componentes.Conta;

public class Main {

	public static void main(String[] args) {
      
		Conta minhaConta = new Conta();
		
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		
		try {
			minhaConta.saca(50);
			minhaConta.saca(1000);
		}catch(ContaException e) {
			System.out.println("verifique seu saldo!, esse valor n?o ? disponivel para saque.");
		}
		
		
	}

}
