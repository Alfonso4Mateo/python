//Ejercicio 7. Funciones con parámetros opcionales
//Define una función llamada saludar que reciba 
//un parámetro obligatorio String nombre y un parámetro
//opcional String mensaje con valor por defecto 
//'¡Hola!'. La función debe mostrar en pantalla el saludo
//completo. Llama a la función dos veces: 
//una pasando solo el nombre y otra pasando ambos parámetros

void saludar(String nombre,[String mensaje="Hola"]){
  print("$mensaje,$nombre");

}

void main(){
  saludar("alfon");
  saludar("alfon","GAY");
}