# Proyecto 1: gestor de catálogo de productos

## Descripción
Programa que permite el alta, baja y modificación de productos (en este caso dispositivos móviles).

Es capaz de obtener el precio base y aplicarle el descuento introducido de forma automática.

Versión estable: 1.2.14.12220 (12-02-2020).


## Requisitos 
##### Sistema operativo Linux (Debian / Ubuntu / CentOS) o Windows con Git #####
##### Java 11.0.8 2020-07-14 & Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS). #####
```BASH
sudo apt-get update  
sudo apt install default-jre
```
##### Git  2.28.0 instalado #####
```BASH
sudo apt-get update  
sudo apt-get install git -y
```
##### Realizar un git clone del repositorio: #####
```BASH
git clone https://MigueLitros@bitbucket.org/MigueLitros/final-project.git
```
##### Ubicarnos en la carpeta del programa: #####
```BASH
cd final-project
```
##### Instalar make:#####
```BASH
sudo apt-get install build-essential
```
##### Compilar el programa con: #####
```BASH
make compilar
```
### Diagrama del programa ###
![https://bitbucket.org/MigueLitros/final-project/src/master/img/CatalogoTelefonos.png](https://i.gyazo.com/4e78c8e248f5bd47a9ebbb845ede843a.png)
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

### Desarrolladores ###

* Jorge Martin-Benito Garcia
* Xavier Alexander Mora Peraza
* Dulibeth Medina Chirinos
* Miguel Rubio Semelas