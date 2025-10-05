import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {

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

// add metodos...

public double calcularCustoConsulta(){
double total = 0.0;
        for (Consultas con : historicoConsulta) {
            total = con.calcularPrecoFinal();
        
        return total;
}

public void adicionarConsulta(Consultas consulta){

    historicoConsulta.add(consulta);
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

    
}