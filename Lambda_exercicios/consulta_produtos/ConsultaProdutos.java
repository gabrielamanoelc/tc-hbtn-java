import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        return produtos.stream().filter(criterioFiltro::testar).distinct().collect(Collectors.toList());
    }
}
