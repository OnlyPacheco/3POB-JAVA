// Vai listar os itens presentes no carrinho

import java.util.ArrayList;

public class ListarProdutosIncluidosCarrinho {
    public static void listarProdutosIncluidos(ArrayList<ItensCarrinho> carrinho) {
        for (ItensCarrinho item : carrinho) {
            System.out.println("ID do Produto: " + item.getID().getidProduto());
            System.out.println("Nome do Produto: " + item.getID().getnome());
            System.out.println("Valor: " + item.getID().getValor());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println();
        }
    }
}
 