package main.java.practico.videoclub.Objetos;

public class Tarjeta {
    private int saldo;
	private int idTarjeta;
	private String fechaVencimiento;
	
	
	public Tarjeta(int saldo, int idTarjeta, String fechaVencimiento){
		this.saldo = saldo;
		this.idTarjeta = idTarjeta;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	@Override
	public String toString() {
		return "\nSaldo: "+saldo+"\nid de Tarjeta: "+idTarjeta+"\nFecha de Vencimiento: "+fechaVencimiento+"\n---------------------";
	}
	
	public void saldoTotal(int saldo, int precioVenta, int precioAlquilar) {
		
		int total  = saldo - precioVenta + precioAlquilar;
		
		System.out.print("El total del salto de su tarjeta es: "+total);
		
	} 
}
