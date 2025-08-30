package main.java.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class reto5 {

    private static final int CANTIDAD_NUMEROS = 20;
    private static final int VALOR_MINIMO = 1;
    private static final int VALOR_MAXIMO = 100;
    private static final int DIVISOR_MULTIPLO = 3;
    
    public void procesarNumerosAleatorios() {
        Set<Integer> numerosOriginales = generarNumerosAleatorios();
        mostrarNumerosOriginales(numerosOriginales);
        
        Set<Integer> numerosFiltrados = filtrarMultiplosDe3(numerosOriginales);
        mostrarNumerosFiltrados(numerosFiltrados);
    }
    
    private Set<Integer> generarNumerosAleatorios() {
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();
        
        while (numeros.size() < CANTIDAD_NUMEROS) {
            numeros.add(random.nextInt(VALOR_MAXIMO) + VALOR_MINIMO);
        }
        
        return numeros;
    }
    
    private Set<Integer> filtrarMultiplosDe3(Set<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero % DIVISOR_MULTIPLO != 0)
                .collect(Collectors.toSet());
    }
    
    private void mostrarNumerosOriginales(Set<Integer> numeros) {
        System.out.println("Numeros generados aleatoriamente:");
        numeros.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\n");
    }
    
    private void mostrarNumerosFiltrados(Set<Integer> numeros) {
        System.out.println("Numeros después de eliminar multiplos de " + DIVISOR_MULTIPLO + ":");
        numeros.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\n");
    }
        
    public static void main(String[] args) {
        reto5 reto = new reto5();
        reto.procesarNumerosAleatorios();
    }
}
