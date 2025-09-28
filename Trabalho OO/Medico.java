public class Medico extends Pessoa {

private String crm;
private String especialidadeMed;
private double precoConsulta;

public Medico (String crm, String especialidadeMed, double precoConsulta){
    this.crm = crm;
    this.especialidadeMed = especialidadeMed;
    this.precoConsulta = precoConsulta;

    super(nome);
    this.nome;

}

// add metodos...


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