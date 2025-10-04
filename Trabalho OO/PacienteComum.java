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

    
}