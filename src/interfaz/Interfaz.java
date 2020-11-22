package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Interfaz{
	private static String HELP = "Texto de ayuda";
	private static String NOMBRE_FICHERO = "catalogoDeTelefonos.txt";

	public static void procesado(String input){
		String[] args = input.split(" ");
		Catalogo catalogo = inicializarCatalogo(NOMBRE_FICHERO);
		if(args[0].equals("help")){
			System.out.println(HELP);
		} else if (args[0].equals("list")){
			if(catalogo.toString().equals("")){
				System.out.println("No hay ningún telefono en el catalogo");
			} else {
				System.out.println(catalogo);
			}
		} else if (args[0].equals("add")){
			Telefono telefono = new Telefono(args[1], args[2], args[3], args[4]);
			catalogo.annadirTelefono(telefono);
			inicializarFichero(catalogo);
		}
		else if (args[0].equals("modify")){
			String argumentos = args[1];
			//int index = catalogo.coleccionTelefonos.indexOf(args[1]);
			Telefono telefono = new Telefono(args[2], args[3], args[4], args[5]);
			catalogo.modificarTelefono(telefono, argumentos);
			inicializarFichero(catalogo);
		}
		else if (args[0].equals("remove")){
			String argumentos = args[1];
			//int index = catalogo.indexOf(args[1]);
			catalogo.eliminarTelefono(argumentos);
			inicializarFichero(catalogo);
		}
	}

	private static void inicializarFichero(Catalogo catalogo){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(catalogo.toString());
			fw.close();
		} catch (Exception e){
			System.out.println(e);
		}
	}

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
				Telefono telefono = new Telefono(modeloTelefono, marcaTelefono, precioTelefono, descuentoTelefono);
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

