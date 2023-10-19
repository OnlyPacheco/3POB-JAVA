// Fazer apenas com que receba o id do produto que vem da classe Produto e salvar como this.ID por exemplo ,e a quantidade do produto que deve ser inserida por uma função separada ( exemplo IncluirProdutoCarrinho ) 

import java.util.ArrayList;

public class ItensCarrinho {
    private Produto ID;
    private int quantidade;

    public void setID(Produto id) {
        this.ID = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}