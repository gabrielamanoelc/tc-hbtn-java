package provedores;

public class JadLog implements ProvedorFrete{

    Frete frete = new Frete();
    @Override
    public Frete calcularFrete(double peso, double valor) {

        if(peso > 2000){
            valor = (valor * 0.07);
        } else {
            valor = (valor * 0.045);
        }

        frete.setValor(valor);
        frete.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return frete.getTipoProvedorFrete();
    }
