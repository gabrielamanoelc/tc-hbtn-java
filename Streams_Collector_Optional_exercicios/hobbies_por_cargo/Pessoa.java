import java.text.DecimalFormat;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{

    int codigo;
    String nome;
    String cargo;
    int idade;
    double salario;

    List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " +  nome + " " + cargo + " " + idade + " " + "R$ " + new DecimalFormat("0.000000").format(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
