package main.java.practico.videoclub.Objetos;

public class Socio {
    private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String telefono;
	private String email;
	private String fechaNacimiento;
	private int edad;
	private int idSocio;
	private Tarjeta tarjeta;
	
	
	public Socio(String nombre, String apellido, String dni, String direccion, String telefono, String email, String fechaNacimiento, int edad, int idSocio, Tarjeta tarjeta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.idSocio = idSocio;
		this.tarjeta = tarjeta;
		
	}
	
	
		@Override
	public String toString() {
		return "\nNombre: "+nombre+"\nApellido: "+apellido+"\nDNI: "+dni+"\nDirección: "+direccion+"\nTelefono: "+telefono+
				"\nEmail: "+email+"\nFecha de Nacimiento: "+fechaNacimiento+"\nEdad: "+edad+"\nidSocio: "+idSocio+"\n--------------------------"+"\nDatos de la Tarjeta"
					+tarjeta;
		}
}
