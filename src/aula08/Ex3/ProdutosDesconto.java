package aula08.Ex3;

public class ProdutosDesconto extends ProdutoGenerico{
	private int desconto;

	public ProdutosDesconto(String nome,int quantidade,double preco,int desconto){
		super(nome, quantidade, preco);
		this.desconto = desconto;
	}
	

	public int getDesconto() {
		return this.desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

}
