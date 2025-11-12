//Ejercicio 2. Operadores Null-aware

//Crea una variable String? nombre; sin asignarle valor. 
//Muestra en consola el contenido de la variable,
//pero si es null, debe imprimirse el texto 'Invitado', usando el operador ??.

void main(){

String? nombre;

print(nombre ?? "Invitado");

}