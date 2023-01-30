package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "Js \n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        // pegando um subconjunto
        Arrays.stream(maisLangs, 0, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("Php ", "Kotlin ", "C\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "Arroz").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach();
    }

}
