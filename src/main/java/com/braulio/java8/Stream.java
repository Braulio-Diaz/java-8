package com.braulio.java8;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    private List<String> list;
    private List<String> number;

    public void llenarLista(){

        list = new ArrayList<>();
        list.add("Cecilia");
        list.add("Braulio");
        list.add("Andrés");

        number = new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");
    }

    public void filtrar(){
        list.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);
        list.stream().filter(x -> x.startsWith("A")).forEach(x -> System.out.println(x));
    }

    public void ordenar(){
        list.stream().sorted().forEach(System.out::println);

        //list.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);

        /*list.sort((x,y)->x.compareTo(y));
        for (String elemento : list) {
            System.out.println(elemento);
        }*/
    }

    public void transformar(){
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        
        /*for (String x : number) {
            int numero = Integer.parseInt(x) + 1;
            System.out.println(numero);
        }*/

        number.stream().map(x -> Integer.parseInt(x)+5).forEach(System.out::println);
    }

    public void limitar(){
        list.stream().limit(2).forEach(System.out::println);
        number.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long x = list.stream().count();
        System.out.println(x);
        
        String y = number.get(1);
        System.out.println(y);
        
        long z = number.stream().count();
        System.out.println(z);
    }

    public static void main(String[] args) {
        Stream app = new Stream();
        app.llenarLista();
        //app.filtrar();
        //app.ordenar();
        //app.transformar();
        //app.limitar();
        app.contar();
    }
}