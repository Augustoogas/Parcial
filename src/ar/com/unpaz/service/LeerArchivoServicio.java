package ar.com.unpaz.service;

import java.util.List;

import ar.com.unpaz.crud.Functions;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.repositorio.LeerArchivoRepositorio;

public class LeerArchivoServicio implements Functions {

		public List<Cliente> leerArchivoClienteServicio(){
			LeerArchivoRepositorio archivo= new LeerArchivoRepositorio();
			
			List<Cliente> clienteListaServicio = archivo.leerArchivoCliente();
			
			return clienteListaServicio;
		}
		
		


}
