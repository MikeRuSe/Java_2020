package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.*;
import java.text.*;

public class Interfaz {
	private static String HELP_TEXT = "Texto de ayuda";
	private static String NOMBRE_FICHERO = "libretaDeContactos.txt";
	public static void main(String[] args) {
		Libreta libreta = inicializarLibreta(NOMBRE_FICHERO);
		//procesar args[0]
		if(args[0].equals("help")) {
			System.out.println(HELP_TEXT);
		} else if (args[0].equals("list")) {
			System.out.println(libreta);
		} else if (args[0].equals("add")) {
			Contacto contacto = new Contacto(args[1], args[2]);
			libreta.annadirContacto(contacto);
			inicializarFichero(libreta);
		}
	}
	private static void inicializarFichero(Libreta libreta) {
		try {
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(libreta.toString());
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static Libreta inicializarLibreta(String nombreFichero) {
		Libreta libreta = new Libreta();
		try {
			Scanner sc = new Scanner(nombreFichero);
			while(sc.hasNext()) {
				String nombre = sc.next();
				String nTel = sc.next();
				Contacto contacto = new Contacto(nombre, nTel);
				libreta.annadirContacto(contacto);
			} 
			sc.close();
		} /*catch (FileNotFoundException e) {
			//System.out.println(e);
			System.out.println("No hay ningun contacto en la libreta");
		}*/ catch (Exception e) {
			System.out.println(e);
		}
		return libreta;
	}
}