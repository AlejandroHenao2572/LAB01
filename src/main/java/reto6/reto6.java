package main.java.reto6;

import java.util.HashMap;
import java.util.Map;

public class reto6 {
    
    private static final Map<String, Runnable> COMANDOS_MAP = new HashMap<>();
    
    static {
        //Fragmento 1 del manual
        COMANDOS_MAP.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del codigo!"));
        COMANDOS_MAP.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima mision."));
        COMANDOS_MAP.put("CANTAR", () -> System.out.println("01010101"));
        COMANDOS_MAP.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));

        //Fragmento 2 del manual
        COMANDOS_MAP.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        COMANDOS_MAP.put("GRITAR", () -> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        COMANDOS_MAP.put("SUSURRAR", () -> System.out.println("Shhh... los bugs están dormidos."));
        COMANDOS_MAP.put("ANALIZAR", () -> System.out.println("Analizando datos... resultado: ¡Eres increíble programando!"));
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
            case "BROMEAR":
                System.out.print("La maquina rie: ");
                break;
            case "GRITAR":
                System.out.print("La maquina grita: ");
                break;
            case "SUSURRAR":
                System.out.print("La maquina susurra: ");
                break;
            case "ANALIZAR":
                System.out.print("La maquina procesa: ");
                break;
            }

            accion.run(); // Ejecutar la lambda
    }
    
    
    public static void demostrarFuncionalidad() {
        System.out.println("\nSALIDA:\n");
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        demostrarFuncionalidad();
    }
}