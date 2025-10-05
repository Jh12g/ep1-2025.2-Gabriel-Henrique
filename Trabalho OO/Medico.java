import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {

private String crm;
private String especialidadeMed;
private double precoConsulta;
private List<LocalDateTime> agendaHorarios;

public Medico (String nome,String crm, String especialidadeMed, double precoConsulta){
    super(nome);
    this.crm = crm;
    this.especialidadeMed = especialidadeMed;
    this.precoConsulta = precoConsulta;
    this.agendaHorarios = new ArrayList<>();

}

// add metodos...

public boolean verificarDisponibilidade(LocalDateTime horas){

    for (LocalDateTime horarioAgendado : this.agendaHorarios){
        if (horarioAgendado.equals(horas)){
            return false;
        }
    }

    return true;
    
}

public void adicionarHorario(LocalDateTime horas){

    if (verificarDisponibilidade(horas)){
        
        this.agendaHorarios.add(horas);

        System.out.println("hora do agendamento da  consulta: "+ horas);

    } else {

        System.out.println("Horario ja preenchido");
    }

} 

public void remocaoAgenda(LocalDateTime horas){

    this.agendaHorarios.remove(horas);
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