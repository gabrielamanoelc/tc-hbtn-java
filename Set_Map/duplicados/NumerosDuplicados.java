import java.util.*;

public class NumerosDuplicados {

    public static TreeSet buscar(int[] numeros){

        List<Integer> n = new ArrayList<>();

        for (var b: numeros) {
            n.add(b);
        }
        Set<Integer> numero = new HashSet<>();

        for (var c :n) {
            if(Collections.frequency(n, c) > 1){
                numero.add(c);
            }
        }


        return new TreeSet<>(numero);
    }


}
