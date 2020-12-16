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
 * Esta clase crea las ArrayList con los Strings de Dispositivo.java
 *
 */
public class Catalogo {
	private ArrayList<Dispositivo> coleccionDispositivos = new ArrayList<>();

	/**
	* Este metodo permite añadir un Dispositivo a la lista del catálogo,
	*
	* @param dispositivo nuevo en el catálogo.add
	*/
	public void annadirDispositivo(Dispositivo dispositivo) {
		coleccionDispositivos.add(dispositivo);
	}

	/**
	* Este metodo permite eliminar un Dispositivo previamente añadido del la lista del catálogo,
	*
	* @param argumentos eliminado del catálogo
	*/
	public void eliminarDispositivo(String argumentos) {
		for (int i = 0 ; i < coleccionDispositivos.size(); i++) {
        	Dispositivo nuevoDispositivo = coleccionDispositivos.get(i);
        	if(argumentos.equals(nuevoDispositivo.getModelo())) {
        		coleccionDispositivos.remove(i);
        	}
    	}
	}

	/**
	* Este metodo permite modificar un Dispositivo de la lista del catálogo,
	*
	* @param dispositivo modificado del catálogo
	* @param argumentos argumentos para realizar la búsqueda en la ArrayList
	*/
	public void modificarDispositivo(Dispositivo dispositivo, String argumentos) {
		for (int i = 0 ; i < coleccionDispositivos.size(); i++) {
        	Dispositivo nuevoDispositivo = coleccionDispositivos.get(i);
        	if(argumentos.equals(nuevoDispositivo.getModelo()))  {
        		coleccionDispositivos.set(i, dispositivo);
        	}
    	}
    }

	/**
	* Este metodo permite verificar si el dispositivo que se va a añadir existe.
	*
	* @param modelo modelo del dispositivo.
	* @return true/false dependiendo si existe o no.
	*/
	public boolean revisarModelo(String modelo) {
		for (int y = 0 ; y < coleccionDispositivos.size(); y++) {
        	Dispositivo nuevoDispositivo = coleccionDispositivos.get(y);
        	if (modelo.equals(nuevoDispositivo.getModelo())) {
        		return true;
			}
		}
		return false;
	}
	
	/**
	* Este metodo permite recoger los datos introducidos y los devuelve con formato de texto CSV (separando cada valor con comas)
	*
	* @return datos del catálogo en CSV
	*/
	public String toCSV() {
		StringBuilder datos = new StringBuilder();
		for (Dispositivo dispositivo : coleccionDispositivos){
			datos.append(dispositivo.toCSV());
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
		for (Dispositivo dispositivo : coleccionDispositivos) {
			datos.append(dispositivo);
		}
		return datos.toString();
	}
}
