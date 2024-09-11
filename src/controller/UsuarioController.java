package src.controller;

import src.model.Usuario;
import src.utils.ArquivoUtil;
import src.utils.CriptografiaUtil;
import java.util.List;
import java.util.ArrayList;

/**
 * Controlador responsável pelo gerenciamento de usuários.
 */
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();
    private static final String ARQUIVO_USUARIOS = "usuarios.txt";

    /**
     * Adiciona um novo usuário à lista e salva no arquivo.
     *
     * @param usuario o usuário a ser adicionado
     */
    public void adicionarUsuario(Usuario usuario) {
        // Criptografa a senha do usuário antes de adicionar
        usuario.setSenha(CriptografiaUtil.criptografarSenha(usuario.getSenha()));
        usuarios.add(usuario);
        // Salva a lista de usuários no arquivo
        ArquivoUtil.salvarUsuarios(usuarios, ARQUIVO_USUARIOS);
    }

    /**
     * Lista todos os usuários carregados do arquivo.
     */
    public void listarUsuarios() {
        // Carrega os usuários do arquivo
        usuarios = ArquivoUtil.carregarUsuarios(ARQUIVO_USUARIOS);
        // Exibe o login de cada usuário
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getLogin());
        }
    }
}
