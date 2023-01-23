package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        BinaryOperator<Double> calculaPrecoRealComDesconto = (preco, desconto) -> {
            return preco * (1 - desconto);
        };
        UnaryOperator<Double> calculaImposto = preco -> {
            return (preco >= 2500) ? preco * (1 + 0.085) : preco;
        };
        UnaryOperator<Double> calculaFrete = preco -> {
            return (preco >= 3000) ? preco + 100 : preco + 50;
        };
        UnaryOperator<Double> arredondaNumero = numero -> {
            BigDecimal bd = new BigDecimal(numero).setScale(2, RoundingMode.HALF_EVEN);
            return bd.doubleValue();
        };
        Function<Double, String> formataNumero = numero -> {
            String formatar = "R$" + numero;
            return formatar.replace('.',',');
        };

        String resultado = calculaPrecoRealComDesconto
                .andThen(calculaImposto)
                .andThen(calculaFrete)
                .andThen(arredondaNumero)
                .andThen(formataNumero)
                .apply(p.preco, p.desconto);
        System.out.println(resultado);
    }

}
