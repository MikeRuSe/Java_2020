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
package dominio;

public class Tablet extends Dispositivo {
    private double capacidadBateria;
    private double camaraPixel;

    public Tablet(String modelo, String marca, String precio, String descuento, String capacidadBateria, String camaraPixel) {
        super(modelo, marca, precio, descuento);
        this.capacidadBateria = Double.parseDouble(capacidadBateria);
        this.camaraPixel = Double.parseDouble(camaraPixel);
    }

    @Override
    public String toCSV() {
        return  getModelo() + "," + getMarca() + "," + getPrecio() + "," + getDescuento() + "," + getPrecioTotal() + ","
                    + capacidadBateria + "," + camaraPixel + "\n";
    }

    @Override
    public String toString() {
        return  getModelo() + " " + getMarca() + " " + getPrecio() + " " + getDescuento() + " " + getPrecioTotal() + " "
                    + capacidadBateria + " " + camaraPixel + "\n";
    }
}