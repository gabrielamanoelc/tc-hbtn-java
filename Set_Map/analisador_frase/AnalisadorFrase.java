import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String frase){

        List<String> split = List.of(frase.replaceAll("[.?!]", "").toLowerCase().split(" "));

        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

        for (var s :split) {
            tm.put(s, Collections.frequency(split,  s.toLowerCase()));
        }

        return tm;
    }
}
