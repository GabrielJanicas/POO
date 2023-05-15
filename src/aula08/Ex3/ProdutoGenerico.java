package aula08.Ex3;

public  class ProdutoGenerico implements ProdutoInterface{
	private String nome;
	private double preco;
	private int quantidade;


	public ProdutoGenerico(String nome,int quant,double preco){
		this.nome = nome;
		this.preco= preco;
		this.quantidade = quant;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quant) {
		this.quantidade = quant;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void adicionarQuantidade(int quantidade){
		this.quantidade += quantidade;
	}

	public void removerQuantidade(int quantidade){
		this.quantidade -= quantidade;
	}
}
