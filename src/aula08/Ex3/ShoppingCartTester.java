package aula08.Ex3;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ProdutoInterface p1 = new ProdutoGenerico("Camisolas", 10, 3);
        ProdutoInterface p2 = new ProdutoGenerico("Calças", 30, 1);
        ProdutoInterface p3 = new ProdutosDesconto("Sapatilhas", 50, 2, 50);
        ProdutoInterface p4 = new ProdutosDesconto("Casacos", 100, 1, 10);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1, 1);
        carrinho.adicionarProduto(p2, 5);
        carrinho.adicionarProduto(p3, 2);
        carrinho.adicionarProduto(p4, 1);

        carrinho.listarProdutos();

        System.out.printf("Preço total da compra %.2f\n", carrinho.calcularTotal());

    }
}
