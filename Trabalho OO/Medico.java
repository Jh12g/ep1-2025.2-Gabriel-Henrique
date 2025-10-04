public class Medico extends Pessoa {

private String crm;
private String especialidadeMed;
private double precoConsulta;

public Medico (String nome,String crm, String especialidadeMed, double precoConsulta){
    super(nome);
    this.crm = crm;
    this.especialidadeMed = especialidadeMed;
    this.precoConsulta = precoConsulta;

    
}

// add metodos...

public void adicionarHorario(){

} 

public boolean verificarDisponibilidade(){

    
}


public String getCrm(){
    return crm;
}

public void setCrm(String crm){
    this.crm = crm;

}
public String getEspecialidadeMed(){
    return especialidadeMed;
}

public void setEspecialidadeMed(String especialidadeMed){
    this.especialidadeMed = especialidadeMed;
}

public double getPrecoConsulta(){
    return precoConsulta;
}

public void setPrecoConsulta(double precoConsulta){
    this.precoConsulta = precoConsulta;

}
}