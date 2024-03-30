package com.braulio.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamParalelos {

    List<Integer> numeros;

    public void llenarLista(){

        numeros = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numeros.add(i);
        }
    }

    public void streamSecuencial(){

        numeros.stream().forEach(System.out::println);
    }

    public void streamParalelos(){
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamParalelos app = new StreamParalelos();
        
        app.llenarLista();
        //app.streamSecuencial();
        app.streamParalelos();
    }

}
