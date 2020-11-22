package dominio;

import java.util.ArrayList;

public class Libreta{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();
	
	public void annadirTelefono(Telefono telefono){
		coleccionTelefonos.add(telefono);
	}

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (ColeccionTelefono telefonos : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
