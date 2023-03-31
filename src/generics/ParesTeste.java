package generics;

public class ParesTeste {

    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Arthur");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(2, "Maria");
        resultadoConcurso.adicionar(3, "Ana");

        resultadoConcurso.getItens()
                .forEach(par -> System.out.println(par.getValor()));
    }

}
