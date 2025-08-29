import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase para generar mensajes de bienvenida
 */
public class Mensaje {
    
    /**
     * Genera un mensaje de bienvenida personalizado para una pareja de estudiantes
     * @param estudiantes Lista de estudiantes 
     * @return String con el mensaje de bienvenida formateado
     * @throws IllegalArgumentException si la lista no contiene exactamente 2 estudiantes
     */
    public static String generarMensajeBienvenida(List<Estudiante> estudiantes) {
        // Usar stream() y map() para crear las descripciones de cada estudiante
        List<String> descripciones = estudiantes.stream()
                .map(estudiante -> String.format(
                    "%s estudiante de la escuela de %d semestre de %d años",
                    estudiante.getNombre(),
                    estudiante.getSemestre(),
                    estudiante.getEdad()
                ))
                .collect(Collectors.toList());
        
        // Usar stream() y map() para obtener los correos
        List<String> correos = estudiantes.stream()
                .map(Estudiante::getCorreo) 
                .collect(Collectors.toList());
        
        // Construir el mensaje final
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("\n¡Hola Bienvenidos! Nosotros somos la pareja conformada por ");
        mensaje.append(descripciones.get(0));
        mensaje.append(" y ");
        mensaje.append(descripciones.get(1));
        mensaje.append(", nuestros correos institucionales son ");
        mensaje.append(correos.get(0));
        mensaje.append(" y ");
        mensaje.append(correos.get(1)+"\n");
        
        return mensaje.toString();
    }
}