package componentes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private float valorTotal=0;
  
	private List<ItemPedido> item = new ArrayList<>();
	
	public Pedido( int quantidade, Produto produto) {
		this.item.add(new ItemPedido(quantidade, produto));
	}
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemPedido> getItem() {
		return item;
	}

	public void setItem(List<ItemPedido> item) {
		this.item = item;
	}
	
	public void adicionaItem( int quantidade, Produto produto){
		this.item.add(new ItemPedido(quantidade, produto));
		System.out.println("Produto adicionado ao pedido");
		 
	}

	public float obterTotal() {
		float soma=0;
		
		 for(int i=0; i<getItem().size(); i++) {
		    	
			 for (int j=0; j< getItem().get(i).getProduto().size(); j++) {
				 soma= soma+
						 getItem().get(i).getQuantidade() * getItem().get(i).getProduto().get(j).getValor();
				 
			 }
		    		   
		    }
		  
		this.valorTotal=soma;
		return this.valorTotal;
	}
	
}
