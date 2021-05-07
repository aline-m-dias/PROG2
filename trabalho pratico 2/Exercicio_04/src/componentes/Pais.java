package componentes;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private String codigoIso;
	private String nome;
	private int populacao;
	private double dimensao;
	private List<Pais> fronteira = new ArrayList<>();
	
	public Pais(String codigoIso, String nome, int populacao, double dimensao) {
		this.codigoIso=codigoIso;
		this.nome=nome;
		this.populacao=populacao;
		this.dimensao=dimensao;
	
	}
	
	public String getCodigoIso() {
		return this.codigoIso;
	}
	
	public void setCodigoIso(String codigoIso) {
		this.codigoIso=codigoIso;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getPopulacao() {
		return this.populacao;
	}
	
	public void setPopulacao(int populacao) {
		this.populacao=populacao;
	}
	
	public double getDimensao() {
		return this.dimensao;
	}
	
	public void setDimensao(double dimensao) {
		this.dimensao=dimensao;
	}

	public void addPaisFronteira(Pais x) {
		
		fronteira.add(x);
	}
	
	public void limitrofes( Pais x) {
		
		for (Pais y: fronteira) {
			if (x==y){
				System.out.println("São Limitrofes");
				break;
			}
			else {
				System.out.println("Não são limitrofes");
				break;
			}
		}
			
		
		
	}
	
	public double densidadePopulacional() {
		return this.populacao/dimensao;
	}
	
	public List<Pais> vizinhos(Pais p) {

			List <Pais> vizinhosComuns= new ArrayList<>();
			for(Pais i: fronteira) {
				for (Pais j: p.fronteira) {
					if(i.getCodigoIso().equals(j.getCodigoIso())) {
						vizinhosComuns.add(j);
						break;
					}
				}
			}
		
		return vizinhosComuns;
	}
	
	

}
