package componentes;

public class Elevador {

	private int andarAtual;
    private int totalDeAndares;
    private int capacidadeElevador;
    private int  quantasPessoas;
    
    /*Inicializa : parametros a capacidade do elevador e o total de   andares no predio */
    	
    public Elevador(int totalDeAndares, int capacidadeElevador){
       this.andarAtual=0;
       this.totalDeAndares= totalDeAndares;
       this.capacidadeElevador = capacidadeElevador;
       this.quantasPessoas=0;
    }
    
    /*metodos gets e sets*/
    public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}


	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getQuantasPessoas() {
		return quantasPessoas;
	
	}

	public void setQuantasPessoas(int quantasPessoas) {
		this.quantasPessoas = quantasPessoas;
	}

      
	/*Entra :acrescentar uma pessoa no elevador */
    
    public void entra () {
    	
    	if (this.quantasPessoas < this.capacidadeElevador ) {
    		this.quantasPessoas++;
    		System.out.println("Entrou uma pessoa no elevador");
    	}else {
    		System.out.println("Elevador com capacidade ocupada, espere sair uma pessoa");
    	}
    }
    
   /* Sai : remove uma pessoa do elevador*/
    
    public void sai() {
    	if (this.quantasPessoas>0) {
    		this.quantasPessoas--;
    		System.out.println("saiu uma pessoa do elevador");
    	}
    }
    
  //Sobe : sobe ate o andar desejado;
   
    public void subir(int andarDesejado) {
    	if (andarDesejado< this.totalDeAndares) {
    		
    		while(this.andarAtual<andarDesejado) {
    			this.andarAtual++;
    		}
    	}
    }
    
   // Desce : para descer ate o andar desejado;
    
    public void desce(int andarDesejado) {
    	
    	if (this.andarAtual==0) {
    		System.out.println("Voce estar no terreo, não pode descer!");
    	}else {
    		while(this.andarAtual > andarDesejado) {
    			this.andarAtual--;
    		}
    	}
    		
    }


}
