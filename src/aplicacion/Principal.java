package aplicacion;

import interfaz.Interfaz;

public class Principal{

        public static void main(String[] args){
                String input = "";
                for(int i = 0; i< args.length; i++){
                        input += args[i] + " ";
                }
                Interfaz.procesado(input);
        }
}
