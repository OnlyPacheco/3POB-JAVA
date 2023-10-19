import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItensCarrinho> itens;
    private double valorTotal;

    public Carrinho() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0; 
    }

    public void adicionarItem(ItensCarrinho item) {
        this.itens.add(item);
        atualizarValorTotal();
    }

    public void atualizarCarrinho(ArrayList<ItensCarrinho> carrinho) {
        this.itens = carrinho;
        atualizarValorTotal();
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    private void atualizarValorTotal() {
        double total = 0;
        for (ItensCarrinho item : this.itens) {
            total += item.getID().getValor() * item.getQuantidade();
        }
        this.valorTotal = total;
    }
}
