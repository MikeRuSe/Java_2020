package dominio;

public class Telefono{
	private String modeloTelefono;
	private String marcaTelefono;
	private String precioTelefono; 
	private String descuentoTelefono;
	private String precioFinalString;

	/**
	 * Este es un metodo constructor de 5 parametros con las caracteristicas de del telefono
	 * @param modeloTelefono modelo del telefono
	 * @param marcaTelefono marca del telefono 
	 * @param precioTelefono precio del telefono
	 * @param descuentoTelefono descuento del telefono 
	 * @param precioFinalString precio final del telefono
	 */

	public Telefono(String modeloTelefono, String marcaTelefono, String precioTelefono, String descuentoTelefono){
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
	 * Cambia aplica el descuento del telefono
	 * @param descuentoTelefono aplica el descuento
	 */

	public void setDescuentoTelefono(String descuentoTelefono){
		this.descuentoTelefono = descuentoTelefono; 
	}

	public String precioTotal(String precioTelefono, String descuentoTelefono){
		int precioTelefonoInt = 1000;
		int descuentoTelefonoInt = 15;
		try {
   			precioTelefonoInt = Integer.parseInt(precioTelefono);
			}
		catch (NumberFormatException e) {
   			precioTelefonoInt = 0;
		}
		try {
   			descuentoTelefonoInt = Integer.parseInt(descuentoTelefono);
			}	
		catch (NumberFormatException e) {
   			descuentoTelefonoInt = 0;
		}
		int precioFinal = (precioTelefonoInt * ((100 - descuentoTelefonoInt)/100));
		precioFinalString = String.valueOf(precioFinal);
		return precioFinalString;
	}
	
	/**
	 * Este metodo devuelve ordenadamente todas las caracteristicas del telefono
	 * @return todas las caracteristicas
	 */

	public String toString(){
		return  modeloTelefono + " " + marcaTelefono + " " + precioTelefono + " " + descuentoTelefono + " " /* + precioTotal(precioTelefono, descuentoTelefono) */ + "\n";
	}
}

