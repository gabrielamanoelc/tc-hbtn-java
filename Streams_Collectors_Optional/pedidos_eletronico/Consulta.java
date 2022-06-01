import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido(Pedido pedido){

      return pedido.produtos.stream()
              .filter(produto -> produto.categoria.equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().sorted(Comparator.comparingDouble(Produto::getPreco)).collect(Collectors.toList()).get(2);
    }

    static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMin){
        return produtos.stream()
                .filter(produto -> produto.preco >= precoMin).collect(Collectors.toList());
    }

    static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        return pedidos.stream().filter(pedido -> {
            return pedido.produtos.stream().anyMatch(produto -> produto.categoria.equals(CategoriaProduto.ELETRONICO));
        }).collect(Collectors.toList());
    }
}
