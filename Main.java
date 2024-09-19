import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- Menu de Cadastro de Pessoas ---");
            System.out.println("1. Cadastrar nova pessoa");
            System.out.println("2. Exibir todas as pessoas cadastradas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    // Coletando dados da pessoa
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Data de Nascimento (DD/MM/AAAA): ");
                    String dataNascimento = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    // Criando objeto Pessoa
                    Pessoa novaPessoa = new Pessoa(nome, cpf, email, dataNascimento, telefone);

                    // Adicionando pessoa à lista
                    pessoas.add(novaPessoa);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 2:
                    // Exibindo todas as pessoas cadastradas
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa pessoa : pessoas) {
                            System.out.println("\n--- Pessoa Cadastrada ---");
                            pessoa.exibirDados();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
