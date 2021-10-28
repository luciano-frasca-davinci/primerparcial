package ejercicioParcial;

public class Main {
    public static void main(String[] args) {
        //Objetos
        Actor primerActor= new Actor("Luciano", "Frasca", "Argentina",1980);
        Actor segundoActor= new Actor("Nico", "Frasca", "Argentina",1980);
        Actor tercerActor= new Actor("Lucho", "Frasca", "Argentina",1980);
        Actor cuartoActor= new Actor("Nicolas", "Frasca", "Argentina",1980);

        Pelicula primeraPelicula = new Pelicula("Titanic", "Romance",120,2000);
        Pelicula segundaPelicula = new Pelicula("El rey leon", "Infantil",120,2000);

        Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        //Metodos Primera Pelicula
        primeraPelicula.agregarActores(primerActor);
        primeraPelicula.agregarActores(segundoActor);
        primeraPelicula.mostrarActores();
        //Metodos Segunda Pelicula

        segundaPelicula.agregarActores(tercerActor);
        segundaPelicula.agregarActores(cuartoActor);
        segundaPelicula.mostrarActores();

        //Metodos Nuevo Cine

        nuevoCine.agregarPelicula(primeraPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);
        nuevoCine.mostrarPeliculas();


    }
}
