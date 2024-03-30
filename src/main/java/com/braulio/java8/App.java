package com.braulio.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

         public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Braulio");
        lista.add("Díaz");
        lista.add("Gajardo");

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

    };



    public static void main(String[] args) {

        LambdaApp app = new LambdaApp();
        app.ordenar();

    }
}
