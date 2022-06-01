import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido(Pedido pedido){

      return pedido.produtos.stream()
              .filter(produto -> produto.categoria.equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }
}
