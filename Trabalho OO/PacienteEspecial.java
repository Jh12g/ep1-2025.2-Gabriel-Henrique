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

   public boolean isPodeInternacaoEspecial() {
         return podeInternacao; 
        }


    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }


    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }


    @Override
    public String toString() {
        return "\n Paciente Especial" +
                "\n Nome: " + getNome() + 
                "\n Cpf: " + getCpf() + 
                "\n Idade: " + getIdade() +
                "\n Plano de Saude: " + (getPlanoDeSaude() != null ? getPlanoDeSaude().getNome() : "Nenhum") +
                "\n Pode Internacao Especial?: " + isPodeInternacaoEspecial();
    }
    

}