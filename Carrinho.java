import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItensCarrinho> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItensCarrinho item) {
        this.itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItensCarrinho item : this.itens) {
            total += item.getID().getValor() * item.getQuantidade();
        }
        return total;
    }
}
