package main.java.reto6;

import java.util.HashMap;
import java.util.Map;

public class reto6 {
    
    private static final Map<String, Runnable> COMANDOS_MAP = new HashMap<>();
    
    static {
        COMANDOS_MAP.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del codigo!"));
        COMANDOS_MAP.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima mision."));
        COMANDOS_MAP.put("CANTAR", () -> System.out.println("01010101"));
        COMANDOS_MAP.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {        
        Runnable accion = COMANDOS_MAP.get(comando.toUpperCase());
        
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.print("La maquina dice: ");
                break;
            case "DESPEDIR":
                System.out.print("La maquina dice: ");
                break;
            case "CANTAR":
                System.out.print("La maquina canta: ");
                break;
            case "DANZAR":
                System.out.print("La maquina gira y emite chispas: ");
                break;
            }
            accion.run(); // Ejecutar la lambda
    }
    
    
    public static void demostrarFuncionalidad() {
        ejecutarComando("SALUDAR");
        ejecutarComando("DANZAR");
        ejecutarComando("CANTAR");
        ejecutarComando("DESPEDIR");

        System.out.println("\nSALIDA:\n");
        ejecutarComando("SALUDAR");
        ejecutarComando("DANZAR");
    }
    
    public static void main(String[] args) {
        demostrarFuncionalidad();
    }
}
