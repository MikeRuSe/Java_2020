package dominio;

import java.util.ArrayList;

public class Libreta{
	private ArrayList<Contacto> coleccionContactos = new ArrayList<>();

	public void annadirContacto(Contacto contacto){
		coleccionContactos.add(contacto);
	}

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (Contacto contacto : coleccionContactos){
			datos.append(contacto);
		}
		return datos.toString();
	}
}
