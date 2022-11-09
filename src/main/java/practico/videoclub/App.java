package practico.videoclub;

import java.util.ArrayList;

import main.java.practico.videoclub.Objetos.Catalogo;
import main.java.practico.videoclub.Objetos.Item;
import main.java.practico.videoclub.Objetos.Pedido;
import main.java.practico.videoclub.Objetos.PedidoAlquiler;
import main.java.practico.videoclub.Objetos.PedidoVenta;
import main.java.practico.videoclub.Objetos.Pelicula;
import main.java.practico.videoclub.Objetos.Socio;
import main.java.practico.videoclub.Objetos.Tarjeta;
import main.java.practico.videoclub.Objetos.Tienda;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Item> misItems = new ArrayList<>();
		ArrayList<Catalogo> misCatalogos = new ArrayList<>();
		Tienda t = new Tienda("VideoCLub", "Av San Nicolas de Bari", misCatalogos);
		Catalogo c = new Catalogo(t, misItems);
		Pelicula p = new Pelicula("Top Gun: Maverick", "Acción", "+13", 2022, 15, 30);
		Pelicula p2 = new Pelicula("John Wick", "Acción", "+18", 2014, 15, 30);
		Pelicula p3 = new Pelicula("Terminator: La salvación", "Acción", "+13", 2009, 15, 30);
		Item item = new Item(p, 2);
		Item item2 = new Item(p2, 1);
		Item item3 = new Item(p3, 0);  
		misItems.add(item);
		misItems.add(item2);
		misItems.add(item3);
		System.out.println("Catalogo de Peliculas");
		c.mostrarItems(misItems);
		System.out.println("--------------------------------------");
		System.out.println("");
		Tarjeta tarjeta = new Tarjeta(100, 6282,"2/2/2023");
		Socio socio = new Socio("Jaime", "Valenzuela", "42.184.172", "Calle Buenos Aires","3804224212", "JValenzuela1@gmail.com","11/9/1999",22, 5, tarjeta);
		System.out.println("\nSocio");
		System.out.println("");
		Pedido pedido = new Pedido(0, socio, p);
		System.out.println(pedido);
		misItems.get(0);
		PedidoAlquiler pedidoalquiler = new PedidoAlquiler(0, socio, p);
		PedidoVenta pedidoventa = new PedidoVenta(0, socio, p);
		pedidoventa.obtenerPrecioVenta(30);
		pedidoalquiler.obtenerPrecioAlquiler(0);
		tarjeta.saldoTotal(100, 30, 0);
    }
}
