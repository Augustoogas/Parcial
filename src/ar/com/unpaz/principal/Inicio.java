package ar.com.unpaz.principal;

import java.util.List;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.service.LeerArchivoServicio;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//vamos a mostrar cliente
			mostrarClientes();
		
			
	}
	
	public static void mostrarClientes() {
		LeerArchivoServicio servicio= new LeerArchivoServicio();
		
		List<Cliente> mostrarClientes=servicio.leerArchivoClienteServicio();
		
		for(Cliente c : mostrarClientes) {
			System.out.println(c.toString());
		}
		
	}

}
