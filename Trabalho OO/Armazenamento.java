import java.io.*;
import java.nio.file.*;
import java.util.*;


public class Armazenamento {

   
    public static void salvarPacientes(List<Paciente> pacientes) {
        salvarLista(pacientes, "pacientes.txt");
    }

    public static List<Paciente> carregarPacientes() {
        return carregarLista("pacientes.txt");
    }

    
    public static void salvarMedicos(List<Medico> medicos) {
        salvarLista(medicos, "medicos.txt");
    }

    public static List<Medico> carregarMedicos() {
        return carregarLista("medicos.txt");
    }

    
    public static void salvarPlanos(List<PlanoDeSaude> planos) {
        salvarLista(planos, "planos.txt");
    }

    public static List<PlanoDeSaude> carregarPlanos() {
        return carregarLista("planos.txt");
    }

   
    public static void salvarConsultas(List<Consultas> consultas) {
        salvarLista(consultas, "consultas.txt");
    }

    public static List<Consultas> carregarConsultas() {
        return carregarLista("consultas.txt");
    }

    
    private static <T> void salvarLista(List<T> lista, String nomeArquivo) {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(nomeArquivo))) {
            for (T obj : lista) {
                bw.write(obj.toString());
                bw.newLine();
            }
            System.out.println("Arquivo \"" + nomeArquivo + "\" salvo ");
        } catch (IOException e) {
            System.out.println("Erro ao salvar " + nomeArquivo + ": " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> carregarLista(String nomeArquivo) {
        List<T> lista = new ArrayList<>();
        Path path = Paths.get(nomeArquivo);

        if (Files.exists(path)) {
            try (BufferedReader br = Files.newBufferedReader(path)) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    // Armazenamos as linhas como strings — futuras versões podem converter para objetos
                    ((List) lista).add(linha);
                }
                System.out.println("Arquivo \"" + nomeArquivo + "\" carregado.");
            } catch (IOException e) {
                System.out.println("Erro ao carregar " + nomeArquivo + ": " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo \"" + nomeArquivo + "\" não encontrado. Criando novo.");
        }

        return lista;
    }
}
