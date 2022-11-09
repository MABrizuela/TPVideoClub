package main.java.practico.videoclub.Objetos;

import java.util.Scanner;
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
	private Socio socio;
	private Pelicula pelicula;
	
	public Pedido(int idPedido, Socio socio, Pelicula pelicula) {
		this.idPedido = idPedido;
		this.socio = socio;
		this.pelicula = pelicula;
	}
	
	@Override
	public String toString() {
		return "id Pedido: "+idPedido+"\n------------------------"+"\nDatos del socio"
				+socio+"\nPelicula seleccionada "+pelicula;
	} 
}
