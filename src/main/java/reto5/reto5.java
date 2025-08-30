package main.java.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class reto5 {

    private static final int CANTIDAD_NUMEROS = 20;
    private static final int VALOR_MINIMO = 1;
    private static final int VALOR_MAXIMO = 100;
    private static final int DIVISOR_MULTIPLO = 3;
    
    public void procesarNumerosAleatorios() {
        Set<Integer> numerosOriginales = generarNumerosAleatoriosOriginal();
        mostrarNumerosOriginales(numerosOriginales);
        
        Set<Integer> numerosFiltrados = filtrarMultiplosDe3(numerosOriginales);
        mostrarNumerosFiltrados(numerosFiltrados);
    }
    
    private Set<Integer> generarNumerosAleatoriosOriginal() {
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
        System.out.println("Numeros despues de eliminar multiplos de " + DIVISOR_MULTIPLO + ":");
        numeros.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\n");
    }
<<<<<<< HEAD

    public static TreeSet<Integer> generarNumerosAleatoriosTreeSet(int cantidad) {
=======
        
    public static void main(String[] args) {
        reto5 reto = new reto5();
        reto.procesarNumerosAleatorios();

    public static TreeSet<Integer> generarNumerosAleatorios(int cantidad) {
>>>>>>> 6177f7d9c9b6491d965da7d827503b7fcb2e26c2
        Random random = new Random();
        TreeSet<Integer> numeros = new TreeSet<>();
        while (numeros.size() < cantidad) {
            numeros.add(random.nextInt(100) + 1);
        }
        return numeros;
    }

    public static TreeSet<Integer> eliminarMultiplosDeCinco(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

<<<<<<< HEAD
=======

>>>>>>> 6177f7d9c9b6491d965da7d827503b7fcb2e26c2
    public static void imprimirConLambda(Set<Integer> numeros) {
        numeros.forEach(n -> System.out.println("Número: " + n));
    }

    public static TreeSet<Integer> unirColecciones(Set<Integer> hashSet, Set<Integer> treeSet) {
        TreeSet<Integer> union = new TreeSet<>();
        
        // Agregar elementos del HashSet usando stream
        hashSet.stream()
               .forEach(union::add);
        
        // Agregar elementos del TreeSet usando stream
        treeSet.stream()
               .forEach(union::add);
        
        return union; // TreeSet automaticamente elimina duplicados y mantiene orden
    }

    // Filtra números usando stream().filter() 
    public static TreeSet<Integer> filtrarMultiplos(Set<Integer> numeros, int divisor) {
        return numeros.stream()
                .filter(n -> n % divisor != 0) 
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // Imprime los resultados usando lambda con formato
    public static void imprimirResultadosUnion(Set<Integer> numeros) {
        numeros.forEach(numero -> System.out.println("Numero en arena: " + numero));
    }

    // ========== METODOS PRINCIPALES PARA DEMOSTRAR FUNCIONALIDADES ==========

    public static void procesarColecciones() {
        System.out.println("PROCESAMIENTO DE COLECCIONES (UNION)\n");
        
        // Generar HashSet usando el metodo de instancia existente
        reto5 generador = new reto5();
        Set<Integer> hashSetTemp = generador.generarNumerosAleatoriosOriginal();
        HashSet<Integer> hashSet = new HashSet<>(hashSetTemp);
        
        // Generar TreeSet usando el método estático existente  
        TreeSet<Integer> treeSet = generarNumerosAleatoriosTreeSet(8);
        
        // Mostrar colecciones originales
        System.out.println("HashSet original: " + hashSet);
        System.out.println("TreeSet original: " + treeSet);
        
        // Unir ambas colecciones eliminando duplicados
        TreeSet<Integer> union = unirColecciones(hashSet, treeSet);
        System.out.println("Union ordenada: " + union);
        
        System.out.println("\nRESULTADO UNION");
        // Imprimir
        imprimirResultadosUnion(union);
        System.out.println();
    }

    // Metodo que demuestra la funcionalidad de multiplos de 5
    public static void procesarMultiplosDe5() {
        System.out.println("PROCESAMIENTO DE MULTIPLOS DE 5\n");
        
        TreeSet<Integer> numerosAleatorios = generarNumerosAleatoriosTreeSet(15);
        System.out.println("Números aleatorios generados (orden ascendente):");
        imprimirConLambda(numerosAleatorios);

        TreeSet<Integer> numerosFiltrados = eliminarMultiplosDeCinco(numerosAleatorios);
        System.out.println("\nNúmeros después de eliminar múltiplos de 5:");
        imprimirConLambda(numerosFiltrados);
<<<<<<< HEAD
        System.out.println();
    }

    // Metodo que demuestra la funcionalidad de multiplos de 3
    public static void procesarMultiplosDe3() {
        System.out.println("PROCESAMIENTO DE MULTIPLOS DE 3\n");
        
        reto5 reto = new reto5();
        reto.procesarNumerosAleatorios();
        System.out.println();
    }
        
    public static void main(String[] args) {
        procesarMultiplosDe3();  
        procesarMultiplosDe5();    
        procesarColecciones();    
=======
>>>>>>> 6177f7d9c9b6491d965da7d827503b7fcb2e26c2
    }
}
