package principal;

public class Main {

	public static void main(String[] args) {
		
		
		Singeton s = Singeton.getIntancia();
		System.out.println("Objeto 1:" + s);
		Singeton s1 = Singeton.getIntancia();
		System.out.println("Objeto 1:" + s1);
	}

}
