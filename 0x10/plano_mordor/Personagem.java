import comida.Comida;
import humor.*;

import java.util.Arrays;

public class Personagem {

    int pontosDeFelicidade;

    Humor obterHumorAtual(){
        if(pontosDeFelicidade < -5){
            return new Irritado();
        } else if(pontosDeFelicidade >= -5 && pontosDeFelicidade < 1){
            return new Triste();
        } else if(pontosDeFelicidade > 0 && pontosDeFelicidade <= 15){
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    void comer(Comida[] comidas){
        for (var comida: comidas) {
          pontosDeFelicidade +=  comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }


}
