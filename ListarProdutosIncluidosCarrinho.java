// Vai listar os itens presentes no carrinho

import java.util.ArrayList;

public class ListarProdutosIncluidosCarrinho {
    public static void listarProdutosIncluidos(ArrayList<ItensCarrinho> carrinho, Carrinho carrinhoObj) {
  
        for (ItensCarrinho item : carrinho) {
            Produto produto = item.getID();
            System.out.println("ID do Produto: " + produto.getidProduto());
            System.out.println("Nome do Produto: " + produto.getnome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println();
        }

        double carrinhoTotal = carrinhoObj.getValorTotal();
        System.out.println("Valor Total do Carrinho: " + carrinhoTotal);
    }
}
