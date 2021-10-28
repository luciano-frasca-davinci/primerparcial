package ejercicioParcial;

import java.util.ArrayList;

public class Cine {

    //Atributos
    String nombre, ciudad;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    //Constructores

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    // Metodos

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    public void eliminarPelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    public void mostrarPeliculas(){
        System.out.println("Peliculas de la cartelera en " + nombre + ": ");

        for (int i=0;i<peliculas.size();i++){

            System.out.println(peliculas.get(i));

        }
    }

    @Override
    public String toString() {
        return "Bienvenidos al cine: " + nombre;
    }
}
