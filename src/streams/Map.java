package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        Consumer<String> println = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        // forEach é uma função terminal
        marcas.stream().map(String::toUpperCase).forEach(println);

        // UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
         // UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("Usando composição");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(println);

    }

}
