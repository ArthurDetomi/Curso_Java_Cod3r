package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        // <Recebe esse tipo, Retorna esse tipo>
        Function<Integer, String> parOuImpar = numero ->
                (numero % 2 == 0) ? "Par" : "Impar";
        Function<String, String> oResultadoEh = valor -> "O resultado é " + valor;
        Function<String, String> empolgado =
                valor -> valor + "!!!!";
        Function<String, String> duvida =
                valor -> valor + "???";

        // composição de funções
        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoEh)
                .andThen(empolgado)
                .apply(32);
        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoEh)
                .andThen(duvida)
                .apply(32);

        System.out.println(resultadoFinal1);
        System.out.println(resultadoFinal2);
        System.out.println(parOuImpar.apply(2));
    }

}
