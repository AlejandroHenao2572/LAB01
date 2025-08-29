package main.java.reto2;

import java.util.List;

public class CarreraParalela {
    public static int maximo(List<Integer> lista) {
        return lista.stream()
            .max(Integer::compareTo)
            .orElseThrow(() -> new IllegalArgumentException("La lista esta vacia"));
    }

    public static List<Integer> minimoRepetido(List<Integer> lista) {
        int min = lista.stream()
            .min(Integer::compareTo)
            .orElseThrow(() -> new IllegalArgumentException("La lista está vacía"));
        return lista.stream()
            .map(x -> min)
            .toList();
    }
}

