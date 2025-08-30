package main.java.reto3;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class reto3 {
    public static String repetirMensaje(String mensaje) {
        return IntStream.range(0, 3)
            .mapToObj(x -> mensaje)
            .collect(Collectors.joining(" "));
    }

    public static String invertirMensaje(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }

    public static String repetirEInvertir(String mensaje) {
        String mensajeRepetido = repetirMensaje(mensaje);
        return invertirMensaje(mensajeRepetido);
    }

    public static void main(String[] args) {
        // Uso de lambda para invocar la funcion
        java.util.function.Function<String, String> repetir = reto3::repetirMensaje;
        java.util.function.Function<String, String> invertir = reto3::invertirMensaje;
        java.util.function.Function<String, String> repetirEInvertir = reto3::repetirEInvertir;
        
        String resultado = repetir.apply("Hola mundo");
        String resultado2 = invertir.apply("Hola mundo");
        String resultado3 = repetirEInvertir.apply("Hola mundo");
        System.out.println("Repetir mensaje: " + resultado);
        System.out.println("Invertir mensaje: " + resultado2);
        System.out.println("Repetir 3 veces e invertir: " + resultado3); 
    }
}
