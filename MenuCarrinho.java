import java.util.ArrayList;
import java.util.Scanner;

public class MenuCarrinho {
    public static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Incluir Produto no Carrinho");
        System.out.println("2. Listar Produtos no Carrinho");
        System.out.println("3. Sair");
    }

    public static void executarMenu(ArrayList<ItensCarrinho> carrinho, ArrayList<Produto> listaProdutos, Scanner scanner) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o ID do produto a ser incluído: ");
                    String idProduto = scanner.nextLine();
                    System.out.print("Informe a quantidade do produto a ser incluído: ");
                    int quantidade = scanner.nextInt();
                    IncluirProdutoCarrinho.incluirProdutoCarrinho(carrinho, listaProdutos, idProduto, quantidade);
                    break;
                case 2:
                    ListarProdutosCarrinho.listarProdutosCarrinho(carrinho);
                    break;
                case 3:
                    System.out.println("Saindo do menu do Carrinho.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}