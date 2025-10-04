public class PacienteEspecial extends Paciente {


    private PlanoDeSaude planoDeSaude;
    private boolean podeInternacao;

    public PacienteEspecial(String nome,String cpf,int idade,PlanoDeSaude planoDeSaude,boolean podeInternacao){
        super(nome,cpf,idade);
        this.planoDeSaude = planoDeSaude;
        this.podeInternacao = podeInternacao;
        

    }


    public boolean getPodeInternacao(){
        return podeInternacao;

    }

    public void setPodeInternacao(boolean podeInternacao){
        this.podeInternacao = podeInternacao;
    }


    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }


    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }


    

}