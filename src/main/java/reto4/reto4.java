package main.java.reto4;

import java.util.*;
import java.util.stream.Collectors;
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
        
        // Agregar elementos del Hashtable primero, tienen prioridad
        mapaCombinadoHashMap.putAll(hashTable);
        
        // Agregar elementos del HashMap solo si la clave no existe ya
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (!mapaCombinadoHashMap.containsKey(entry.getKey())) {
                mapaCombinadoHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        
        return mapaCombinadoHashMap;
    }
    
    public static HashMap<String, Integer> convertirClavesAMayusculas(HashMap<String, Integer> mapa) {
        return mapa.entrySet().stream()
                .collect(Collectors.toMap(
                    entry -> entry.getKey().toUpperCase(),
                    Map.Entry::getValue,
                    (existing, _) -> existing,
                    HashMap::new
                ));
    }
    
    public static void imprimirMapaOrdenadoPorClave(HashMap<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue()));
    }
    
    public static void imprimirConClavesMayusculas(HashMap<String, Integer> mapa, String nombreMapa) {
        System.out.print(nombreMapa + ": {");
        boolean primero = true;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (!primero) {
                System.out.print(", ");
            }
            System.out.print(entry.getKey().toUpperCase() + "=" + entry.getValue());
            primero = false;
        }
        System.out.println("}");
    }
    
    public static void imprimirClavesOrdenadasAsc(HashMap<String, Integer> mapa, String nombreMapa) {
        List<String> clavesOrdenadas = new ArrayList<>(mapa.keySet());
        Collections.sort(clavesOrdenadas);
        System.out.print(nombreMapa + " (claves ordenadas): {");
        boolean primero = true;
        for (String clave : clavesOrdenadas) {
            if (!primero) {
                System.out.print(", ");
            }
            System.out.print(clave + "=" + mapa.get(clave));
            primero = false;
        }
        System.out.println("}");
    }
    
    public static void combinarYProcesarMapas(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashTable) {
        // Paso 1: Usar el metodo existente para combinar mapas
        HashMap<String, Integer> mapaCombinado = combinarMapas(hashMap, hashTable);
        
        // Paso 2: Usar el metodo existente para convertir claves a mayusculas
        HashMap<String, Integer> mapaConClavesMayusculas = convertirClavesAMayusculas(mapaCombinado);
        
        // Paso 3: Usar el metodo existente para imprimir ordenado por clave
        imprimirMapaOrdenadoPorClave(mapaConClavesMayusculas);
    }
    
    public static void main(String[] args) {
        // Datos de ejemplo segun los requisitos  
        HashMap<String, Integer> hashMapEjemplo = new HashMap<>();
        hashMapEjemplo.put("oro", 5);
        hashMapEjemplo.put("plata", 3);
        hashMapEjemplo.put("oro", 7);  // Este sobrescribe el anterio
        hashMapEjemplo.put("diamante", 10);
        
        Hashtable<String, Integer> hashTableEjemplo = new Hashtable<>();
        hashTableEjemplo.put("plata", 8);
        hashTableEjemplo.put("rubi", 4);
        hashTableEjemplo.put("oro", 12);
        hashTableEjemplo.put("esmeralda", 6);
        
        combinarYProcesarMapas(hashMapEjemplo, hashTableEjemplo);
    }
}