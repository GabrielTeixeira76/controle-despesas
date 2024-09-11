package src.main;

import src.controller.DespesaController;
import src.controller.TipoDespesaController;
import src.controller.UsuarioController;
import src.model.Despesa;
import src.model.TipoDespesa;
import src.model.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe principal para executar o sistema de controle de despesas.
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DespesaController despesaController = new DespesaController();
    private static final TipoDespesaController tipoDespesaController = new TipoDespesaController();
    private static final UsuarioController usuarioController = new UsuarioController();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Menu Principal:");
            System.out.println("1. Registrar Nova Despesa");
            System.out.println("2. Registrar Pagamento de Despesa");
            System.out.println("3. Exibir Despesas Pendentes no Período");
            System.out.println("4. Exibir Despesas Pagas no Período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (choice) {
                case 1:
                    registrarDespesa();
                    break;
                case 2:
                    registrarPagamento();
                    break;
                case 3:
                    exibirDespesas("pendente");
                    break;
                case 4:
                    exibirDespesas("paga");
                    break;
                case 5:
                    gerenciarTiposDespesa();
                    break;
                case 6:
                    gerenciarUsuarios();
                    break;
                case 7:
                    running = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
    }

    private static void registrarDespesa() {
        System.out.println("Digite a descrição da despesa:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o valor da despesa:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir o caractere de nova linha
        System.out.println("Digite a data de vencimento (Formato: YYYY-MM-DD):");
        LocalDate dataVencimento = LocalDate.parse(scanner.nextLine());
        System.out.println("Digite o nome do tipo de despesa:");
        String tipoNome = scanner.nextLine();
        TipoDespesa tipoDespesa = new TipoDespesa(tipoNome);

        Despesa despesa = new Despesa(descricao, valor, dataVencimento, tipoDespesa);
        despesaController.adicionarDespesa(despesa);
        System.out.println("Despesa registrada com sucesso.");
    }

    private static void registrarPagamento() {
        System.out.println("Digite a descrição da despesa para registrar o pagamento:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o valor do pagamento:");
        double valorPagamento = scanner.nextDouble();
        scanner.nextLine(); // Consumir o caractere de nova linha
        System.out.println("Digite a data do pagamento (Formato: YYYY-MM-DD):");
        LocalDate dataPagamento = LocalDate.parse(scanner.nextLine());

        despesaController.anotarPagamento(descricao, valorPagamento, dataPagamento);
        System.out.println("Pagamento registrado com sucesso.");
    }

    private static void exibirDespesas(String status) {
        System.out.println("Digite a data de início (Formato: YYYY-MM-DD):");
        LocalDate inicio = LocalDate.parse(scanner.nextLine());
        System.out.println("Digite a data de fim (Formato: YYYY-MM-DD):");
        LocalDate fim = LocalDate.parse(scanner.nextLine());

        despesaController.listarDespesas(status, inicio, fim);
    }

    private static void gerenciarTiposDespesa() {
        System.out.println("1. Adicionar Novo Tipo de Despesa");
        System.out.println("2. Listar Tipos de Despesa");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        switch (choice) {
            case 1:
                System.out.println("Digite o nome do novo tipo de despesa:");
                String nomeTipo = scanner.nextLine();
                TipoDespesa tipoDespesa = new TipoDespesa(nomeTipo);
                tipoDespesaController.adicionarTipoDespesa(tipoDespesa);
                System.out.println("Novo tipo de despesa adicionado com sucesso.");
                break;
            case 2:
                tipoDespesaController.listarTiposDespesa();
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }
    }

    private static void gerenciarUsuarios() {
        System.out.println("1. Adicionar Novo Usuário");
        System.out.println("2. Listar Usuários");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        switch (choice) {
            case 1:
                System.out.println("Digite o login do novo usuário:");
                String login = scanner.nextLine();
                System.out.println("Digite a senha do novo usuário:");
                String senha = scanner.nextLine();
                Usuario usuario = new Usuario(login, senha);
                usuarioController.adicionarUsuario(usuario);
                System.out.println("Novo usuário adicionado com sucesso.");
                break;
            case 2:
                usuarioController.listarUsuarios();
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }
    }
}
