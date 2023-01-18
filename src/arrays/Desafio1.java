package arrays;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[entrada.nextInt()];
        for(int i = 0; i < notas.length; i++){
            notas[i] = entrada.nextDouble();
        }
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        System.out.println("Media = " + (soma/notas.length));


        entrada.close();
    }

}
