package br.com.luan.screenmatch.modelos;

import br.com.luan.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    private int totalVisualicacoes;

    public int getTotalVisualicacoes() {
        return totalVisualicacoes;
    }

    public void setTotalVisualicacoes(int totalVisualicacoes) {
        this.totalVisualicacoes = totalVisualicacoes;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualicacoes > 100){
            return 4;
        }else {
            return 2;
        }

    }
}
