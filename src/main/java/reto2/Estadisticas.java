package main.java.reto2;
import java.util.List;

public class Estadisticas {
    private int maximo;
    private int minimo;
    private int cantidad;

    public Estadisticas(int maximo, int minimo, int cantidad) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }

    public int getMaximo() { return maximo; }
    public int getMinimo() { return minimo; }
    public int getCantidad() { return cantidad; }

    public static Estadisticas calcularConCarreraParalela(List<Integer> lista) {
        int max = CarreraParalela.maximo(lista);   
        int min = CarreraParalela.minimo(lista).get(0);
        int cantidad = CarreraParalela.minimo(lista).get(1);

        boolean esDivisorDeDos = (max % 2 == 0) ? true : false;
        System.out.println("¿El número mayor es divisor de 2?: " + (esDivisorDeDos ? "Sí" : "No"));

        return new Estadisticas(max, min, cantidad);
    }

    public boolean esMaximoMultiploDeDos() {
        return (maximo % 2 == 0) ? true : false;
    }

    // Metodo que fusiona los resultados de dos listas en un objeto Estadisticas extendido
    public static Estadisticas fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        int max1 = CarreraParalela.maximo(lista1);
        int max2 = CarreraParalela.maximo(lista2);
        int min1 = CarreraParalela.minimo(lista1).get(0);
        int min2 = CarreraParalela.minimo(lista2).get(0);
        int cantidad1 = lista1.size();
        int cantidad2 = lista2.size();
        boolean max1Multiplo2 = (max1 % 2 == 0);
        boolean max2Multiplo2 = (max2 % 2 == 0);
        boolean max1Divisor2 = (max1 != 0 && 2 % max1 == 0);
        boolean max2Divisor2 = (max2 != 0 && 2 % max2 == 0);
        boolean cantidad1Par = (cantidad1 % 2 == 0);
        boolean cantidad2Par = (cantidad2 % 2 == 0);
        // Imprimir resultados
        System.out.println("Lista 1: maximo=" + max1 + ", minimo=" + min1 + ", cantidad=" + cantidad1 + ", maximoMultiplo2=" + max1Multiplo2 + ", maximoDivisor2=" + max1Divisor2 + ", cantidadPar=" + cantidad1Par);
        System.out.println("Lista 2: maximo=" + max2 + ", minimo=" + min2 + ", cantidad=" + cantidad2 + ", maximoMultiplo2=" + max2Multiplo2 + ", maximoDivisor2=" + max2Divisor2 + ", cantidadPar=" + cantidad2Par);
        return new Estadisticas(max1, min1, cantidad1);
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 4, 7, 10, 2);
        List<Integer> lista2 = List.of(3, 6, 9, 12, 15);
        System.out.println("Probando fusionarListas con dos listas de ejemplo:");
        Estadisticas resultado = fusionarListas(lista1, lista2);
    }
}
