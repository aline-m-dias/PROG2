package componentes;

public class Incremental {

	
	private static int count=0;
	private int numero;
	
	/*public  Incremental() {
		 numero=++count;
	}*/	

	/*usando o padr?o de projeto Singeton*/
	private static Incremental instancia;
	
	/*muda o acesso do construtor para privado*/
	private  Incremental() {
		 numero=++count;
	}
	
	public static Incremental getIntancia() {
		if(instancia== null) {
			instancia= new Incremental();
		}
		return instancia;
	}
	
	
	@Override
	public String toString() {
		return "Numero:" + this.numero;
	}
}
