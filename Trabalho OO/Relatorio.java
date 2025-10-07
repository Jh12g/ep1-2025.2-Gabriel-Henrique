import  java.util.ArrayList;
import java.util.List;

public class Relatorio {
    
  private List<Paciente> listaPaciente;
  private List<Consultas> buscarConsulta;
  private List<Internacao> internacoes;

 public Relatorio(){

    this.listaPaciente = new ArrayList<>();
    this.buscarConsulta = new ArrayList<>();
    this.internacoes = new ArrayList<>();

 }

 public List<Paciente> ListaPaciente(){
    System.out.println("-- Lista de Paciente --");
    
    for(Paciente pac : listaPaciente){
        System.out.println(pac.getNome());
    }
    return listaPaciente;
 }

 public List<Consultas> buscarConsulta(){
    System.out.println("-- Consultas Feitas --");

    for(Consultas con : buscarConsulta){
        System.out.println("\n Paciente: " + con.getPaciente().getNome() +
                        "\n Médico: " + con.getMedico().getNome() +
                        "\n Data: " + con.getDataHora());
    }
    return buscarConsulta;
 }

 public List<Internacao> internacoes(){
    List<Internacao> internados = new ArrayList<>();
for (Internacao inter : internacoes) {
if (inter.getStatus().equalsIgnoreCase("Ativa")) {
internados.add(inter);
}

}

System.out.println("=== Pacientes Internados no Momento ===");
for (Internacao i : internados) {
System.out.println(i.getPaciente().getNome() + " | Quarto: " + i.getQuarto());
}


return internados;

 }

  }

