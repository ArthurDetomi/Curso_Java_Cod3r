package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {
        Calculo calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.executar(4, 3));

        // implicitamente existe o return no x * y
        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(5, 5));

        System.out.println(calculo.legal());

        System.out.println(Calculo.muitoLegal());
    }

}
