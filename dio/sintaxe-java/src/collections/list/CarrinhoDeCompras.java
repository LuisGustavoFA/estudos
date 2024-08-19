package collections.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item it : listaDeCompras) {
            if (it.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(it);
            }
        }
        listaDeCompras.removeAll(itensParaRemover);
    }
    
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item it : listaDeCompras) {
            total += (it.getPreco() * it.getQuantidade());
        }
        return total;
    }

    public String exibirItens() {
        String ret = "";
        for (Item it : listaDeCompras) {
            ret = ret.concat(" // " + it.toString() + " // ");
        }
        return ret;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Pão", 1.10, 5);
        carrinho.adicionarItem("Tomate", 1.75, 2);
        carrinho.adicionarItem("Queijo", 7.99, 1);
        carrinho.adicionarItem("Queijo", 7.99, 1);

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());
        
        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("Queijo");

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());

        carrinho.removerItem("Pão");

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());

        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());
    }
}
