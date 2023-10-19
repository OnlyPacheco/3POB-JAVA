import java.util.ArrayList;
import java.util.Scanner;

public class IncluirProdutoLoja {
    public static void incluirProduto(ArrayList<Produto> listaProdutos, Scanner scanner) {
        System.out.print("ID do Produto : ");
        String idProduto = scanner.nextLine();

        System.out.print("Nome do Produto : ");
        String nome = scanner.nextLine();
        
        System.out.print("Valor do Produto eh: ");
        double valor = scanner.nextDouble();

        // Adicionando o produto ao array de lista
        Produto produto = new Produto(idProduto,nome,valor);
        listaProdutos.add(produto);
        System.out.println("Produto incluído com sucesso!");
    }
}
