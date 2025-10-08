public class PacienteEspecial extends Paciente implements java.io.Serializable {
    private PlanoDeSaude planoSaude;
    private boolean podeInternacaoEspecial;

    public PacienteEspecial(String nome, String cpf, int idade, PlanoDeSaude planoSaude) {
        super(nome, cpf, idade);
        this.planoSaude = planoSaude;
        this.podeInternacaoEspecial = planoSaude.podeTerInternacaoEspecial();
    }

    public PlanoDeSaude getPlanoSaude() {
         return planoSaude; 
        }

    public void setPlanoSaude(PlanoDeSaude planoSaude) {
         this.planoSaude = planoSaude;
         }

    public boolean isPodeInternacaoEspecial() {
         return podeInternacaoEspecial; 
        }
    public void setPodeInternacaoEspecial(boolean podeInternacaoEspecial) {
         this.podeInternacaoEspecial = podeInternacaoEspecial; }

    @Override
    public String toString() {
        return "\n Paciente Especial" +
                "\n Nome: " + getNome() + 
                "\n Cpf: " + getCpf() + 
                "\n Idade: " + getIdade() +
                "\n Plano de Saude: " + (getPlanoSaude() != null ? getPlanoSaude().getNome() : "Nenhum") +
                "\n Pode Internacao Especial?: " + isPodeInternacaoEspecial();
    }
}
