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
 *Esta clase contiene atributos y metodos que sirven  para crear las caracteristicas de las tablets.
 *
 */
public class Tablet extends Dispositivo {
    private double capacidadBateria;
    private double camaraPixel;

	/**
	 * Este es un metodo constructor que hereda 4 parametros de su clase padre y contiene 2 parametros propios de sus caracteristicas.
	 * @param modelo modelo dispositivo.
         * @param marca marca dispositivo.
         * @param precio precio dispositivo.
         * @param descuento descuento dispositivo.
	 * @param capacidadBateria capacidad de la bateria.
	 * @param camaraPixel pixeles de la camara.  
	 */
    public Tablet(String modelo, String marca, String precio, String descuento, String capacidadBateria, String camaraPixel) {
        super(modelo, marca, precio, descuento);
        this.capacidadBateria = Double.parseDouble(capacidadBateria);
        this.camaraPixel = Double.parseDouble(camaraPixel);
    }

	/**
	 * Este es un metodo sobre-escrito, heredado de la clase padre, que devuelve todas las caracteriscas en formato CSV.
	 * @return todas las caracteristicas separadas por comas. 
	 */
    @Override
    public String toCSV() {
        return  getModelo() + "," + getMarca() + "," + getPrecio() + "," + getDescuento() + "," + getPrecioTotal() + ","
                    + capacidadBateria + "," + camaraPixel + "\n";
    }

	/**
	 * Este es un metodo sobre-escrito, heredado de la clase padre, que devuelve ordenadamente todas las caracteristicas.
	 * @return todas las caracteristicas.
	 */
    @Override
    public String toString() {
        return  getModelo() + " " + getMarca() + " " + getPrecio() + " " + getDescuento() + " " + getPrecioTotal() + " "
                    + capacidadBateria + " " + camaraPixel + "\n";
    }
}
