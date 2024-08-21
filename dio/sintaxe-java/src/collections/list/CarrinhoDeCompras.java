package collections.list;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<Item> filtrarPorPreco(double precoMin, double precoMax) {
        List<Item> listaFiltradaPorPreco = new ArrayList<>();
        if (!listaDeCompras.isEmpty()) {
            for (Item it : listaDeCompras) {
                if (it.getPreco() >= precoMin && it.getPreco() <= precoMax) {
                    listaFiltradaPorPreco.add(it);
                }
            }
        }
        return listaFiltradaPorPreco;
    }

    public List<Item> ordenarPorPreco() {
        List<Item> listaOrdenadaPorPreco = new ArrayList<>(listaDeCompras);
        Collections.sort(listaOrdenadaPorPreco);
        return listaOrdenadaPorPreco;
    }

    public List<Item> exibirItens() {
        return listaDeCompras;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Queijo", 7.99, 1);
        carrinho.adicionarItem("Pão", 1.10, 5);
        carrinho.adicionarItem("Tomate", 1.75, 2);
        carrinho.adicionarItem("Queijo", 7.99, 1);

        System.out.println("Itens entre 1.00 e 3.00: " + carrinho.filtrarPorPreco(1.00, 3.00));

        System.out.println("Carrinho ordenado por preço: " + carrinho.ordenarPorPreco());

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());
        
        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("Queijo");

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());

        carrinho.removerItem("Pão");

        System.out.println("Exibindo itens do carrinho: " + carrinho.exibirItens());

        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());
    }
}
