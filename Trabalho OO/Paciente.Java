import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa implements java.io.Serializable {

private String cpf;
private int idade;
private List<Consultas> historicoConsulta;
private List<Internacao> historicoInternacoes;

public Paciente (String nome,String cpf,int idade){
    super(nome);
    this.cpf = cpf;
    this.idade = idade;
    this.historicoConsulta = new ArrayList<>();
    this.historicoInternacoes = new ArrayList<>();
   
}


public String getCpf(){
    return cpf;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}
    
public int getIdade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

public List<Consultas> getHistoricoConsultas() {
         return historicoConsulta; 
        }
    public List<Internacao> getHistoricoInternacoes() {
         return historicoInternacoes; 
        }

    public void adicionarConsulta(Consultas consulta) {
        this.historicoConsulta.add(consulta);
    }

    public double calcularCustoConsulta() {
    double total = 0.0; 

    
    for (Consultas consulta : historicoConsulta) {

        double preco = consulta.calcularPrecoFinal();

       
        total += preco;
    }

    
    return total;
}

    @Override
    public String toString() {
        return "\n Paciente" +
                "\n Nome: " + getNome() + 
                "\n Cpf: " + getCpf() + 
                "\n Idade: " + getIdade() +
                "\n Total de Consultas: " + getHistoricoConsultas().size() +
                "\n Total de Internacoes: " + getHistoricoInternacoes().size();
    }

    
}