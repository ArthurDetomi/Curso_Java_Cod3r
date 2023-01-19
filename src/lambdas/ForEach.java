package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Gui", "Claudio");
        System.out.println("Forma tradicional, for aprimorado");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("Lambda #01");
        aprovados.forEach(nome -> {
            System.out.println(nome);
        });
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("Method Reference");
        aprovados.forEach(System.out::println);

        System.out.println("Lambda #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("Method Reference #02");
        aprovados.forEach(ForEach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }

}
