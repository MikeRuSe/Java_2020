package dominio;

import java.util.ArrayList;

public class Catalogo{
	private ArrayList<Telefono> coleccionTelefonos = new ArrayList<>();
	//private int linea_valor_modificar = catalogo.indexOf("Valor a modificar");

	public void annadirTelefono(Telefono telefono){
		coleccionTelefonos.add(telefono);
	}

	public void eliminarTelefono(int index){
		coleccionTelefonos.remove(index);
	}

	public void modificarTelefono(Telefono telefono, int index){
        coleccionTelefonos.set(index, telefono);
    }

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (ColeccionTelefono telefonos : coleccionTelefonos){
			datos.append(telefono);
		}
		return datos.toString();
	}
}
