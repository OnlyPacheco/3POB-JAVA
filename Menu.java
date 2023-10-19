import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Excluir Produto");
        System.out.println("4. Listar Produto por ID");
        System.out.println("5. Listar Todos Produtos");
        System.out.println("6. Sair");
    }

    public static void executarMenu(ArrayList<Produto> listaProdutos, Scanner scanner) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    IncluirProdutoLoja.incluirProduto(listaProdutos,scanner);
                    break;

                      case 2:
    System.out.print("Informe o ID do Produto a ser alterado: ");
    String idproduto = scanner.nextLine();


    Produto novoProduto = new Produto(); 

    ExcluirProduto.excluirProduto(listaProdutos,idProduto);           
    IncluirProduto.incluirProduto(listaProdutos, scanner);


    break;


                case 3:
                    System.out.print("Informe o ID do Produto a ser excluído: ");
                    String idExcluir = scanner.nextLine();
                    ExcluirProdutoLoja.excluirProduto(listaProdutos, idExcluir);
                    break;
                case 4:
                    System.out.print("Informe o ID do produto a ser listado: ");
                    String idListar = scanner.nextLine();
                    ListarProdutoPorId.listarProdutoPorId(listaProdutos, idListar);
                    break;
                case 5:
                    ListarTodosProdutos.listarTodosProdutos(listaProdutos);
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }
}
