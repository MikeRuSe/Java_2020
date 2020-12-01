package dominio;

import dominio.Telefono;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Catalogo{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();

	public void annadirTelefono(Telefono telefono) {
		coleccionTelefonos.add(telefono);
	}

	public void eliminarTelefono(String argumentos) {
		for(int i = 0 ; i < coleccionTelefonos.size(); i++) {
        	Telefono nuevo_telefono = coleccionTelefonos.get(i);
        	if(argumentos.equals(nuevo_telefono.getModeloTelefono()))  {
        		//System.out.println(argumentos);
        		//System.out.println(index);
        		coleccionTelefonos.remove(i);
        	}
    	}
	}

	public void modificarTelefono(Telefono telefono, String argumentos) {
		for(int i = 0 ; i < coleccionTelefonos.size(); i++) {
        	Telefono nuevo_telefono = coleccionTelefonos.get(i);
        	if(argumentos.equals(nuevo_telefono.getModeloTelefono()))  {
        		//System.out.println(argumentos);
        		//System.out.println(index);
        		coleccionTelefonos.set(i, telefono);
        	}
    	}
    }

	public String toString() {
		StringBuilder datos = new StringBuilder();
		for (Telefono telefono : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
