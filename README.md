# Proyecto 1: gestor de catálogo de productos

## Descripción
Programa que permite el alta, baja y modificación de productos (en este caso dispositivos).

Es capaz de obtener el precio base y aplicarle el descuento introducido de forma automática.

Versión estable: 1.4.0.121620 (12-16-2020).


## Requisitos 
##### Sistema operativo Linux (Debian / Ubuntu / CentOS) o Windows con Git #####
##### Java 11.0.8 2020-07-14 & Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS). #####
```BASH
sudo apt-get update  
sudo apt install default-jre
```
##### Git 2.28.0 instalado #####
```BASH
sudo apt-get update  
sudo apt-get install git -y
```
##### Instalar make:#####
```BASH
sudo apt-get install build-essential
```
##### Realizar un git clone del repositorio: #####
```BASH
git clone https://MigueLitros@bitbucket.org/MigueLitros/final-project.git
```
##### Ubicarnos en la carpeta del programa: #####
```BASH
cd final-project
```
##### Compilar el programa con: #####
```BASH
make compilar
```
##### Crear el ejecutable JAR: #####
```BASH
make jar
```
##### Exportar el catálogo de dispositivos a CSV: #####
```BASH
make csv
```
### Diagrama del programa ###
![https://bitbucket.org/MigueLitros/final-project/src/master/img/class%20diagram.png](https://i.gyazo.com/e13a937143e2390744840a13133d17f9.png)
### Instrucciones de uso ###
#### Añadir teléfonos ####
```BASH
java -cp bin aplicacion.Principal add S-<Nuevo_modelo> <Marca> <precio> <descuento>
```
o
```BASH
java -jar catalogoDispositivos.jar add S-<Nuevo_modelo> <Marca> <precio> <descuento>
```
#### Añadir tablets ####
```BASH
java -cp bin aplicacion.Principal add T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>
```
o
```BASH
java -jar catalogoDispositivos.jar add T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>
```
#### Listar dispositivos ####
```BASH
java -cp bin aplicacion.Principal list
```
o
```BASH
java -jar catalogoDispositivos.jar list
```
#### Modificar teléfonos ####
```BASH
java -cp bin aplicacion.Principal modify S-<Modelo_modificar> S-<Nuevo_modelo> <Marca> <precio> <descuento>
```
o
```BASH
java -jar catalogoDispositivos.jar modify S-<Modelo_modificar> S-<Nuevo_modelo> <Marca> <precio> <descuento>
```
#### Modificar tablets ####
```BASH
java -cp bin aplicacion.Principal modify T-<Modelo_modificar> T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>
```
o
```BASH
java -jar catalogoDispositivos.jar modify T-<Modelo_modificar> T-<Nuevo_modelo> <Marca> <precio> <descuento> <bateria> <camaraPixel>
```
#### Borrar dispositivos ####
```BASH
java -cp bin aplicacion.Principal remove (S-/T-)<Modelo_borrar>
```
o
```BASH
java -jar catalogoDispositivos.jar remove (S-/T-)<Modelo_borrar>
```
#### Exportar el catalogo de dispositivos a CSV ####
```BASH
java -cp bin aplicacion.Principal csv <nombre_fichero(opcional)>
```
o
```BASH
java -jar catalogoDispositivos.jar csv <nombre_fichero(opcional)>
```
#### Mostrar cuadro de ayuda ####
```BASH
java -cp bin aplicacion.Principal help
```
o
```BASH
java -jar catalogoDispositivos.jar help
```

### Desarrolladores ###

* Jorge Martin-Benito Garcia
* Xavier Alexander Mora Peraza
* Dulibeth Medina Chirinos
* Miguel Rubio Semelas

### Licencia ###
![https://bitbucket.org/MigueLitros/final-project/src/master/img/logo_cc.jpg](https://i.gyazo.com/d5c2f506fdd9e679b02c9bfaa28193e3.png)

Type: CC BY,
This license lets others distribute, remix, adapt, and build upon your work, even commercially, as long as they credit you for the original creation. This is the most accommodating of licenses offered. Recommended for maximum dissemination and use of licensed materials.