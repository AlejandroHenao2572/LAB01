package main.java.reto3;

public class reto3 {
    public static String repetirMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        return sb.toString();
    }

    public static String invertirMensaje(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }

public static String repetirEInvertir(String mensaje) {
        String mensajeRepetido = repetirMensaje(mensaje);
        return invertirMensaje(mensajeRepetido);
    }

    public static void main(String[] args) {
        String resultado = repetirMensaje("Hola mundo");
        String resultado2 = invertirMensaje("Hola mundo");
        String resultado3 = repetirEInvertir("Hola mundo");
        System.out.println("Repetir mensaje: " + resultado);
        System.out.println("Invertir mensaje: " + resultado2);
        System.out.println("Repetir 3 veces e invertir: " + resultado3); 
    }
}
