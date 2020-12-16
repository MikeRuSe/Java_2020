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

package aplicacion;

import interfaz.Interfaz;
/**
 * Esta clase recibe argumentos por consola y los manda a interfaz para ejecutarlos
 * 
 *
 * @author Jorge Martin-Benito Garcia
 * @author Xavier Alexander Mora Peraza
 * @author Dulibeth Medina Chirinos
 * @author Miguel Rubio Semelas
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
         * - csv
         * - help
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
