package trace;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NumerosPares {
    public static void main(String[] args) {
        var str = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){

                str.add(i);
            }

        }
        var convert = str.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(convert);
    }
}
