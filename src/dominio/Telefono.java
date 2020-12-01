package dominio;

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

	public String toString(){
		return  modeloTelefono + " " + marcaTelefono + " " + precioTelefono + " " + descuentoTelefono + " " /* + precioTotal(precioTelefono, descuentoTelefono) */ + "\n";
	}
}
