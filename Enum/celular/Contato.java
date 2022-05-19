public class Contato {

   private String nome;
   private String telefone;
   private TipoNumero tipoNumero;

   public Contato(String nome, String telefone, TipoNumero tipoNumero) {
      this.nome = nome;
      this.telefone = telefone;
      this.tipoNumero = tipoNumero;
   }

   public String getNome() {
      return nome;
   }

   public String getTelefone() {
      return telefone;
   }

   public TipoNumero getTipoNumero() {
      return tipoNumero;
   }
}
