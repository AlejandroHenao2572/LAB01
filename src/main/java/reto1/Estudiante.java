/**
 * Clase que representa a un estudiante con sus datos basicos
 * Contiene informacion personal y academica
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;
    
    /**
     * Constructor para crear un objeto Estudiante,mjsadja,j
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param correo Correo institucional
     * @param semestre Semestre
     */
    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Metodo para representacion en cadena del estudiante
     * @return Cadena con la informacion del estudiante
     */
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}