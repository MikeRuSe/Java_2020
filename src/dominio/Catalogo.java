package dominio;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Catalogo{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();

	/**
	* Este metodo permite añadir un Telefono a la lista del catálogo,
	*
	* @param telefono nuevo en el catálogo
	*/

	public void annadirTelefono(Telefono telefono) {
		coleccionTelefonos.add(telefono);
	}

	/**
	* Este metodo permite eliminar un Telefono previamente añadido del la lista del catálogo,
	*
	* @param argumentos eliminado del catálogo
	*/

	public void eliminarTelefono(String argumentos) {
		for(int i = 0 ; i < coleccionTelefonos.size(); i++) {
        	Telefono nuevo_telefono = coleccionTelefonos.get(i);
        	if(argumentos.equals(nuevo_telefono.getModeloTelefono()))  {
        		coleccionTelefonos.remove(i);
        	}
    	}
	}

	/**
	* Este metodo permite modificar un Telefono de la lista del catálogo,
	*
	* @param telefono modificado del catálogo
	* @param argumentos modificado del catálogo
	*/

	public void modificarTelefono(Telefono telefono, String argumentos) {
		for(int i = 0 ; i < coleccionTelefonos.size(); i++) {
        	Telefono nuevo_telefono = coleccionTelefonos.get(i);
        	if(argumentos.equals(nuevo_telefono.getModeloTelefono()))  {
        		coleccionTelefonos.set(i, telefono);
        	}
    	}
    }

	/**
	* Este metodo permite recoger los datos introducidos y los devuelve,
	*
	* @return datos del catálogo
	*/

	public String toString() {
		StringBuilder datos = new StringBuilder();
		for (Telefono telefono : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
