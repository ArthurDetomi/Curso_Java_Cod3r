package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos alunos tem na turma:");
        int qtd_alunos = entrada.nextInt();
        System.out.println("Digite quantas notas tem cada aluno:");
        int qtd_notas = entrada.nextInt();
        double[][] notas_alunos = new double[qtd_alunos][qtd_notas];
        double soma_notas = 0;
        for(int i = 0; i < notas_alunos.length; i++){
            System.out.printf("Nota do aluno %d\n", i+1);
            for(int j = 0; j < notas_alunos[i].length; j++){
                System.out.printf("nota %d:\n", j+1);
                notas_alunos[i][j] = entrada.nextDouble();
                soma_notas += notas_alunos[i][j];
            }
        }
        double media = soma_notas / (qtd_alunos * qtd_notas);
        System.out.println("Media da turma = "+media);
        for(double[] nota_aluno : notas_alunos) {
            System.out.println(Arrays.toString(nota_aluno));
        }
        entrada.close();

    }

}
