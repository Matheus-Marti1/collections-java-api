package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;
    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.getNome().equals(nome)) {
                itensParaRemover.add(item);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : listaItens) {
            double precoTotalItem = item.getPreco() * item.getQuantidade();
            valorTotal += precoTotalItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 25.99, 3);
        carrinho.adicionarItem("Item 2", 30.99, 2);
        carrinho.adicionarItem("Item 3", 50.60, 1);
        carrinho.exibirItens();
        System.out.printf("Valor total do carrinho: %.2f %n", carrinho.calcularValorTotal());
        carrinho.removerItem("Item 1");
        carrinho.exibirItens();
        System.out.printf("Valor total do carrinho: %.2f %n", carrinho.calcularValorTotal());

    }
}
