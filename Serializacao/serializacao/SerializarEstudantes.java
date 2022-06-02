import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SerializarEstudantes<T> {

    String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/tmp/" + nomeArquivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            oos.writeObject(estudantes);
        } catch (Exception e){
            System.out.println("Nao foi possivel serializar");
        }

    }

    public List<Estudante> desserializar(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/tmp/" + nomeArquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(fis);
        } catch (NullPointerException | IOException e) {}

        List<Estudante> estudantes = new ArrayList<>();

            try {
                estudantes = (List<Estudante>) ois.readObject();
            } catch (Exception e){
                new Exception(e);
            }

            return estudantes;
    }
}
