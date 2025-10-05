public class Paciente extends Pessoa {

private String cpf;
private int idade;

public Paciente (String nome,String cpf,int idade){
    super(nome);
    this.cpf = cpf;
    this.idade = idade;
   
}

// add metodos...

public double calcularCustoConsulta(){

}

public void adicionarConsulta(){

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