import java.util.ArrayList;
import java.util.List;
/**
 * Clase principal para ejecutar el ejercicio de bienvenida
 */
public class Main {
    
    /**
     * Metodo principal que ejecuta el programa
     * Crea estudiantes y genera el mensaje de bienvenida
     * @param args Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        // Crear la lista de estudiantes como se requiere
        List<Estudiante> estudiantes = new ArrayList<>();
        
        // Agregar los estudiantess
        estudiantes.add(new Estudiante("David Patacon",20 , "david.patacon-h@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante("Daniel Hueso",19 , "daniel.felipe-h@mail.escuelaing.edu.co", 6));
        
        // Generar y mostrar el mensaje de bienvenida
        System.out.println(Mensaje.generarMensajeBienvenida(estudiantes));
    }
}