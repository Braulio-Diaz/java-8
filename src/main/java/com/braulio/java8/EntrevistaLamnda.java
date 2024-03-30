package com.braulio.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EntrevistaLamnda {

    public void order (){

        List<String> list = new ArrayList<>();
        list.add("Camilo");
        list.add("Andrés");
        list.add("Braulio");

        Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2));

        list.forEach(System.out::println);
        /*for(String element : list){
            System.out.println(element);
        };*/
    }

    public void ordenar (){

        List<String> lista = new ArrayList<>();
        lista.add("Andrés");
        lista.add("Carlos");
        lista.add("Braulio");

        Collections.sort(lista, (String n1, String n2) -> n2.compareTo(n1));

        for (String elementos : lista){
            System.out.println(elementos);
        }
    }

    public static boolean esPalindromo(String palabra){

        String palabraProcesada = palabra.toLowerCase();
        return palabraProcesada.equals(new StringBuilder(palabraProcesada).reverse().toString());
    }

    public static boolean esPalindromo2 (String palabra2){

        String palabraProcesada2 = palabra2.toLowerCase();
        return palabraProcesada2.equals(new StringBuilder(palabraProcesada2).reverse().toString());
    }

    public static void main(String[] args) {
        EntrevistaLamnda app = new EntrevistaLamnda();
        app.order();
        app.ordenar();

        String palabra = "cata";
        System.out.println("¿Es palindromo? " + esPalindromo(palabra));

        String palabra2 = "Oto";
        System.out.println("¿Es palindromo?: " + esPalindromo2(palabra2));
    }
}
