package com.braulio.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lambda2App {
    
    public void order(){
        List<String> list = new ArrayList<>();
        list.add("Daria");
        list.add("Carlos");
        list.add("Andres");

        Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));

        for(String element : list){
            System.out.println(element);
        };
    }

    public double calcular(){
        LambdaInterfaceOperacion operacion = (double x, double y) -> (x+y)/2;
        return operacion.calcularPromedio(10, 2);
    };


    public static void main(String[] args) {
        lambda2App lambda2App = new lambda2App();
        lambda2App.order();
        System.out.println(lambda2App.calcular());
    }
}
