public class Pessoa {

    private String nome;

    public Pessoa (String nome) {
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

   @Override
    public String toString() {
        return "Pessoa" +
        "nome: " + getNome();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return java.util.Objects.equals(getNome(), pessoa.getNome());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getNome());
    }
}