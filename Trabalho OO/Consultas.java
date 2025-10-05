public class Consultas {

private Paciente paciente;
private Medico medico;
private String dataHora;
private String local;
private String status;
private String diagnostico;
private String prescricao;
private double precoBase = 200.0;

public Consultas(Paciente paciente,Medico medico,String dataHora,String local,String status,String diagnostico,String prescricao){
    this.paciente = paciente;
    this.medico = medico;
    this.dataHora = dataHora;
    this.local = local;
    this.status = "Agendada";
    this.diagnostico = diagnostico;
    this.prescricao = prescricao;
    
}

public double calcularPreco(){
    
    double precoFinal = precoBase;
    String especialidade = medico.getEspecialidadeMed().toLowerCase().trim(); 


if (especialidade.equalsIgnoreCase("cardiologia")) {
precoFinal *= 1.5;
precoFinal *= 0.9;

} else if (especialidade.equalsIgnoreCase("neurologia")) {
precoFinal *= 2.0;
precoFinal *= 0.85;

} else if (especialidade.equalsIgnoreCase("pediatria")) {
precoFinal *= 1.2;
precoFinal *= 0.95;

} else if (especialidade.equalsIgnoreCase("dermatologia")) {
precoFinal *= 1.3;
precoFinal *= 0.9;

} else if (especialidade.equalsIgnoreCase("ortopedia")) {
precoFinal *= 1.4;
precoFinal *= 0.92;

} else {
precoFinal *= 1.0; // sem alteração
}

return precoFinal;

}

public void fimConsulta(){
    if (this.status.equals("Agendada")) {
        this.status = "Realizada";
        System.out.println("Consulta finalizada");
    } else {
        System.out.println("Consulta não foi realizdada");
    }

}


public Paciente getPaciente() {
    return paciente;
}

public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
}

public Medico getMedico() {
    return medico;
}

public void setMedico(Medico medico) {
    this.medico = medico;
}

public String getDataHora() {
    return dataHora;
}

public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
}

public String getLocal() {
    return local;
}

public void setLocal(String local) {
    this.local = local;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public String getDiagnostico() {
    return diagnostico;
}

public void setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
}

public String getPrescricao() {
    return prescricao;
}

public void setPrescricao(String prescricao) {
    this.prescricao = prescricao;
}



}