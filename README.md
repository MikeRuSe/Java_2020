# README #

# Proyecto 1: gestor de catálogo de productos o servicios

## Descripción
Programa que permite el alta, baja y modificación de productos (en este caso dispositivos móviles).


## Requisitos 

1. Java 11.0.8 2020-07-14 & Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS).
```BASH
> sudo apt-get update  
> sudo apt install default-jre
```
2. Git  2.28.0 instalado
```BASH
> sudo apt-get update  
> sudo apt-get install git -y
```
3. Realizar un git clone del repositorio:
```BASH
> git clone https://MigueLitros@bitbucket.org/MigueLitros/final-project.git
```
4. Ubicarnos en la carpeta del programa:
```BASH
> cd final-project
```
5. Compilar el programa con:
```BASH
> make compilar
```
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