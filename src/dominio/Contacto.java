package dominio;

public class Contacto{
	private String nombre;
	private String numeroDeTelefono;

	public Contacto(){
		nombre = "";
		numeroDeTelefono = "";
	}

	public Contacto(String nombre, String nTel){
		this.nombre = nombre;
		this.numeroDeTelefono = nTel;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNumeroDeTelefono(){
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String nTel){
		this.numeroDeTelefono = nTel;
	}

	public String toString(){
		return nombre + " " + numeroDeTelefono + "\n";
	}
}
