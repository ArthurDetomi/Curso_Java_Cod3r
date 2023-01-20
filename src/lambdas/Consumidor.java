package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);

        Produto p1 = new Produto("Caneta", 2.50, 0.12);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Mochila", 80.0, 0.12);
        Produto p3 = new Produto("Lapis", 1.50, 0.12);
        Produto p4 = new Produto("Borracha", 0.90, 0.12);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.forEach(imprimirNome);
        produtos.forEach(System.out::println);
    }

}
