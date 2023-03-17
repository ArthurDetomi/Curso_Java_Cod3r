package generics;

public class CaixaTeste {

    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Ola tudo bem");

        String abrir = caixaA.abrir();
        System.out.println(abrir);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(2.2);

        Double abrir2 = caixaB.abrir();
        System.out.println(abrir2);
    }

}
