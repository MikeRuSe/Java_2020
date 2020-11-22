package dominio;

import java.util.ArrayList;

public class Libreta{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();
	private int linea_valor_modificar = catalogo.indexOf("Valor a modificar");

	public void annadirTelefono(Telefono telefono){
		coleccionTelefonos.add(telefono);
	}

	public void eliminarTelefono(Telefono telefono){
		coleccionTelefonos.remove(telefono);
	}

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (ColeccionTelefono telefonos : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
