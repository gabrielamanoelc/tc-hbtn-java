public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(Integer valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        if(Integer.parseInt(valor) <= -1){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

        if(!valor.isEmpty()){
            this.valor = Integer.parseInt(valor);
        }
    }
    
    boolean ehPrimo() {
        if(valor <= 1){
            return false;
        }

        for (int i = 2; i < valor; i++){
            if(valor % i == 0){
                return false;
            }
        }

        return true;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor <= -1){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
}
