package classe;

public class Jantar {

    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.250);
        Comida comida2 = new Comida("Sorvete", 1.0);
        Pessoa pessoa  = new Pessoa();
        System.out.println("Peso inicial = " +  pessoa.getPeso() + " kg");
        pessoa.comer(comida1);
        pessoa.comer(comida2);
        String msg = String.format("Comidas que o %s comeu hoje", pessoa.getNome());
        System.out.println(msg);
        pessoa.getComidasList().forEach(comida -> {
            System.out.println(comida.getNome());
        });
        System.out.println("Peso final = " +  pessoa.getPeso() + " kg");
    }

}
