package ejercicioParcial;

public class Actor {

    //Atributos
    String nombre,apellido,pais;
    int anioDeNacimiento;

    // Constructores

    public Actor(String nombre, String apellido, String pais, int anioDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    //Metodos
    public int calcularEdad(int anioActual){
        int edad;
        edad= anioActual-this.anioDeNacimiento;
        return edad;
    }

    @Override
    public String toString() {
        return "Actor: " + nombre + " " + apellido + " ( " + pais + " ) " ;
    }
}
