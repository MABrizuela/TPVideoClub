package main.java.practico.videoclub.Objetos;

import java.util.ArrayList;

public class Catalogo {
    private Tienda tienda;
	private ArrayList<Item> items;
	
	
public Catalogo(Tienda tienda, ArrayList<Item> items) {
	this.tienda = tienda;
	this.items = items;
}


	public void mostrarItems(ArrayList<Item> items) {
		
		for(Item i: items) {
			
			System.out.println(i);
			System.out.println("");
			}
		}
	
	@Override
	public String toString() {
		return "Tienda:"+tienda+"\nCatalogos: "+items;
	}
}
