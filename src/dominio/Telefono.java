package dominio;

import java.lang.Math;

public class Telefono{
	private String modeloTelefono;
	private String marcaTelefono;
	private String precioTelefono; 
	private String descuentoTelefono;

	public Telefono(){
		modeloTelefono = "";
		marcaTelefono = "";
		precioTelefono = "";
		descuentoTelefono = "";
	}

	/**
	 * Este es un metodo constructor de 5 parametros con las caracteristicas de del telefono
	 * @param modeloTelefono modelo del telefono
	 * @param marcaTelefono marca del telefono 
	 * @param precioTelefono precio del telefono
	 * @param descuentoTelefono descuento del telefono 
	 * @param precioFinalString precio final del telefono
	 */

	public Telefono(String modeloTelefono, String marcaTelefono, String precioTelefono, String descuentoTelefono, String precioTotal){
		this.modeloTelefono = modeloTelefono;
		this.marcaTelefono = marcaTelefono;
		this.precioTelefono = precioTelefono;
		this.descuentoTelefono = descuentoTelefono;
	}

	/**
	 * Devuelve el modelo del telefono
	 * @return modelo del telefono
	 */

	public String getModeloTelefono(){
		return modeloTelefono;
	}
	
	/**
	 * Cambia el modelo del telefono
	 * @param modeloTelefono nuevo modelo del telefono 
	 */

	public void setModeloTelefono(String modeloTelefono){
		this.modeloTelefono = modeloTelefono;
	}

	/**
	 * Devuelve la marca del telefono
	 * @return marca del telefono
	 */

	public String getMarcaTelefono(){
		return marcaTelefono;
	}
	
	/**
	 * Cambia la marca del telefono
	 * @param marcaTelefono nueva marca del telefono 
	 */

	public void setMarcaTelefono(String marcaTelefono){
		this.marcaTelefono = marcaTelefono;
	}

	/**
	 * Devuelve el precio del telefono
	 * @return precio del telefono
	 */

	public String getPrecioTelefono(){
		return precioTelefono; 
	}
	
	/**
	 * Cambia precio del telefono
	 * @param precioTelefono nuevo precio del telefono
	 */

	public void setPrecioTelefono(String precioTelefono){
		this.precioTelefono = precioTelefono;
	}

	/**
	 * Devuelve el descuento del telefono
	 * @return descuento del telefono
	 */

	public String getDescuentoTelefono(){
		return descuentoTelefono; 
	}

	/**
	 * Aplica el descuento del telefono
	 * @param descuentoTelefono aplica el descuento
	 */

	public void setDescuentoTelefono(String descuentoTelefono){
		this.descuentoTelefono = descuentoTelefono; 
	}

	public Double precioFinal(String precioTelefono, String descuentoTelefono){
		if (descuentoTelefono == null || descuentoTelefono.isEmpty()) {
			return Double.parseDouble(precioTelefono);
		}
		Double precioTelefonoDouble = 0.0;
		Double descuentoTelefonoDouble = 0.0;
		try {
			precioTelefonoDouble = Double.parseDouble(precioTelefono);
   			descuentoTelefonoDouble = Double.parseDouble(descuentoTelefono);
		} catch (NumberFormatException e) {
   			descuentoTelefonoDouble = 0.0;
		}
		return (double)Math.round(precioTelefonoDouble *(100 - descuentoTelefonoDouble))/100;
	}
	
	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas del telefono
	 * @return todas las caracteristicas
	 */

	public String toString(){
		return  modeloTelefono + " " + marcaTelefono + " " + precioTelefono + " " + descuentoTelefono + " " + precioFinal(precioTelefono, descuentoTelefono) + "\n";
	}

}

