package JSON;

public class Persona {
	
	private String dni;
    private int edad;
    private String nombre;

    public Persona() {
        // Constructor vacío requerido por Jackson
    }

    public Persona(String dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + "]";
    }
	
	

}
