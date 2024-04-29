package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Cliente;

public class LeerArchivoRepositorio extends Thread {
	
	
	//Creamos un file para la ruta del archivo
	File ruta=new File("hola/");
	
	//creamos un filereader
	FileReader clientesReader;
	
	//la lista la cual vamos a usar y guardar los clientes que ponemos en los archivos
	List<Cliente> sList= new ArrayList<Cliente>();
	
	
	
	public List<Cliente> leerArchivoCliente(){
		
		
		//Dentro de un try catch leemos el archivo
		try {
			
			
			//instaciamos un filereader y le pasamos la ruta File que creamos antes
			clientesReader= new FileReader(ruta);
			
			//Creamos un bufferReader para el archivo linea a linea 
			BufferedReader sBufferedReader= new BufferedReader(clientesReader);
			
			//la variable donde vamos a guardar cada linea leida separada por una coma dentro de un while
			String linea="";
			
			//Leemos la linea mientra la linea no sea null
			while((linea=sBufferedReader.readLine())!=null) {
				 //separamos la linea completa con un split por coma,y guardamos cada parte en una lista creada e instaciada en el momento
				String data[]=linea.split(",");
				
				Cliente cliente = new Cliente();
				
				
				//agregamos cada parte correspondiente de la lista data[] con cada atributo
				cliente.setApelldo(data[0]);
				cliente.setNombre(data[1]);
				cliente.setDni(data[3]);
				
				//agregamos el objeto a la lista que vamos a retornar
				sList.add(cliente);
				
			} // cerramos el archivo
			if(sBufferedReader!=null) {
				try {
					sBufferedReader.close();
				}  catch (IOException e) {
				    e.printStackTrace();
				   }
			}
			
			
		} catch (IOException e) {
		    e.printStackTrace();
		   }
		
		
		return sList;
		
	}


}

