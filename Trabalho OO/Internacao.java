public class Internacao {


private Paciente paciente;
private Medico medico;
private String dataDeEntrada;
private String dataDeSaida;
private int quarto;
private double custo;
private String status;

public Internacao(Paciente paciente, Medico medico,String dataDeEntrega,String dataDeSaida,int quarto,double custo, String status){
    this.paciente = paciente;
    this.medico = medico;
    this.dataDeEntrada = dataDeEntrega;
    this.dataDeSaida = dataDeSaida;
    this.quarto = quarto;
    this.custo = custo;
    this.status = "Ativa";

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

public String getDataDeEntrada() {
    return dataDeEntrada;
}

public void setDataDeEntrada(String dataDeEntrada) {
    this.dataDeEntrada = dataDeEntrada;
}

public String getDataDeSaida() {
    return dataDeSaida;
}

public void setDataDeSaida(String dataDeSaida) {
    this.dataDeSaida = dataDeSaida;
}

public int getQuarto() {
    return quarto;
}

public void setQuarto(int quarto) {
    this.quarto = quarto;
}

public double getCusto() {
    return custo;
}

public void setCusto(double custo) {
    this.custo = custo;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}


public boolean iniciarInternacao(){
     return true; 
    }
    
public boolean verificarOcupacao(){
     return true; 
    }

public void finalizarInternacao(){
     this.status = "Finalizada"; 
    }

public void cancelarInternacao(){
     this.status = "Cancelada"; 
    }

    @Override
    public String toString() {
        return "\n Internacao" +
                "\n Paciente: " + (getPaciente() != null ? getPaciente().getNome() : "Errado...") + 
                "\n MedicoResponsavel: " + (getMedico() != null ? getMedico().getNome() : "Errado...") + 
                "\n Quarto: " + getQuarto() +
                "\n Status: " + getStatus();
    }

}
