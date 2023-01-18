package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");  // adiciona mas caso já exista substitui
        usuarios.put(1, "Marcos");
        usuarios.put(2, "Joao");
        usuarios.put(3, "Ines");
        usuarios.put(4, "Matheus");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // retorna todas as chaves int
        System.out.println(usuarios.values()); // retorma todos os valores
        System.out.println(usuarios.entrySet()); // retorna chave valor

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Joao"));
        System.out.println(usuarios.get(2)); // retorna o value da respectiva chave
        // se baseando na chave

        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for(String value : usuarios.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println(registro.getKey()+" "+ registro.getValue());
        }

        usuarios.remove(1); // retorna o valor do que foi removido
        usuarios.remove(2, "marcos"); // retorna boolean

    }

}
