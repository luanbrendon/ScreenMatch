import br.com.luan.screenmatch.calculos.CalculadoraDeTempo;
import br.com.luan.screenmatch.calculos.Recomendacao;
import br.com.luan.screenmatch.modelos.Episodio;
import br.com.luan.screenmatch.modelos.Filme;
import br.com.luan.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualicacoes(300);
        recomendacao.filtra(episodio);

        var filmeDoLuan = new Filme();
        filmeDoLuan.setDuracaoEmMinutos(200);
        filmeDoLuan.setNome("Harry Potter");
        filmeDoLuan.setAnoDeLancamento(2023);
        filmeDoLuan.avalia(10);

        ArrayList<Filme> lisaDeFilmes = new ArrayList<>();
        lisaDeFilmes.add(filmeDoLuan);
        lisaDeFilmes.add(outro);
        lisaDeFilmes.add(favorito);

        System.out.println("Tamanho da lista " + lisaDeFilmes.size());
        System.out.println("Primeiro filme " + lisaDeFilmes.get(0).getNome());
        System.out.println(lisaDeFilmes);
        System.out.println("toString do filme " + lisaDeFilmes.get(0).toString());

    }

}