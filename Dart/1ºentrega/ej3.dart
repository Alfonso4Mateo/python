//Ejercicio 3. Listas básicas
//Crea una lista con tres de tus comidas favoritas. 
//Añade una cuarta comida al final con el método .add().
//Elimina la segunda comida con .removeAt(). 
//Muestra la lista resultante por pantalla

void main(){

var comida = ["macarrones","tortilla","pizza"];
comida.add("Helado");
comida.removeAt(1);
print(comida);

}