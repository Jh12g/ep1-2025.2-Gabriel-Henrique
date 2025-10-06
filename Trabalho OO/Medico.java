import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {

private String crm;
private String especialidadeMed;
private double precoConsulta;
private List<Date> agendaHorarios;

public Medico (String nome,String crm, String especialidadeMed, double precoConsulta){
    super(nome);
    this.crm = crm;
    this.especialidadeMed = especialidadeMed;
    this.precoConsulta = precoConsulta;
    this.agendaHorarios = new ArrayList<>();

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

public List<Date> getAgendaHorarios() {
         return agendaHorarios; 
        }

    public void adicionarHorario(Date horario) {
         this.agendaHorarios.add(horario); 
        }

    public boolean verificarDisponibilidade(Date horario) {
        return !agendaHorarios.contains(horario);
    }

    @Override
    public String toString() {
        return "\n Medico" +
                "\n Nome: " + getNome() + 
                "\n Crm: " + getCrm() + 
                "\n Especialidade Medica: " + getEspecialidadeMed() + 
                "\n Preço da Consulta :" + getPrecoConsulta();
    }


}