package aula08.Ex3;

import java.util.ArrayList;

public class CarrinhoDeCompras implements Compra{
	int quantidade;
	ArrayList<ProdutoInterface> listaprodutos = new ArrayList<ProdutoInterface>();

	public void adicionarProduto(ProdutoInterface produto, int quantidade) {
		listaprodutos.add(produto);

	}

	public void listarProdutos(){
		System.out.println(listaprodutos);
	}

	public double calcularTotal(){
		double total = 0;
		for (ProdutoInterface produto : listaprodutos) {
			total += produto.getPreco()*produto.getQuantidade();
		}
		return total;
	}

	
}
