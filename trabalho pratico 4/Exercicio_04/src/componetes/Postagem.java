package componetes;

import java.time.LocalDate;

public class Postagem {

	private Integer id;
	private  String titulo;
	private  String texto;
	private LocalDate dataPublicacao;
	
	public Postagem(Integer id, String titulo, String texto, LocalDate dataPublicacao) {
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.dataPublicacao = dataPublicacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public void imprime() {
		System.out.println("ID: " + this.id + "\n Titulo: " + this.titulo + "\n Texto: " + this.texto  + "Data publicação: " +
							this.dataPublicacao);
	}
	
	
}
