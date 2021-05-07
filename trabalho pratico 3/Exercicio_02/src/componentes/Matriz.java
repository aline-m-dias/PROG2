package componentes;

import java.util.Scanner;

public class Matriz {
	
	Scanner sc= new Scanner(System.in);
	private int linha;
	private int coluna;
	private double  [][]  matrix;
	
	/*construtor*/
	public Matriz(int linha, int coluna) {
		this.linha=linha;
		this.coluna=coluna ;
		matrix = new double [this.linha][this.coluna];
	}
	
	/*M�todo que informa o numero de linhas da matriz;*/
	public int getLinha() {
		return this.linha;
	}
	/*M�todo que informa o numero de colunas da matriz;*/
	public int getColuna() {
		return this.coluna;
	}
	
	
	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	/*M�todo para preencher os dados da matriz, posi��o por posi��o;*/
	public void preencheMatriz() {
		
		for(int i=0; i<linha; i++) {
			for(int j=0; j<coluna; j++) {
				System.out.print("Digite um numero");
				double valor= sc.nextDouble();
				matrix[i][j]=valor;
			}
		}
		
	}
	
/* M�todo que permita editar o valor de uma determinada posi��o da matriz*/
	
	public void modificaPosicaoMatriz() {
		System.out.println("Digite a posicao da matriz que deseja modificar:\n Linha:");
		int l=sc.nextInt();
		System.out.println("Coluna:");
		int c=sc.nextInt();
		System.out.println("Digite o valor para inserir na posicao da matriz");
		double valor=sc.nextDouble();
		this.matrix[l][c]=valor;
	}
	
	/*metodo para transpor a matriz*/
	public void matrizTranposta() {
	
	
		double [][] matrizAuxiliar= new double [linha][coluna];
		matrizAuxiliar=this.matrix;
		double auxiliar;
		
		if (this.linha == this.coluna) {
			
			for(int i=0; i<this.linha; i++) {
				for(int j=0; j<this.coluna; j++) {
				
						if (i!=j) {
							
							auxiliar=matrizAuxiliar[i][j];
							this.matrix[j][i]=auxiliar;
							
						}else {
							this.matrix[i][j]=matrizAuxiliar[j][i];
						}
					
				
				}
			}
		}else {
			System.out.println("matriz n�o � quadrada");
		}

	}
	
	/*M�todo para ampresentar no console, a matriz na forma 2D.*/
	
	public  void imprimeMatriz() {
		for(int i=0; i<this.linha; i++) {
			for(int j=0; j<this.coluna; j++) {
				
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
