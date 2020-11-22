package dominio;

public class Telefono{
	private String modeloTelefono;
	private String marcaTelefono;
	private int precioTelefono; 
	private int descuentoTelefono;

	public Telefono(){
		modeloTelefono = "";
		marcaTelefono = "";
		precioTelefono = "";
		descuentoTelefono = "";
	}

	public Telefono(String modeloTelefono, String marcaTelefono, int precioTelefono, int descuentoTelefono){
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
	public int getPrecioTelefono(){
		return precioTelefono; 
	}
	public void int setPrecioTelefono(int precioTelefono){
		this.precioTelefono = precioTelefono;
	}
	public int getDescuentoTelefono(){
		return descuentoTelefono; 
	}
	public void int setDescuentoTelefono(int descuentoTelefono){
		this.descuentoTelefono = descuentoTelefono; 
	}

	public String toString(){
		return marcaTelefono + " " + modeloTelefono + " " +
		       precioTelefono + " " + descuentoTelefono + 
	       	        " " + "\n";
	}
}
