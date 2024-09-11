package src.utils;

import src.model.Despesa;
import src.model.TipoDespesa;
import src.model.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilitário para manipulação de arquivos relacionados a despesas, tipos de
 * despesas e usuários.
 */
public class ArquivoUtil {

    /**
     * Salva uma lista de despesas em um arquivo.
     * 
     * @param despesas Lista de despesas a ser salva.
     * @param caminho  Caminho do arquivo onde as despesas serão armazenadas.
     */
    public static void salvarDespesas(List<Despesa> despesas, String caminho) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(despesas);
        } catch (IOException e) {
            System.err.println("Erro ao salvar despesas: " + e.getMessage());
        }
    }

    /**
     * Carrega uma lista de despesas de um arquivo.
     * 
     * @param caminho Caminho do arquivo de onde as despesas serão carregadas.
     * @return Lista de despesas carregadas.
     */
    public static List<Despesa> carregarDespesas(String caminho) {
        List<Despesa> despesas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            despesas = (List<Despesa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar despesas: " + e.getMessage());
        }
        return despesas;
    }

    /**
     * Salva uma lista de tipos de despesa em um arquivo.
     * 
     * @param tipos   Lista de tipos de despesa a ser salva.
     * @param caminho Caminho do arquivo onde os tipos de despesa serão armazenados.
     */
    public static void salvarTiposDespesa(List<TipoDespesa> tipos, String caminho) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(tipos);
        } catch (IOException e) {
            System.err.println("Erro ao salvar tipos de despesa: " + e.getMessage());
        }
    }

    /**
     * Carrega uma lista de tipos de despesa de um arquivo.
     * 
     * @param caminho Caminho do arquivo de onde os tipos de despesa serão
     *                carregados.
     * @return Lista de tipos de despesa carregados.
     */
    public static List<TipoDespesa> carregarTiposDespesa(String caminho) {
        List<TipoDespesa> tipos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            tipos = (List<TipoDespesa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar tipos de despesa: " + e.getMessage());
        }
        return tipos;
    }

    /**
     * Salva uma lista de usuários em um arquivo.
     * 
     * @param usuarios Lista de usuários a ser salva.
     * @param caminho  Caminho do arquivo onde os usuários serão armazenados.
     */
    public static void salvarUsuarios(List<Usuario> usuarios, String caminho) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            System.err.println("Erro ao salvar usuários: " + e.getMessage());
        }
    }

    /**
     * Carrega uma lista de usuários de um arquivo.
     * 
     * @param caminho Caminho do arquivo de onde os usuários serão carregados.
     * @return Lista de usuários carregados.
     */
    public static List<Usuario> carregarUsuarios(String caminho) {
        List<Usuario> usuarios = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar usuários: " + e.getMessage());
        }
        return usuarios;
    }
}
