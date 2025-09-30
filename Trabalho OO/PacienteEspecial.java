public class PacienteEspecial extends Paciente {


    private PlanoDeSaude planoDeSaude;
    private boolean podeInternacao;

    public PacienteEspecial(PlanoDeSaude planoDeSaude,boolean podeInternacao){
        this.planoDeSaude = planoDeSaude;
        this.podeInternacao = podeInternacao;
        super();

    }

    public boolean getPodeInternacao(){
        return podeInternacao;

    }

    public void setPodeInternacao(boolean podeInternacao){
        this.podeInternacao = podeInternacao;
    }


}