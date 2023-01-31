package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        Filme filme1 = new Filme(1, "Chucky", 18);
        Filme filme2 = new Filme(2, "Branca de neve", 0);
        Filme filme3 = new Filme(3, "Game of Thornes", 16);
        Filme filme4 = new Filme(1, "Pingu", 0);

        List<Filme> filmes = Arrays.asList(filme1, filme2, filme3, filme4);

        Predicate<Filme> familyFriend = filme -> filme.getFaixaEtaria() <= 12;
        Predicate<Filme> comecaComP = filme -> {
            char c = filme.getNome().charAt(0);
            return c == 'p' || c == 'P';
        };
        Function<Filme, String> filhaPodeVer = filme -> "Maria voce pode assistir " + filme.getNome();

        filmes.stream()
                .filter(familyFriend)
                .filter(comecaComP)
                .map(filhaPodeVer)
                .forEach(System.out::println);

    }

}
