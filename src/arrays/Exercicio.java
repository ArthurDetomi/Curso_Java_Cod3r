package arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {
        double[] numeros = new double[5];
        Random random = new Random();
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(10);
        }
        String array = Arrays.toString(numeros);
        System.out.println(array);

        double[] notasAluno = {1.2, 1.4, 7.8, 6.7};
        for(double nota : notasAluno){
            System.out.println(nota);
        }

    }

}
