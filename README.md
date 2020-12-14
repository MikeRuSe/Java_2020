# Proyecto 1: gestor de catálogo de productos

## Descripción
Programa que permite el alta, baja y modificación de productos (en este caso dispositivos móviles).

Es capaz de obtener el precio base y aplicarle el descuento introducido de forma automática.

Versión estable: 1.3.0.121420 (12-14-2020).


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
### Diagrama del programa ###
![https://bitbucket.org/MigueLitros/final-project/src/master/img/CatalogoDeTelefonos.png](https://i.gyazo.com/03d0dc4dc6acef603331f07a72d3f490.png)
### Instrucciones de uso ###
#### Añadir teléfonos ####
```BASH
java -cp bin aplicacion.Principal add <Nuevo_modelo> <Marca> <precio> <descuento>
```
#### Listar teléfonos ####
```BASH
java -cp bin aplicacion.Principal list
```
#### Modificar teléfonos ####
```BASH
java -cp bin aplicacion.Principal modify <Modelo_modificar> <Nuevo_modelo> <Marca> <precio> <descuento>
```
#### Borrar teléfonos ####
```BASH
java -cp bin aplicacion.Principal remove <Modelo_borrar>
```
#### Exportar el catalogo a CSV ####
```BASH
java -cp bin aplicacion.Principal csv <nombre_fichero(opcional)>
```
#### Mostrar cuadro de ayuda ####
```BASH
java -cp bin aplicacion.Principal help
```

### Desarrolladores ###

* Jorge Martin-Benito Garcia
* Xavier Alexander Mora Peraza
* Dulibeth Medina Chirinos
* Miguel Rubio Semelas

### Licencia ###
Type: CC BY
This license lets others distribute, remix, adapt, and build upon your work, even commercially, as long as they credit you for the original creation. This is the most accommodating of licenses offered. Recommended for maximum dissemination and use of licensed materials.

![https://bitbucket.org/MigueLitros/final-project/src/master/img/logo_cc.jpg](https://i.gyazo.com/d5c2f506fdd9e679b02c9bfaa28193e3.png)