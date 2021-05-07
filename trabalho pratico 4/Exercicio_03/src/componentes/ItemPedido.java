package componentes;

import java.util.ArrayList;
import java.util.List;

public class ItemPedido {

	
		private int quantidade;
		private List<Produto> produto = new ArrayList<>();
		
		public ItemPedido(int quantidade, Produto produto) {
			this.quantidade=quantidade;
			this.produto.add(produto);
		}
		
		public int getQuantidade() {
			return this.quantidade;
		}
		
		public void  setQuantidade(int quantidade) {
			
			this.quantidade=quantidade;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}

}


