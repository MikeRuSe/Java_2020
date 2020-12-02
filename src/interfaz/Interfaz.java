package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * Esta clase interpreta los datos que el usuario introduce en Principal.java
 *
 * @author: Jorge Martin-Benito Garcia, Xavier Alexander Mora Peraza, Dulibeth Medina Chirinos, Miguel Rubio Semelas
 *
 * @version: 1.0.14
 *
 */

public class Interfaz{
	private static String HELP = "-Insertar telefonos:" + "\n   java -cp bin aplicacion.Principal add <Nuevo_modelo> <Marca> <precio> <descuento> " +
								 "\n-Listar telefonos:" + "\n   java -cp bin aplicacion.Principal list" +
								 "\n-Modificar telefonos:" + "\n   java -cp bin aplicacion.Principal modify <Modelo_modificar> <Nuevo_modelo> <Marca> <precio> <descuento>" +
								 "\n-Borrar telefonos:" + "\n   java -cp bin aplicacion.Principal remove <Modelo_borrar>";
	private static String NOMBRE_FICHERO = "catalogoDeTelefonos.txt";
	
	/**
	 *
	 * Este método procesa los datos según el usuario lo haya especificado
	 *
	 * @param input datos que introduce el usuario
	 *
	 */

	public static void procesado(String input){
		String[] args = input.split(" ");
		Catalogo catalogo = inicializarCatalogo(NOMBRE_FICHERO);
		if (args.length < 1) {
			System.err.println("ERROR: 'No hay suficientes parametros'");
			System.exit(128);
		} else {
			if(args[0].equals("help")){
				System.out.println(HELP);
			} else if (args[0].equals("list")){
				if(catalogo.toString().equals("")){
					System.out.println("ADVERTENCIA: 'No hay ningun telefono en el catalogo'");
				} else {
					System.out.println(catalogo);
				}
			} else if (args[0].equals("add")){
				if (args.length < 5) {
					System.err.println("ERROR: 'No hay suficientes parametros'");
					System.exit(128);
				} 
				else if (args.length > 5) {
					System.err.println("ERROR: 'Se han introducido demasiados parametros'");
					System.exit(129);
				}  else {
				Telefono telefono = new Telefono(args[1], args[2], args[3], args[4], "");
				catalogo.annadirTelefono(telefono);
				inicializarFichero(catalogo);
				}
			}
			else if (args[0].equals("modify")){
				if (args.length < 6) {
					System.err.println("ERROR: 'No hay suficientes parametros'");
					System.exit(128);
				} 
				else if (args.length > 6) {
					System.err.println("ERROR: 'Se han introducido demasiados parametros'");
					System.exit(129);
				} else {
				String argumentos = args[1];
				Telefono telefono = new Telefono(args[2], args[3], args[4], args[5], "");
				System.out.println("Datos sin actualizar: \n" + catalogo.toString());
				catalogo.modificarTelefono(telefono, argumentos);
				System.out.println("Datos actualizados: \n" + catalogo.toString());
				inicializarFichero(catalogo);
				}
			}
			else if (args[0].equals("remove")){
				if (args.length < 2) {
					System.err.println("ERROR: 'No hay suficientes parametros'");
					System.exit(128);
				} 
				else if (args.length > 2) {
					System.err.println("ERROR: 'Se han introducido demasiados parametros'");
					System.exit(129);
				} else {
				String argumentos = args[1];
				catalogo.eliminarTelefono(argumentos);
				inicializarFichero(catalogo);
				}
			}
		}
	}

	/**
	 *
	 * Este método escribe los datos en un fichero
	 *
	 * @param catalogo datos que se introducen en el fichero
	 *
	 */

	private static void inicializarFichero(Catalogo catalogo){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(catalogo.toString());
			fw.close();
		} catch (Exception e){
			System.out.println(e);
		}
	}

	/**
	 *
	 * Este método devuelve los Telefonos del catálogo de móviles
	 *
	 * @return catalogo de móviles
	 *
	 */

	private static Catalogo inicializarCatalogo(String nombreFichero){
		Catalogo catalogo = new Catalogo();
		try{
			File file = new File(nombreFichero);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String modeloTelefono = sc.next();
				String marcaTelefono = sc.next();
				String precioTelefono = sc.next();
				String descuentoTelefono = sc.next();
				String precioTotal = sc.next();
				Telefono telefono = new Telefono(modeloTelefono, marcaTelefono, precioTelefono, descuentoTelefono, precioTotal);
				catalogo.annadirTelefono(telefono);
			}
			sc.close();
		} catch (FileNotFoundException e){
			inicializarFichero(catalogo);
		} catch (Exception e){
			System.out.println(e);
		}
		return catalogo;
	}
}

