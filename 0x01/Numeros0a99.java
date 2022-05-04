import java.util.ArrayList;
import java.util.stream.Collectors;

public class Numeros0a99 {
    public static void main(String[] args) {
        var str = new ArrayList<>();

        for (int i = 0; i < 100; i++){
           str.add(i);

        }
        var convert = str.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(convert);
    }
}
