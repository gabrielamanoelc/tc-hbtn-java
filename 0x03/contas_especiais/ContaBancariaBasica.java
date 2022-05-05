import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor) throws OperacaoInvalidaException {

            if(valor < 1){
                throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
            }

            saldo += valor;
    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 1){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if(valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    double calcularTarifaMensal(){
        if((saldo * 0.1) < 10.00){
            return saldo * 0.1;
        } else {
            return 10.00;
        }
    }

    double calcularJurosMensal(){
        if(saldo < 1){
            return 0;
        } else {
            return ((taxaJurosAnual /12) * saldo) / 100;
        }
    }

    void aplicarAtualizacaoMensal(){
        saldo = (saldo - calcularTarifaMensal()) + calcularJurosMensal();
    }
}
