package aplicacion;

import interfaz.Interfaz;
/*
 * Esta clase recibe argumentos por consola y los manda a interfaz para ejecutarlos
 *
 *@author: Jorge Martin-Benito Garcia, Xavier Alexander Mora Peraza, Dulibeth Medina Chirinos, Miguel Rubio Semelas
 * 
 * @version: 1.2.14.12220
 */
public class Principal{

	/**
	 * Toma como entrada una cadena de caracteres
	 * @param args Argumentos del programa 
	 * */
        public static void main(String[] args){
                String input = "";
                for(int i = 0; i< args.length; i++){
                        input += args[i] + " ";
                }
                Interfaz.procesado(input);
        }
}
