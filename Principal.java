import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println("Sistema de Gerenciamento de Estoque");
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade em estoque: " + quantidade);
            System.out.println("Menu de Opções:");
            System.out.println("1. Consultar quantidade em estoque");
            System.out.println("2. Adicionar produtos ao estoque");
            System.out.println("3. Retirar produtos do estoque");
            System.out.println("4. Alterar nome do produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.println("Quantidade em estoque: " + quantidade);
                if (quantidade < 10) {
                    System.out.println("Atenção: Estoque está baixo (menos de 10 unidades).");
                }
            } else if (opcao == 2) {
                System.out.print("Quantidade a ser adicionada: ");
                int quantidadeAdicionar = scanner.nextInt();
                quantidade += quantidadeAdicionar;
                System.out.println(quantidadeAdicionar + " unidades adicionadas.");
            } else if (opcao == 3) {
                System.out.print("Quantidade a ser retirada: ");
                int quantidadeRetirar = scanner.nextInt();
                if (quantidadeRetirar <= quantidade) {
                    quantidade -= quantidadeRetirar;
                    System.out.println(quantidadeRetirar + " unidades retiradas.");
                } else {
                    System.out.println("Quantidade insuficiente em estoque.");
                }
            } else if (opcao == 4) {
                System.out.print("Novo nome do produto: ");
                produto = scanner.nextLine();
                System.out.println("Nome do produto alterado para: " + produto);
            } else if (opcao == 5) {
                System.out.println("Saindo do programa. Obrigado!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
