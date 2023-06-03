package br.com.luan.screenmatch.calculos;

import br.com.luan.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minuto de " +titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}