package main.java.practico.videoclub.Objetos;

public class Pelicula {
    private String nombre;
	private String genero;
	private String clasificacion;
	private int año;
	protected int precioAlquiler;
	protected int precioVenta;
	
	public Pelicula(String nombre, String genero, String clasificacion, int año, int precioAlquiler, int precioVenta ) {
		this.nombre = nombre;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.año = año;
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "\nNombre: "+nombre+"\nGenero: "+genero+"\nClasificación: "+clasificacion+"\nAño: "+año+"\nPrecio para Alquilar: "+precioAlquiler+"\nPrecio para comprar: "+precioVenta;
	}
}
