package main.java.practico.videoclub.Objetos;

public class Item {
    private Pelicula pelicula;
	private int cantidad;
	private boolean disponible;
	
	public Item(Pelicula pelicula, int cantidad) {
		this.pelicula = pelicula;
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return pelicula+"\nCantidad : "+cantidad;
	}  
}
