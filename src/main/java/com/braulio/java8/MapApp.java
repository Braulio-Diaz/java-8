package com.braulio.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapApp {

    private Map<Integer, String> map;

    public void llenarMap() {

        map = new HashMap<>();
        map.put(1, "Charmander");
        map.put(2, "Charmeleon");
        map.put(3, "Charizard");
    }

    public void imprimirV7() {
        for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public void imprimirV8() {
        //map.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));

        map.entrySet().stream().forEach(System.out::println);
    }

    public void insertarSiAusente() {
        map.putIfAbsent(4, "Pikachu");
    }

    public void operarSiPresente() {
        map.computeIfPresent(5, (k, v) -> k + v);
        System.out.println(map.get(3));
        // map.entrySet().stream().filter(x ->
        // x.getValue().contains("o")).forEach(System.out::println);;
    }

    public void obtenerOrPredeterminado() {
        String valor = map.getOrDefault(3, "Valor predeterminado");
        System.out.println(valor);
    }

    public void recolectar() {
        Map<Integer, String> mapRecolectado = map.entrySet().stream().filter(x -> x.getValue()
                .contains("n")).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        mapRecolectado.forEach((k, v) -> System.out.println("LLave: " + k + " Valor: " + v));
    }

    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.llenarMap();
        // app.imprimirV7();
        // app.insertarSiAusente();
        // app.operarSiPresente();
        // app.obtenerOrPredeterminado();
        app.recolectar();
        // app.imprimirV8();

    }

}
