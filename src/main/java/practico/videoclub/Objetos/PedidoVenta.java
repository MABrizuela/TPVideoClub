package main.java.practico.videoclub.Objetos;

public class PedidoVenta extends Pedido {

    public PedidoVenta(int idPedido, Socio socio, Pelicula pelicula) {
		super(idPedido, socio, pelicula);
	}
	
	public void obtenerPrecioVenta(int precioVenta) {

		System.out.println("El precio de su pelicula comprada es: "+precioVenta);
		
	}
}
