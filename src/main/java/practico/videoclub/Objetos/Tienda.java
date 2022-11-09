package main.java.practico.videoclub.Objetos;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
	private String direccion;
	private ArrayList<Catalogo> catalogos;
	
	public Tienda (String nombre, String direccion, ArrayList <Catalogo> catalogos) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Nombre de la tienda: "+nombre+"\nDirección de la Tienda: "+direccion;
	}
}
