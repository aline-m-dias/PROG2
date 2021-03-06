package componentes;

public class Restaurante  extends Empresa{

	private String tipoComida;
	private double precoMedio;
	
	public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone,String tipoComida, double precoMedio) {
		super(nome,endereco,cidade,estado,cep,telefone);
		this.tipoComida = tipoComida;
		this.precoMedio = precoMedio;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}
	
	public void print() {
		super.print();
		System.out.println("\n Tipo Comida: " + this.tipoComida + 
						   "\n Pre?o medio: " + this.precoMedio);
	}
	
	
}

