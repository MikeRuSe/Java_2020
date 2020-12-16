/*
Copyright 2020 Jorge Martin-Benito Garcia, Xavier Alexander Mora Peraza, Dulibeth Medina Chirinos and Miguel Rubio Semelas
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * Esta clase interpreta los datos que el usuario introduce en Principal.java.
 *
 */
public class Interfaz {
	private static String HELP = "\n-Insertar telefonos:" + "\n   java -jar catalogoDispositivos.jar add S-<Nuevo_modelo> <Marca> <precio> <descuento> " +
								 "\n\n-Insertar tablets:" + "\n   java -jar catalogoDispositivos.jar add T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>" +
								 "\n\n-Insertar ordenadores:" + "\n   java -jar catalogoDispositivos.jar add O-<Nuevo_modelo> <Marca> <precio> <descuento> <RAM> <CPU>" +
								 "\n\n-Listar dispositivos:" + "\n   java -jar catalogoDispositivos.jar list" +
								 "\n\n-Modificar telefonos:" + "\n   java -jar catalogoDispositivos.jar modify S-<Modelo_modificar> S-<Nuevo_modelo> <Marca> <precio> <descuento>" +
								 "\n\n-Modificar tablets:" + "\n   java -jar catalogoDispositivos.jar modify T-<Modelo_modificar> T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>" +
								 "\n\n-Modificar ordenadores:" + "\n   java -jar catalogoDispositivos.jar modify O-<Modelo_modificar> O-<Nuevo_modelo> <Marca> <precio> <descuento> <RAM> <CPU>" +
								 "\n\n-Borrar dispositivos:" + "\n   java -jar catalogoDispositivos.jar remove <Modelo_borrar>" +
								 "\n\n-Exportar catalogo de dispositivos a CSV:" + "\n   java -jar catalogoDispositivos.jar csv <nombre_fichero(opcional)>" +
								 "\n\n-Mostrar este cuadro de ayuda:" + "\n   java -jar catalogoDispositivos.jar help";
	private static String NOMBRE_FICHERO = "catalogoDeDispositivos.txt";
	private static String NOMBRE_CSV = "catalogoDeDispositivos.csv";

	private static int ATRIBUTOS_TELEFONO = 4;
	private static int ATRIBUTOS_TABLET	= 6;
	private static int ATRIBUTOS_ORDENADOR	= 6;
	
