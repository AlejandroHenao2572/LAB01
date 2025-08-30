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
        return new Estadisticas(max, min, cantidad);
    }
}
