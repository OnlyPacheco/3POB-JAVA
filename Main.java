import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<ItensCarrinho> carrinho = new ArrayList<>();

        Menu.executarMenu(listaProdutos, scanner);
        MenuCarrinho.executarMenu(carrinho, listaProdutos, scanner);
        scanner.close();

    }
}