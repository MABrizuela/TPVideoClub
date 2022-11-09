package main.java.practico.videoclub.Objetos;

public class PedidoAlquiler extends Pedido {


	public PedidoAlquiler(int idPedido, Socio socio, Pelicula pelicula) {
		super(idPedido, socio, pelicula);
	}
	
	public void obtenerPrecioAlquiler(int precioAlquiler) {
		System.out.println("Precio de su pelicula alquilada es:  "+precioAlquiler);
	}
}
