package br.com.uelinton.scrrenmatch.calculos;

import br.com.uelinton.screematch.modelos.Movie;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Movie f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
