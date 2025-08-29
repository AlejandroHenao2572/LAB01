package main.java.reto2;

import java.util.List;

public class FuncionMaximoMinimo {

    private int maximo;
    private int minimo;
    private int cantidad;

    public FuncionMaximoMinimo(int maximo, int minimo, int cantidad) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }

    public int getMaximo() { return maximo; }
    public int getMinimo() { return minimo; }
    public int getCantidad() { return cantidad; }

    public static FuncionMaximoMinimo calcularConCarreraParalela(List<Integer> lista) {
        int max = CarreraParalela.maximo(lista);
        int min = CarreraParalela.minimoRepetido(lista).get(0);
        int cantidad = CarreraParalela.minimoRepetido(lista).size();
        return new FuncionMaximoMinimo(max, min, cantidad);
    }
}


