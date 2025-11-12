//Ejercicio 4. Recorrido y transformación de listas
//Crea una lista llamada cuerposCelestes con los valores ['sol', 'luna', 'estrella']. 
//Recorre la lista con un bucle for-in e imprime cada elemento. 
//Usa el método .map() para crear una nueva lista con los mismos
//elementos en mayúsculas. Imprime la nueva lista.

void main(){

var cuerposCelestes = ["sol","luna","estrella"];
for(var cuerposCeleste in cuerposCelestes){
  print(cuerposCeleste);
}
var enMayus =cuerposCelestes.map((f)=> f.toUpperCase());
  print(enMayus);
}