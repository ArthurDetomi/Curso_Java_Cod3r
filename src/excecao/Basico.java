package excecao;

public class Basico {

    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            imprimirNomeDoALuno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro :" + e.getMessage());
        }

        System.out.println("Fim!!");
    }

    public static void imprimirNomeDoALuno(Aluno aluno) {
        System.out.println(aluno.nome);
    }


}
