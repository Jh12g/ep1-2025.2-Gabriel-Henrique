import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private double custoConsulta;
    private List<Date> agendaHorarios;

    public Medico(String nome, String crm, String especialidade, double custoConsulta) {
        super(nome);
        this.crm = crm;
        this.especialidade = especialidade;
        this.custoConsulta = custoConsulta;
        this.agendaHorarios = new ArrayList<>();
    }

    public String getCrm() {
         return crm; 
        }

    public void setCrm(String crm) {
         this.crm = crm; 
        }


    public String getEspecialidade() {
         return especialidade; 
        }

    public void setEspecialidade(String especialidade) {
         this.especialidade = especialidade; 
        }


    public double getCustoConsulta() {
         return custoConsulta; 
        }

    public void setCustoConsulta(double custoConsulta) {
         this.custoConsulta = custoConsulta; 
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
                "\n Especialidade: " + getEspecialidade() + 
                "\n CustoConsulta :" + getCustoConsulta();
    }
}
