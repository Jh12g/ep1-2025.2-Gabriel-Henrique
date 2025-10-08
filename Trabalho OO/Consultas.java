public class Consultas implements java.io.Serializable {
    private Paciente paciente;
    private Medico medico;
    private String dataHora;
    private String local;
    private String status;
    private String diagnostico;
    private String prescricao;

    public Consultas(Paciente paciente, Medico medico, String dataHora, String local) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.local = local;
        this.status = "Agendada";
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

        
    public void finalizarConsulta() {
         this.status = "Concluída"; 
        }

    public double calcularPrecoFinal() {
         return medico.getCustoConsulta(); 
        }

    @Override
    public String toString() {
        return "\n Consulta" +
                "\n Paciente: " + (getPaciente() != null ? getPaciente().getNome() : "N/A") + 
                "\n Medico: " + (getMedico() != null ? getMedico().getNome() : "N/A") + 
                "\n Data e Hora: " + getDataHora() + 
                "\n Local: " + getLocal() + 
                "\n Status: " + getStatus();
    }
}
