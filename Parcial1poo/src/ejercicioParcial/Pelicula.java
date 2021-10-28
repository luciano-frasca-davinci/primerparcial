package ejercicioParcial;

import java.util.ArrayList;

public class Pelicula {
    //Atributos
    String titulo, categoria;
    int duracion, anio;
    ArrayList<Actor> actores = new ArrayList<Actor>();

    //Constructores

    public Pelicula(String titulo, String categoria, int duracion, int anio) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.duracion = duracion;
        this.anio = anio;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    //Metodos

    public void agregarActores(Actor actores){
        this.actores.add(actores);
    }
    public void eliminarActores(Actor actores){
        this.actores.remove(actores);
    }

    public void mostrarActores(){

        System.out.println("Actores de la pelicula " + titulo + ": ");
        for (int i=0; i<actores.size();i++){
            System.out.println(actores.get(i));
        }
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + " ( " + anio + " ) ";
    }
}
