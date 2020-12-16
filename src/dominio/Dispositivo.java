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

public abstract class Dispositivo {
    // Protected 
    private String modelo;
	private String marca;
	private String precio; 
	private String descuento;
    private double precioTotal;

	public Dispositivo() {
		modelo      = "";
		marca       = "";
		precio      = "";
		descuento   = "";
	}

    /**
	 * Este es un metodo constructor de 5 parametros con las caracteristicas de dispositivo.
	 * @param modeloDispositvo modelo dispositivo.
	 * @param marcaDispositvo marca dispositivo.
	 * @param precioDispositvo precio dispositivo.
	 * @param descuentoDispositvo descuento dispositivo.
     * @param precioTotal precio total del dispositivo.
	 */
    
    public Dispositivo(String modelo, String marca, String precio, String descuento) {
		this.modelo     = modelo;
		this.marca      = marca;
		this.precio     = precio;
		this.descuento  = descuento;
        precioTotal     = precioFinal(precio, descuento);
	}

	/**
	 * Devuelve el modelo. 
	 * @return modelo. 
	 */

	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Cambia el modelo. 
	 * @param modelo nuevo modelo.  
	 */

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Devuelve la marca. 
	 * @return marca. 
	 */

	public String getMarca() {
		return marca;
	}
	
	/**
	 * Cambia la marca. 
	 * @param marca nueva marca.  
	 */

	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve el precio. 
	 * @return precio. 
	 */

	public String getPrecio() {
		return precio; 
	}
	
	/**
	 * Cambia precio. 
	 * @param precio nuevo precio. 
	 */

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	/**
	 * Devuelve el descuento. 
	 * @return descuento. 
	 */

	public String getDescuento() {
		return descuento; 
	}

	/**
	 * Aplica el descuento. 
	 * @param descuento aplica el descuento.
	 */

	public void setDescuento(String descuento) {
		this.descuento = descuento; 
	}

	/**
	 * Este metodo calcula el precio total y lo devuelde con el descuento aplicado en el caso de que lo tenga.
	 * @param precio precio original descuento.
	 * @param descuento descuento a aplicar.
 	 * @return precio final con o sin descuento.
 	*/

	public double precioFinal(String precio, String descuento) {
		if (descuento == null || descuento.isEmpty()) {
			return Double.parseDouble(precio);
		}
		double preciodouble = 0.0;
		double descuentodouble = 0.0;
		try {
			preciodouble = Double.parseDouble(precio);
   			descuentodouble = Double.parseDouble(descuento);
		} catch (NumberFormatException e) {
   			descuentodouble = 0.0;
		}
		return (double) Math.round(preciodouble *(100 - descuentodouble))/100;
	}
	

    /**
	 * Devuelve el precioTotal. 
	 * @return precioTotal. 
	 */

	public double getPrecioTotal() {
		return precioTotal; 
	}

	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas  en formato CSV.
	 * @return todas las caracteristicas separadas por comas.
	 */

	public abstract String toCSV();

	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas. 
	 * @return todas las caracteristicas.
	 */

	public abstract String toString();
}
