package provedores;

public class Loggi implements ProvedorFrete{

    Frete frete = new Frete();
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 5000){
            valor = (valor * 0.12);
        } else {
            valor = (valor * 0.04);
        }

        frete.setValor(valor);
        frete.setTipoProvedorFrete(TipoProvedorFrete.LOGGI);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return frete.getTipoProvedorFrete();
    }
}
