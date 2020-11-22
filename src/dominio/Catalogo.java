package dominio;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Catalogo{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();
	//private int linea_valor_modificar = catalogo.indexOf("Valor a modificar");

	public void annadirTelefono(Telefono telefono){
		coleccionTelefonos.add(telefono);
	}

	public void eliminarTelefono(String argumentos){
		int index = coleccionTelefonos.indexOf(argumentos);
		coleccionTelefonos.remove(index);
	}

	public void modificarTelefono(Telefono telefono, String argumentos){
        int index = coleccionTelefonos.indexOf(argumentos);
        coleccionTelefonos.set(index, telefono);
    }

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (Telefono telefono : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
