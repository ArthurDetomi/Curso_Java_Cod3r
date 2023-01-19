package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro = produto ->
                ((produto.preco * (1 - produto.desconto)) >= 750.0);

        Produto produto = new Produto("Notebook", 3436.25,0.20);
        System.out.println(isCaro.test(produto));
    }

}
