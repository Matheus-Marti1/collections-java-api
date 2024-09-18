package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        for (Palavra p : palavraSet){
            if (p.getPalavra().equals(palavra)){
                palavraSet.remove(p);
                break;
            }
        }
    }
    public void verificarPalavra(String palavra){
        boolean palavraExiste = false;
        for (Palavra p : palavraSet){
            if (p.getPalavra().equals(palavra)){
                System.out.println("A palavra '" + palavra + "' está presente no conjunto.");
                palavraExiste = true;
                break;
            }
        }
        if (!palavraExiste){
            System.out.println("A palavra '" + palavra + "' não está presente no conjunto.");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();
        palavra.adicionarPalavra("Palavra 1");
        palavra.adicionarPalavra("Palavra 2");
        palavra.adicionarPalavra("Palavra 3");
        palavra.adicionarPalavra("Palavra 3");
        palavra.adicionarPalavra("Palavra 4");
        palavra.exibirPalavrasUnicas();
        palavra.verificarPalavra("Palavra 2");
        palavra.verificarPalavra("Palavra 5");
        palavra.removerPalavra("Palavra 3");
        palavra.exibirPalavrasUnicas();
        palavra.verificarPalavra("Palavra 3");
    }
}
