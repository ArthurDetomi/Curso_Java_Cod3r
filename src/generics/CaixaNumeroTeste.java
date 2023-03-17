package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
        caixaA.guardar(2.3);
        Double abrir = caixaA.abrir();
        System.out.println(abrir);


        CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
        caixaB.guardar(10);
        Integer abrir2 = caixaB.abrir();
        System.out.println(abrir2);
    }

}
