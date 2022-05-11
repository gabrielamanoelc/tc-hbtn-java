package provedores;

public class Sedex implements ProvedorFrete{

    Frete frete = new Frete();
    @Override
    public Frete calcularFrete(double peso, double valor) {

        if(peso > 1000){
            valor = (valor * 0.1);
        } else {
            valor = (valor * 0.05);
        }

        frete.setValor(valor);
        frete.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return frete.getTipoProvedorFrete();
    }
}
