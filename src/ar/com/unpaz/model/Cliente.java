package ar.com.unpaz.model;

public class Cliente {
	private String nombre;
	private String apelldo;
	private String dni;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelldo() {
		return apelldo;
	}
	public void setApelldo(String apelldo) {
		this.apelldo = apelldo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apelldo=" + apelldo + ", dni=" + dni + "]";
	}
	
	
	
	
}
