package principal;

import componentes.ItemPedido;
import componentes.Pedido;
import componentes.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto( 1, 20, "acessorio"); 
		ItemPedido item1 = new  ItemPedido(3, p1);
		Pedido pedido1 = new Pedido(item1.getQuantidade(), p1);
		
		System.out.println ("valor total do pedido: " + pedido1.obterTotal());
		
		Produto p2 = new Produto( 2, 100, "roupa"); 
		ItemPedido item2 = new  ItemPedido(2, p2);
		Pedido pedido2 = new Pedido(item2.getQuantidade(), p2);
		
		System.out.println ("valor total do pedido:" + pedido2.obterTotal());
		
		Produto p3 = new Produto( 3, 100, "calcado");
		
		pedido2.adicionaItem(2, p3);
		System.out.println ("valor total do pedido:" + pedido2.obterTotal());
		
		pedido2.adicionaItem(3, p1);
		
		
		System.out.println ("valor total do pedido:" + pedido2.obterTotal());
		
		
	}
}
