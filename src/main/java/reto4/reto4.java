package main.java.reto4;

import java.util.*;
import java.util.List;

public class reto4 {
    
    public static HashMap<String, Integer> almacenarEnHashMap(List<ParClaveValor> pares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (ParClaveValor par : pares) {
            if (!mapa.containsKey(par.clave)) {
                mapa.put(par.clave, par.valor);
            }
        }
        return mapa;
    }
  
    public static Hashtable<String, Integer> almacenarSinDuplicados(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> par : lista) {
            if (!tabla.containsKey(par.getKey())) {
                tabla.put(par.getKey(), par.getValue());
            }
        }
        return tabla;
    }
    
    public static void main(String[] args) {
        List<ParClaveValor> pares = List.of(
            new ParClaveValor("a", 1),
            new ParClaveValor("b", 2),
            new ParClaveValor("a", 3), // Esta clave duplicada sera ignorada
            new ParClaveValor("c", 4),
            new ParClaveValor("b", 5)  // Esta clave duplicada será ignorada
        );
        
        HashMap<String, Integer> resultado = almacenarEnHashMap(pares);
        System.out.println("HashMap resultante: " + resultado);
        System.out.println("Hashtable resultante: " + resultado2);
    }

    public static HashMap<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashTable) {
        HashMap<String, Integer> mapaCombinadoHashMap = new HashMap<>();

        // Agregar elementos del Hashtable primero, tinen prioridad
        mapaCombinadoHashMap.putAll(hashTable);

        // Agregar elementos del HashMap solo si la clave no existe ya
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (!mapaCombinadoHashMap.containsKey(entry.getKey())) {
                mapaCombinadoHashMap.put(entry.getKey(), entry.getValue());
            }
        }

        return mapaCombinadoHashMap;
    }