import java.io.*;
import java.util.*;

public class Armazenamento {

    public static void salvarPacientes(List<Paciente> pacientes) {
        salvarObjetos(pacientes, "pacientes.dat");
    }

    @SuppressWarnings("unchecked")
    public static List<Paciente> carregarPacientes() {
        Object obj = carregarObjetos("pacientes.dat");
        if (obj instanceof List<?>) return (List<Paciente>) obj;
        return new ArrayList<>();
    }

    public static void salvarMedicos(List<Medico> medicos) {
        salvarObjetos(medicos, "medicos.dat");
    }

    @SuppressWarnings("unchecked")
    public static List<Medico> carregarMedicos() {
        Object obj = carregarObjetos("medicos.dat");
        if (obj instanceof List<?>) return (List<Medico>) obj;
        return new ArrayList<>();
    }

    public static void salvarPlanos(List<PlanoDeSaude> planos) {
        salvarObjetos(planos, "planos.dat");
    }

    @SuppressWarnings("unchecked")
    public static List<PlanoDeSaude> carregarPlanos() {
        Object obj = carregarObjetos("planos.dat");
        if (obj instanceof List<?>) return (List<PlanoDeSaude>) obj;
        return new ArrayList<>();
    }

    public static void salvarConsultas(List<Consultas> consultas) {
        salvarObjetos(consultas, "consultas.dat");
    }

    @SuppressWarnings("unchecked")
    public static List<Consultas> carregarConsultas() {
        Object obj = carregarObjetos("consultas.dat");
        if (obj instanceof List<?>) return (List<Consultas>) obj;
        return new ArrayList<>();
    }

    private static void salvarObjetos(Object obj, String arquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(obj);
            System.out.println("Arquivo '" + arquivo + "' salvo com sucesso (serializado).");
        } catch (IOException e) {
            System.out.println("Erro ao salvar '" + arquivo + "': " + e.getMessage());
        }
    }

    private static Object carregarObjetos(String arquivo) {
        File f = new File(arquivo);
        if (!f.exists()) {
            System.out.println("Arquivo '" + arquivo + "' não encontrado. Iniciando vazio.");
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            Object obj = ois.readObject();
            System.out.println("Arquivo '" + arquivo + "' carregado (serializado).");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar '" + arquivo + "': " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
