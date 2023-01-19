package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {
        //Não int -> Double
        //double -> Double

        BinaryOperator<Double> calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.apply(4.0, 3.0));

        // implicitamente existe o return no x * y
        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(5.0, 5.0));


        BinaryOperator<Integer> calculo2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo2.apply(4, 3));

        // implicitamente existe o return no x * y
        calculo = (x, y) -> x * y;
        System.out.println(calculo2.apply(5, 5));

    }

}
