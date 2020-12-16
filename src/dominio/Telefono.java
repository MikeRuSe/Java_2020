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

/**
 *
 *Esta clase contiene atributos y metodos que sirven  para crear las caracteristicas del telefono
 *
 */

public class Telefono extends Dispositivo {

	public Telefono(String modelo, String marca, String precio, String descuento) {
		super(modelo, marca, precio, descuento);
	}

	public Telefono() {
		super();
	}

	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas del telefono en formato CSV
	 * @return todas las caracteristicas separadas por comas
	 */

	public String toCSV() {
		return  getModelo() + "," + getMarca() + "," + getPrecio() + "," + getDescuento() + "," + getPrecioTotal() + "\n";
	}

	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas del telefono
	 * @return todas las caracteristicas
	 */
 
	public String toString() {
		return  getModelo() + " " + getMarca() + " " + getPrecio() + " " + getDescuento() + " " + getPrecioTotal() + "\n";
	}

}

