public class Consultas {

private String dataHora;
private String local;
private String status;
private String diagnostico;
private String prescricao;

public Consultas(String dataHora,String local,String status,String diagnostico,String prescricao){
    this.dataHora = dataHora;
    this.local = local;
    this.status = status;
    this.diagnostico = diagnostico;
    this.prescricao = prescricao;

}

// add metodos...

public  String getDataHora(){
    return dataHora;
}

public void setDataHora(String dataHora){
    this.dataHora = dataHora;
}

public String getLocal(){
    return local;
    
}

public void setLocal(String local){
    this.local = local;
}

public String getStatus(){
    return status;
}

public void setStatus(String status){
    this.status = status;
}

public String getDiagnostico(){
    return diagnostico;
}

public void setDiagnostico(String diagnostico){
    this.diagnostico = diagnostico;
}

public String getPrescricao(){
    return prescricao;
}

public void setPrescricao(String prescricao){
    this.prescricao = prescricao;
}

}