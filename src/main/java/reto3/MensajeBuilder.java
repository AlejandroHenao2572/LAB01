package main.java.reto3;

public class MensajeBuilder {
    public static String repetirMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String resultado = repetirMensaje("Hola mundo");
        System.out.println(resultado); 
    }
}
