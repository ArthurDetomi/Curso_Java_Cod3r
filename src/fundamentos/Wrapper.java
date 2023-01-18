package fundamentos;

public class Wrapper {

    public static void main(String[] args) {

        Byte b = 100;
        Long e = 3L;
        Long c = 4L;
        Long a = (e > c)? 1000000L: 2L;
        Integer i = Integer.parseInt("1000");
        Short h = 5;

        System.out.println(b.byteValue());
        System.out.println(a.toString());
        System.out.println(i);




    }

}
