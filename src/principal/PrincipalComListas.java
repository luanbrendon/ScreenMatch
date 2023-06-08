package principal;

import br.com.luan.screenmatch.modelos.Filme;
import br.com.luan.screenmatch.modelos.Serie;
import br.com.luan.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);
        Filme outro = new Filme("Dogs", 2014);
        outro.avalia(6);
        var filmeDoLuan = new Filme("Harry Potter", 2003);
        filmeDoLuan.avalia(10);
        Serie serie = new Serie("La Casa de Papel",2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLuan);
        lista.add(outro);
        lista.add(favorito);
        lista.add(serie);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificacão " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Luan");
        buscaPorArtista.add("Luiza");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulo ordenada");

       Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
