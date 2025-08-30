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
  
    public static Hashtable<String, Integer> almacenarSinDuplicados(List<ParClaveValor> pares) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (ParClaveValor par : pares) {
            if (!tabla.containsKey(par.clave)) {
                tabla.put(par.clave, par.valor);
            }
        }
        return tabla;
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
    
    public static void main(String[] args) {
        List<ParClaveValor> pares = List.of(
            new ParClaveValor("a", 1),
            new ParClaveValor("b", 2),
            new ParClaveValor("a", 3), // Esta clave duplicada sera ignorada
            new ParClaveValor("c", 4),
            new ParClaveValor("b", 5)  // Esta clave duplicada será ignorada
        );
        
        HashMap<String, Integer> resultado = almacenarEnHashMap(pares);
        Hashtable<String, Integer> resultado2 = almacenarSinDuplicados(pares);
        HashMap<String, Integer> mapaCombinadoHashMap = combinarMapas(resultado, resultado2);
        
        System.out.println("HashMap resultante: " + resultado);
        System.out.println("Hashtable resultante: " + resultado2);
        System.out.println("Mapa combinado: " + mapaCombinadoHashMap);
    }
}