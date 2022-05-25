import java.util.ArrayList;

public class Biblioteca<T> extends Midia {

    ArrayList<T> valores;

    public Biblioteca() {
        this.valores = new ArrayList<T>();
    }

    public void adicionarMidia(T valor){
        this.valores.add(valor);
    }

    public ArrayList<T> obterListaMidias(){
        return this.valores;
    }
}
