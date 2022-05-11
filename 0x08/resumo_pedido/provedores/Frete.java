package provedores;

public class Frete {

    private double valor;

    private TipoProvedorFrete tipoProvedorFrete;


    public Frete(double valor) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public Frete() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

}
