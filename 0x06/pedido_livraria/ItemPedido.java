import produtos.Produto;

public class ItemPedido {

    private int quantidade;

    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
//        System.out.println(produto.getPrecoBruto());
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
