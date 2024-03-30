package com.braulio.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    private List<String> lista;
    
    public void llenarLista(){

        lista = new ArrayList<>();
        lista.add("Cecilia");
        lista.add("Braulio");
        lista.add("Andrés");
    }

    public void usarForEach(){

        //lista.forEach(e -> System.out.println(e));
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf(){
        lista.removeIf(x -> x.equalsIgnoreCase("braulio"));
    }

    public void usarSort(){
        lista.sort((x,y) -> x.compareTo(y));
        //lista.sort((x,y) -> y.compareTo(x));
    }

    public static void main(String[] args) {
        ForEach app = new ForEach();
        
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }
}