	/**
	 * Este método procesa los datos según el usuario lo haya especificado.
	 *
	 * @param input parámetros que introduce el usuario por consola
	 */
	public static void procesado(String input) {
		String[] args = input.split(" ");
		Catalogo catalogo = inicializarCatalogo(NOMBRE_FICHERO);
		if (args.length < 1) {
			System.err.println("ERROR: 'No hay suficientes parametros.'");
			System.exit(128);
		} else {
			if (args[0].equals("help")) { /* --------- AYUDA --------- */
				System.out.println(HELP);
			} else if (args[0].equals("list")) {
				if(catalogo.toString().equals("")) {
					System.out.println("ADVERTENCIA: 'No hay ningun telefono en el catalogo.'");
				} else {
					System.out.println(catalogo);
				}
			} else if (args[0].equals("add")) { /* --------- AÑADIR --------- */
				if (args.length > 2) {
					String modelo = args[1];

					if (catalogo.revisarModelo(modelo) == false) {
						Dispositivo nuevoDispositivo = new Telefono(); // Inicializamos a un Telefono vacio.

						switch (modelo.charAt(0)) {
							case 'S':
								if (args.length < ATRIBUTOS_TELEFONO + 1) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_TELEFONO + 1 ) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								nuevoDispositivo = new Telefono(modelo, args[2], args[3], args[4]);
								break;
							case 'T':
								if (args.length < ATRIBUTOS_TABLET + 1) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_TABLET + 1 ) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								nuevoDispositivo = new Tablet(modelo, args[2], args[3], args[4], args[5], args[6]);
								break;
							case 'O':
								if (args.length < ATRIBUTOS_ORDENADOR + 1) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_ORDENADOR + 1 ) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								nuevoDispositivo = new Ordenador(modelo, args[2], args[3], args[4], args[5], args[6]);
								break;
							default: 
								System.err.println("ERROR: 'Se han introducido parametros no validos.'");
								System.exit(126);
						}

						catalogo.annadirDispositivo(nuevoDispositivo);
						inicializarFichero(catalogo);
					} else {
						System.err.println("ERROR: 'Producto duplicado, realice un modify.'");
						System.exit(126);
					}
				} else {
					System.err.println("ERROR: 'No hay suficientes parametros.'");
					System.exit(128);
				}
			} else if (args[0].equals("modify")) {  /* --------- MODIFICAR --------- */
				if (args.length > 3) {
					String modelo = args[1];

					if (catalogo.revisarModelo(modelo) == true) {
						Dispositivo dispositivoToModify = new Telefono(); // Inicializamos a un Telefono vacio.

						if (modelo.charAt(0) != args[2].charAt(0)) {
							System.err.println("ERROR: 'No se permite el cambio de tipo de dispositvo. Cree un dispositivo nuevo con add.'");
							System.exit(126);
						}

						switch(modelo.charAt(0)) {	// Utilizar args[2].chartAt(0) para permitir el cambio de tipo de dispositivo.
							case 'S':
								if (args.length < ATRIBUTOS_TELEFONO + 2) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_TELEFONO + 2) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								dispositivoToModify = new Telefono(args[2], args[3], args[4], args[5]);
								break;
							case 'T':
								if (args.length < ATRIBUTOS_TABLET + 2) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_TABLET + 2) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								dispositivoToModify = new Tablet(args[2], args[3], args[4], args[5], args[6], args[7]);
								break;
							case 'O':
								if (args.length < ATRIBUTOS_ORDENADOR + 2) {
									System.err.println("ERROR: 'No hay suficientes parametros.'");
									System.exit(128);
								} else if (args.length > ATRIBUTOS_ORDENADOR + 2) {
									System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
									System.exit(126);
								}
								dispositivoToModify = new Ordenador(args[2], args[3], args[4], args[5], args[6], args[7]);
								break;
							default:
								System.err.println("ERROR: 'Se han introducido parametros no validos.'");
								System.exit(126);
						}

						System.out.println("Datos sin actualizar: \n" + catalogo.toString());
						catalogo.modificarDispositivo(dispositivoToModify, modelo);
						System.out.println("Datos actualizados: \n" + catalogo.toString());
						inicializarFichero(catalogo);
					} else {
						System.err.println("ERROR: 'Producto no en la lista, realice un add.'");
						System.exit(126);
					}
				} else {
					System.err.println("ERROR: 'No hay suficientes parametros.'");
					System.exit(128);
				}
			} else if (args[0].equals("csv")) { /* --------- CSV --------- */
				if (args.length < 1) {
					System.err.println("ERROR: 'No hay suficientes parametros.'");
					System.exit(128);
				} else if (args.length == 1) {
					generarCSV(catalogo);
					System.err.println("Se ha generado el fichero '" + NOMBRE_CSV +"'");
				} else if (args.length > 2) {
					System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
					System.exit(126);
				} else {
					NOMBRE_CSV = args[1]+".csv";
					generarCSV(catalogo);
					System.err.println("Se ha generado el fichero '" + NOMBRE_CSV +"'");
				}
			} else if (args[0].equals("remove")) { /* --------- BORRAR --------- */
				if (args.length < 2) {
					System.err.println("ERROR: 'No hay suficientes parametros.'");
					System.exit(128);
				} else if (args.length > 2) {
					System.err.println("ERROR: 'Se han introducido demasiados parametros.'");
					System.exit(126);
				} else {
					String argumentos = args[1];
					catalogo.eliminarDispositivo(argumentos);
					inicializarFichero(catalogo);
				}
			} else {
				System.err.println("\nERROR: 'No se reconoce el parametro.'" + "\nINFO: Utilice el parametro 'help'");
				System.exit(127);
			}
		}
	}

	/**
	 * Este método escribe los datos en un fichero.
	 *
	 * @param catalogo datos que se introducen en el fichero.
	 */
	private static void inicializarFichero(Catalogo catalogo) {
		try {
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(catalogo.toString());
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Este método exporta los datos en un csv con una cabecera. 
	 *
	 * @param catalogo datos que se introducen en el fichero.
	 */
	private static void generarCSV(Catalogo catalogo) {
		try {
			FileWriter fw = new FileWriter(NOMBRE_CSV);
			fw.write(catalogo.toCSV());
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Este método devuelve los Telefonos del catálogo de móviles.
	 *
	 * @return catalogo de móviles.
	 */
	private static Catalogo inicializarCatalogo(String nombreFichero) {
		Catalogo catalogo = new Catalogo();
		try {
			File file = new File(nombreFichero);
			Scanner sc = new Scanner(file);

			while(sc.hasNext()) {
				// Se lee una línea del documento. A continuación, se separa la línea por
				// atributos (separados por espacios) y se almacena en un array.
				String[] atributosDispositivo = sc.nextLine().split(" ");
				if (atributosDispositivo.length < 4) {  // Comprobamos el número minimo de atributos.
					continue;	// Se salta un ciclo del while.
				}

				Dispositivo dispositivo;

				switch (atributosDispositivo[0].charAt(0)) {	// Comprobamos el tipo de dispositivo.
					case 'S':
						dispositivo = new Telefono(atributosDispositivo[0], atributosDispositivo[1], atributosDispositivo[2], atributosDispositivo[3]);
						break;
					case 'T':
						dispositivo = new Tablet(atributosDispositivo[0], atributosDispositivo[1], atributosDispositivo[2], atributosDispositivo[3],
										atributosDispositivo[4], atributosDispositivo[5]);
						break;
					case 'O':
						dispositivo = new Ordenador(atributosDispositivo[0], atributosDispositivo[1], atributosDispositivo[2], atributosDispositivo[3],
										atributosDispositivo[4], atributosDispositivo[5]);
						break;
					default:
						dispositivo = new Telefono();	// En caso de no encontrar un dispositivo, se queda en un telefono vacio.
				}

				catalogo.annadirDispositivo(dispositivo);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			inicializarFichero(catalogo);
		} catch (Exception e) {
			System.out.println(e);
		}
		return catalogo;
	}
}
