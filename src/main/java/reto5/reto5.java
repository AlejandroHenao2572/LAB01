package main.java.reto5;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class reto5 {

    // Genera un TreeSet con n números aleatorios entre 1 y 100 (orden ascendente)
    public static TreeSet<Integer> generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        TreeSet<Integer> numeros = new TreeSet<>();
        while (numeros.size() < cantidad) {
            numeros.add(random.nextInt(100) + 1);
        }
        return numeros;
    }

    // Elimina múltiplos de 5 usando stream().filter()
    public static TreeSet<Integer> eliminarMultiplosDeCinco(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // Imprime los resultados usando lambda
    public static void imprimirConLambda(Set<Integer> numeros) {
        numeros.forEach(n -> System.out.println("Número: " + n));
    }

    public static void main(String[] args) {
        TreeSet<Integer> numerosAleatorios = generarNumerosAleatorios(20);
        System.out.println("Números aleatorios generados (orden ascendente):");
        imprimirConLambda(numerosAleatorios);

        TreeSet<Integer> numerosFiltrados = eliminarMultiplosDeCinco(numerosAleatorios);
        System.out.println("\nNúmeros después de eliminar múltiplos de 5:");
        imprimirConLambda(numerosFiltrados);
    }
}
