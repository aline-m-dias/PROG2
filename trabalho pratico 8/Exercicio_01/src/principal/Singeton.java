package principal;

public class Singeton {

	private static Singeton instancia;
	
	private Singeton() {
		
	}
	
	public static Singeton getIntancia() {
		if(instancia== null) {
			instancia= new Singeton();
		}
		return instancia;
	}
	
	
}
