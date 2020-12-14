package aplicacion;

import interfaz.Interfaz;
/**
 * Esta clase recibe argumentos por consola y los manda a interfaz para ejecutarlos
 * 
 *
 * @author Jorge Martin-Benito Garcia, Xavier Alexander Mora Peraza, Dulibeth Medina Chirinos, Miguel Rubio Semelas
 * 
 * @version 1.3.0.121420
 */
public class Principal {

	/**
	 * Toma como entrada unos argumentoss por consola
	 * @param args Argumentos del programa 
	 * Los parámetros permitidos son:
         * - list
         * - remove
         * - add
         * - modify
         * - help
         * 
         * (Cualquier otro parámetro generará el error 127 'No se reconoce el parametro'). 
        */
        public static void main(String[] args) {
                String input = "";
                for(int i = 0; i< args.length; i++) {
                        input += args[i] + " ";
                }
                Interfaz.procesado(input);
        }
}
