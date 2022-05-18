import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Pedido {

    List<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        this.cookies.add(pedidoCookie);
    }

    int obterTotalCaixas(){
        var quantidade = 0;
        for (var c :this.cookies) {
            quantidade += c.getQuantidadeCaixas();
        }
        return quantidade;
    }

    int removerSabor(String sabor){

        var filterCookies = this.cookies.stream().filter(c -> sabor.contains(c.getSabor())).collect(Collectors.toList());


        var quantidade = 0;
        for (var f :filterCookies) {
            quantidade += f.getQuantidadeCaixas();
        }

//        System.out.println(quantidade);
        this.cookies.removeAll(filterCookies);

        return quantidade;
    }
}
