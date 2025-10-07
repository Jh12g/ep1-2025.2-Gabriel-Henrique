public class PacienteComum extends Paciente {

    private String metodoPagamento;

    public PacienteComum (String nome,String cpf,int idade,String metodoPagamento){
        super(nome,cpf,idade);
         this.metodoPagamento = metodoPagamento;

    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public String toString() {
        return "\n Paciente Comum" +
                "\n Nome: " + getNome() + 
                "\n Cpf: " + getCpf() + 
                "\n Idade: " + getIdade() +
                "\n Metodo de Pagamento: " + getMetodoPagamento();
    }

    
}