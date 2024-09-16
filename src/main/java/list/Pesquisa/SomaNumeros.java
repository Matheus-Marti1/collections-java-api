package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> listaNumeros;
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }
    public void adicionaNumero(int numero) {
        this.listaNumeros.add(new Numero(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        for (Numero numero : listaNumeros) {
            soma += numero.getNumero();
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (Numero numero : listaNumeros) {
            if (numero.getNumero() > maiorNumero) {
                maiorNumero = numero.getNumero();
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.getFirst().getNumero();
        for (Numero numero : listaNumeros) {
            if (numero.getNumero() < menorNumero) {
                menorNumero = numero.getNumero();
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionaNumero(1);
        somaNumeros.adicionaNumero(3);
        somaNumeros.adicionaNumero(2);
        somaNumeros.adicionaNumero(10);
        somaNumeros.adicionaNumero(5);
        somaNumeros.adicionaNumero(4);
        somaNumeros.adicionaNumero(8);
        somaNumeros.exibirNumeros();
        System.out.println("Soma dos números da lista: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
