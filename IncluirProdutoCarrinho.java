import java.util.ArrayList;

public class IncluirProdutoCarrinho 
{
    public static void incluirProdutoCarrinho(ArrayList<ItensCarrinho> carrinho, ArrayList<Produto> listaProdutos, String idProduto, int quantidade) {
        for(Produto produto : listaProdutos) {
            if(produto.getID().equals(idProduto)) {
                ItensCarrinho item = new ItensCarrinho();
                item.setID(produto);
                item.setQuantidade(quantidade);
                carrinho.add(item);
                System.out.println("Produto adicionado ao carrinho com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
