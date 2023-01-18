package classe;

public class EqualsHashcode {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Arthur");
        usuario1.setEmail("arthur@email.com");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Arthur");
        usuario2.setEmail("arthur@email.com");

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));

    }

}
