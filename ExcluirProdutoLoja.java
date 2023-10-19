import java.util.ArrayList;

public class ExcluirProdutoLoja {
    public static void excluirProduto(ArrayList<Produto> listaProdutos, String idProduto) {

      int i;

        for ( i = 0; i < listaProdutos.size(); i++) {
            if(listaProdutos.get(i).getidProduto().equals(idProduto)) {
                listaProdutos.remove(i);
                System.out.println("Produto excluído com sucesso!");
                return;
            }
        }
        System.out.println("Produto não foi encontrado.");
    }
    }

