package Principal;

public class matriz {

public int linhas;
public int colunas;
public String [][] matri = new String [linhas][colunas];

public matriz(int l, int c){
  String [][] matri2 = new String [l][c];
  
  this.matri=matri2;
  
  this.linhas=l;
  this.colunas=c;
  
}

public void numLinhas(){

System.out.println(linhas);
}
  
public void numColunas(){

System.out.println(this.colunas);
}
  
public void preencher ( String valor){
  
  for( int i = 0; i < this.linhas; i++){
   for( int j = 0; j < this.colunas; j++){
  
  this.matri[i][j]=valor;
 
    
    
  }
 }
  
}

public void transporMatriz(){
  
  if(this.linhas==this.colunas){
  String [][] matri3 = new String [this.linhas][this.colunas];
  for( int i = 0; i < this.linhas; i++){
   for( int j = 0; j < this.colunas; j++){
matri3[i][j] = this.matri[j][i];
matri = matri3;


  }
    
  }
}

}

public void apresentar (){
for( int i = 0; i < this.linhas; i++){
   for( int j = 0; j < this.colunas; j++){
   System.out.print(this.matri[i][j]);
  
}
System.out.println();

}}
}
