package dominio;

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

	public String toString(){
		return marcaTelefono + " " + modeloTelefono + " " +
		       precioTelefono + " " + descuentoTelefono + 
	       	        " " + "\n";
	}
}
