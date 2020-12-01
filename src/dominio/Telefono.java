package dominio;

import java.lang.Math;

public class Telefono{
	private String modeloTelefono;
	private String marcaTelefono;
	private String precioTelefono; 
	private String descuentoTelefono;
	private String precioFinalString;

	public Telefono(){
		modeloTelefono = "";
		marcaTelefono = "";
		precioTelefono = "";
		descuentoTelefono = "";
	}

	public Telefono(String modeloTelefono, String marcaTelefono, String precioTelefono, String descuentoTelefono){
		this.modeloTelefono = modeloTelefono;
		this.marcaTelefono = marcaTelefono;
		this.precioTelefono = precioTelefono;
		this.descuentoTelefono = descuentoTelefono;
	}

	public String getModeloTelefono(){
		return modeloTelefono;
	}

	public void setModeloTelefono(String modeloTelefono){
		this.modeloTelefono = modeloTelefono;
	}

	public String getMarcalotelefono(){
		return marcaTelefono;
	}

	public void setMarcaTelefono(String marcaTelefono){
		this.marcaTelefono = marcaTelefono;
	}
	public String getPrecioTelefono(){
		return precioTelefono; 
	}
	public void setPrecioTelefono(String precioTelefono){
		this.precioTelefono = precioTelefono;
	}
	public String getDescuentoTelefono(){
		return descuentoTelefono; 
	}
	public void setDescuentoTelefono(String descuentoTelefono){
		this.descuentoTelefono = descuentoTelefono; 
	}

	public Double precioTotal(String precioTelefono, String descuentoTelefono){
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

	public String toString(){
		return  modeloTelefono + " " + marcaTelefono + " " + precioTelefono + " " + descuentoTelefono + " " + precioTotal(precioTelefono, descuentoTelefono) + "\n";
	}
}