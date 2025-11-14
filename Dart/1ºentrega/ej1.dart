//Ejercicio 1. Tipos y variables

//Declara variables de tipo int, double, bool y String. 
//Asigna valores a cada una y muestra un mensaje en
//pantalla que combine todos los valores usando interpolación de cadenas ($variable).

void main (){

int edad = 30;
double precio = 9.99;
bool activo = true;
String saludo = "Hola tonto";

print("""Edad: $edad
Precio: $precio
Activo: $activo
Saludo: $saludo""");
}