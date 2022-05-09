public class Pedido {

    private double percentualDesconto;

    private ItemPedido[] itens;


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

    public double totalDesconto(){

        double total = 0;

        for (var produto: itens) {
            total += produto.getProduto().obterPrecoLiquido() * produto.getQuantidade();
        }

        return (total * (percentualDesconto / 100));
    }

    public void apresentarResumoPedido(){
        System.out.printf("------- RESUMO PEDIDO -------%n");
        for (var item :itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n",
                    String.valueOf(item.getProduto().getClass())
                    .replace("class produtos.",""), item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(), item.getQuantidade(), item.getProduto()
                            .obterPrecoLiquido() * item.getQuantidade());
        }
        System.out.printf("----------------------------%nDESCONTO: %.2f%nTOTAL " +
                "PRODUTOS: %.2f%n----------------------------%nTOTAL PEDIDO: %.2f%n----------------------------%n", totalDesconto(),
                (calcularTotal() + totalDesconto()), calcularTotal());
    }
}
