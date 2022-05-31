import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> produtoPredicate){
        return produtos.stream().filter(produtoPredicate).distinct().collect(Collectors.toList());
    }
}
