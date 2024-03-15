package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t) {
        System.out.printf("Titulo adicionado: %s %n", t.getNome());
        System.out.printf("Tempo para assistir: %d %n", t.getDuracaoEmMinutos());
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
