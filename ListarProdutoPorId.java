import java.util.ArrayList;

public class ListarProdutoPorId {
    public static void listarProdutoPorId(ArrayList<Produto> listaProdutos, String idProduto) {

        for (Produto produto : listaProdutos) {
            if (produto.getidProduto().equals(idProduto)) {
                System.out.println("Produto encontrado:");
                System.out.println("ID do Produto: " + produto.getidProduto());
                System.out.println("Nome do Produto: " + produto.getnome());
                System.out.println("Valor: " + produto.getValor());     
                System.out.println();
                return;
            }
        }
        System.out.println("Produto não foi encontrado.");
    }

    }

