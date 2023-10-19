import java.util.ArrayList;

public class IncluirProdutoCarrinho 
{
  public static void incluirProdutoCarrinho(ArrayList<ItensCarrinho> carrinho, Produto produto, int quantidade) {
      ItensCarrinho item = new ItensCarrinho();
      item.setID(produto); 
      item.setQuantidade(quantidade); 
      carrinho.add(item);
      System.out.println("Produto adicionado ao carrinho com sucesso!");
  }
       
    }

