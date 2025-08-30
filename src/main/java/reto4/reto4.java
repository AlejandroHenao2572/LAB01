package main.java.reto4;

import java.util.Hashtable;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;

public class reto4 {

    public static Hashtable<String, Integer> almacenarSinDuplicados(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> par : lista) {
            if (!tabla.containsKey(par.getKey())) {
                tabla.put(par.getKey(), par.getValue());
            }
        }
        return tabla;
    }
}
