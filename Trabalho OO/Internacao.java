public class Internacao {

//paciente...
//medico tal...

private Paciente paciente;
private Medico medicoResponsavel;
private String dataDeEntrada;
private String dataDeSaida;
private int quarto;
private double custo;
private String status;

public Internacao(Paciente paciente, Medico medicoResponsavel,String dataDeEntrega,String dataDeSaida,int quarto,double custo, String status){
    this.dataDeEntrada = dataDeEntrega;
    this.dataDeSaida = dataDeSaida;
    this.quarto = quarto;
    this.custo = custo;
    this.status = status;

}
// add metodos...


public String getDataDeEntrega(){
    return dataDeEntrada;

}

public void setDataDeEntrega(String dataDeEntrega){
    this.dataDeEntrada = dataDeEntrega;

}

public String getDataDeSaida(){
    return dataDeSaida;

}

public void setDataDeSaida(String dataDeSaida){
    this.dataDeSaida = dataDeSaida;

}

public int getQuarto(){
    return quarto;

}

public void setQuarto(int quarto){
    this.quarto = quarto;

}

public double getCusto(){
    return custo;

}

public void setCusto(double custo){
    this.custo = custo;

}

public String getStatus(){
    return status;

}

public void setStatus(String status){
    this.status = status;

}


}
