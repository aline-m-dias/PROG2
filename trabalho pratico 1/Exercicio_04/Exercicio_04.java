package Principal;
import java.util.Scanner;

public class Main {
	public static void leituraDados(int matriz [][], Scanner sc)	 {
		int i, j=0;
		for(i=0;i<10; i++) {
			for(j=0; j<4; j++) {

				switch(j){
				case 0:
					System.out.println("Digite a matricula do aluno");
					matriz[i][j]=sc.nextInt();
					break;
				case 1:
					System.out.println("Digite o sexo do aluno (0 para feminino e 1 para masculino)");
					matriz[i][j]=sc.nextInt();
					break;
				case 2:
					char []codigoCurso = new char[3];
					String valor= Integer.toString(matriz[i][0]);
					valor.getChars(3, 6,codigoCurso, 0);
					valor=String.copyValueOf(codigoCurso);
					matriz[i][j]=Integer.valueOf(valor);
					break;
				case 3:
					System.out.println("Digite o coeficiente de rendimento");
					matriz[i][j]=sc.nextInt();
					break;
				default:
					break;
				}
			}		
		}
		

	}
	public static void imprime(int matriz[][]) {
		int i;
        System.out.println("matricula - sexo - codigo do curso - CR:");
		for(i=0;i<10;i++) {
			for(int j=0; j<4; j++) {
				switch(j) {
				case 0:
					System.out.print(matriz[i][j]+ "     ");
					break;
				case 1:
					System.out.print ("  " + matriz[i][j] + "     ");
					break;
				case 2:
					System.out.print("  " + matriz[i][j] + "       ");
					break;
				case 3:
					System.out.print("     " + matriz[i][j]);
					break;
				default:
					break;
					
				}
				
			}
			System.out.println();
		}
	}
	public static void coeficienteRendimento(int matriz[][], int codigoCurso) {

		int maiorCR=0;
		int posicao=0;
		for(int i=0; i<10; i++) {
			if(matriz[i][2]== codigoCurso) {
				if (matriz[i][3]> maiorCR) {
					maiorCR=matriz[i][3];
					posicao=i;
				}
			}
		}
		System.out.println("Maior coeficiente de rendimento");
		System.out.println("Matricula: "+ matriz [posicao][0]);
		System.out.println("Coeficiente:" + matriz[posicao][3]);
				
	}
	public static void main (String [] args) {

		int matrizDados[][]= new int[10][4];
		Scanner sc= new Scanner(System.in);
		leituraDados(matrizDados,sc);
		imprime(matrizDados);
		System.out.println("Digite o codigo curso para premiação");
		int codigo=sc.nextInt();
		coeficienteRendimento(matrizDados, codigo);
		sc.close();
		

	}
}
