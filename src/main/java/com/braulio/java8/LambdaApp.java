package com.braulio.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {
    
    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Díaz");
        lista.add("Braulio");
        lista.add("Gajardo");

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
        for(String elemento : lista){
            System.out.println(elemento);
        };

    };

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LambdaApp app = new LambdaApp();
        app.ordenar();
    }
}