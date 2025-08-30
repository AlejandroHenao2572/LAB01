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
}
