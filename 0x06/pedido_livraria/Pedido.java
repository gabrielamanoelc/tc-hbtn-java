public class Pedido {

    private double percentualDesconto;

    private ItemPedido itens[];

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal(){

        double total = 0;
        for (var produto: itens) {
            total += produto.getProduto().obterPrecoLiquido() * produto.getQuantidade();
        }
        return total - (total * (percentualDesconto / 100));

    }
}
