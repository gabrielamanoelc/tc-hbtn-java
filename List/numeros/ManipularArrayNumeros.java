import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int buscaNumero){
        if(numeros.contains(buscaNumero)){
            return numeros.indexOf(buscaNumero);
        }else{
            return 0;
        }

    }

    public static void adicionarNumero(List<Integer> numeros, int addNumero) {
        if(buscarPosicaoNumero(numeros, addNumero) == 0){
            numeros.add(addNumero);
        }else{
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }


    public static void removerNumero(List<Integer> numeros, int removeNumero) {
        if(buscarPosicaoNumero(numeros, removeNumero) == 0){
            System.out.println("Numero nao encontrado na lista");
        }else{
            numeros.remove(buscarPosicaoNumero(numeros, removeNumero));

        }
    }


    public static void substituirNumero(List<Integer> numeros, int numeroSubstituto, int numeroSubstituir) {
        if(buscarPosicaoNumero(numeros, numeroSubstituto)== 0){
            numeros.add(numeroSubstituir);
        }else{
            numeros.set(buscarPosicaoNumero(numeros, numeroSubstituto), numeroSubstituir);
        }
    }
}
