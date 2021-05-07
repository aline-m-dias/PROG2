import componentes.Elevador;

public class Main {

	public static void main(String[] args) {
		
		Elevador e1 = new Elevador(10, 6);
		
		System.out.println ("Andar atual:" + e1.getAndarAtual() );
		e1.entra();
		e1.entra();
		e1.subir(7);
		System.out.println ("Andar atual:" + e1.getAndarAtual() );
		e1.sai();
		System.out.println("quantas pessoas" + e1.getQuantasPessoas());
		e1.subir(10);
		e1.sai();
		System.out.println("quantas pessoas" + e1.getQuantasPessoas());
		e1.desce(5);
		System.out.println ("Andar atual:" + e1.getAndarAtual() );
		e1.entra();
		e1.entra();
		e1.entra();
		e1.entra();
		e1.entra();
		e1.entra();
		e1.entra();
		System.out.println("quantas pessoas" + e1.getQuantasPessoas());
		e1.desce(2);
		System.out.println ("Andar atual:" + e1.getAndarAtual() );
		e1.sai();
		System.out.println ("Andar atual:" + e1.getAndarAtual() );
		System.out.println("quantas pessoas" + e1.getQuantasPessoas());
	}
	

}
