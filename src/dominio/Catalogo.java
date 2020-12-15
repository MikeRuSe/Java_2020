/*
Copyright 2020 Jorge Martin-Benito Garcia, Xavier Alexander Mora Peraza, Dulibeth Medina Chirinos and Miguel Rubio Semelas
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package dominio;

import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 *
 * Esta clase crea las ArrayList con los Strings de Telefono.java
 *
 */

public class Catalogo {
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
	* @param argumentos argumentos para realizar la búsqueda en la ArrayList
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
	* Este metodo permite verificar si el telefono que se va a añadir existe
	*
	* @param modelo modelo del telefono
	* @return true/false dependiendo si existe o no
	*/

	public Boolean revisarModelo(String modelo) {
		int A = 0;
		for(int y = 0 ; y < coleccionTelefonos.size(); y++) {
        	Telefono nuevo_telefono = coleccionTelefonos.get(y);
        	if(modelo.equals(nuevo_telefono.getModeloTelefono())) {
        		A = 1;
        	} else {A = 0;}
		}
		if(A == 1){
			return true;
		} else {return false;}
	}
	
	/**
	* Este metodo permite recoger los datos introducidos y los devuelve con formato de texto CSV (separando cada valor con comas)
	*
	* @return datos del catálogo en CSV
	*/

	public String toCSV() {
		StringBuilder datos = new StringBuilder();
		for (Telefono telefono : coleccionTelefonos){
			datos.append(telefono.toCSV());
		}
		return datos.toString();
	}

	/**
	* Este metodo permite recoger los datos introducidos y los devuelve,
	*
	* @return datos del catálogo
	*/

	public String toString() {
		StringBuilder datos = new StringBuilder();
		for (Telefono telefono : coleccionTelefonos) {
			datos.append(telefono);
		}
		return datos.toString();
	}
}
