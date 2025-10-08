import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execultavel {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<PlanoDeSaude> planos = new ArrayList<>();
        List<Consultas> consultas = new ArrayList<>();

        int opcao;

        do { 
            
            System.out.println("\n====== SISTEMA HOSPITALAR ======");
            System.out.println("1 - Cadastrar Paciente Comum");
            System.out.println("2 - Cadastrar Paciente Especial");
            System.out.println("3 - Cadastrar Médico");
            System.out.println("4 - Cadastrar Plano de Saúde");
            System.out.println("5 - Cadastrar Consulta");
            System.out.println("6 - Listar Pacientes");
            System.out.println("7 - Listar Médicos");
            System.out.println("8 - Listar Consultas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("Nome: ");
                    String nome = scan.nextLine();

                    System.out.println("CPF: ");
                    String cpf = scan.nextLine();

                    System.out.println("Idade: ");
                    int idade = scan.nextInt();

                    scan.nextLine();

                    System.out.println("Metodo de Pagamento: ");
                    String metodo = scan.nextLine();

                    PacienteComum p = new PacienteComum(nome, cpf, idade, metodo);
                    pacientes.add(p);
                    System.out.println(" Paciente comum cadastrado com sucesso!");

                }

                case 2 -> {
                    if (planos.isEmpty()) {
                        System.out.println(" Nenhum plano de saúde cadastrado! Cadastre primeiro.");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = scan.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scan.nextLine();
                    System.out.print("Idade: ");
                    int idade = scan.nextInt();
                    scan.nextLine();

                    System.out.println("\nPlanos disponíveis:");
                    for (int i = 0; i < planos.size(); i++) {
                        System.out.println((i + 1) + " - " + planos.get(i).getNome());
                    }
                    System.out.print("Escolha o plano: ");
                    int indice = scan.nextInt() - 1;
                    scan.nextLine();

                    PacienteEspecial pe = new PacienteEspecial(nome, cpf, idade, planos.get(indice));
                    pacientes.add(pe);
                    System.out.println(" Paciente especial cadastrado com sucesso!");
                }

                case 3 -> {
                    System.out.print("Nome: ");
                    String nome = scan.nextLine();
                    System.out.print("CRM: ");
                    String crm = scan.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scan.nextLine();
                    System.out.print("Custo da consulta: ");
                    double custo = scan.nextDouble();

                    Medico m = new Medico(nome, crm, especialidade, custo);
                    medicos.add(m);
                    System.out.println(" Médico cadastrado com sucesso!");
                }

                case 4 -> {
                    System.out.print("Nome do plano: ");
                    String nome = scan.nextLine();
                    System.out.print("Desconto base (ex: 0.2 para 20%): ");
                    double desconto = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scan.nextLine();

                    PlanoDeSaude plano = new PlanoDeSaude(nome, desconto, descricao);
                    planos.add(plano);
                    plano.cadastrarPlano();
                }

                case 5 -> {
                    if (pacientes.isEmpty() || medicos.isEmpty()) {
                        System.out.println(" Cadastre pelo menos um paciente e um médico antes de criar uma consulta!");
                        break;
                    }

                    System.out.println("\nPacientes disponíveis:");
                    for (int i = 0; i < pacientes.size(); i++) {
                        System.out.println((i + 1) + " - " + pacientes.get(i).getNome());
                    }
                    System.out.print("Escolha o paciente: ");
                    int indicePaciente = scan.nextInt() - 1;
                    scan.nextLine();

                    System.out.println("\nMédicos disponíveis:");
                    for (int i = 0; i < medicos.size(); i++) {
                        System.out.println((i + 1) + " - " + medicos.get(i).getNome() + " (" + medicos.get(i).getEspecialidade() + ")");
                    }
                    System.out.print("Escolha o médico: ");
                    int indiceMedico = scan.nextInt() - 1;
                    scan.nextLine();

                    System.out.print("Data e hora da consulta: ");
                    String dataHora = scan.nextLine();
                    System.out.print("Local da consulta: ");
                    String local = scan.nextLine();

                    Consultas consulta = new Consultas(pacientes.get(indicePaciente), medicos.get(indiceMedico), dataHora, local);
                    consultas.add(consulta);
                    pacientes.get(indicePaciente).adicionarConsulta(consulta);

                    System.out.println(" Consulta cadastrada com sucesso!");
                }

                case 6 -> {
                    System.out.println("\n=== PACIENTES CADASTRADOS ===");
                    if (pacientes.isEmpty()) System.out.println("Nenhum paciente cadastrado.");
                    else pacientes.forEach(System.out::println);
                }

                case 7 -> {
                    System.out.println("\n=== MÉDICOS CADASTRADOS ===");
                    if (medicos.isEmpty()) System.out.println("Nenhum médico cadastrado.");
                    else medicos.forEach(System.out::println);
                }

                case 8 -> {
                    System.out.println("\n=== CONSULTAS ===");
                    if (consultas.isEmpty()) System.out.println("Nenhuma consulta cadastrada.");
                    else consultas.forEach(System.out::println);
                }

                case 0 -> System.out.println("Encerrando o sistema");
                default -> System.out.println(" Opção inválida, tente novamente");
            }

                
        } while (opcao != 0);

        scan.close();

    }
    

    
}
