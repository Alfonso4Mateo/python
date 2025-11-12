//Ejercicio 8. Listas y funciones flecha
//Crea una lista llamada numeros con los valores [2, 5, 7, 10]. 
//Usa el método .map() junto con una función
//flecha (=>) para generar una nueva lista con los cuadrados 
//de los números. Usa el método .fold() para
//obtener la suma total de todos los elementos de la lista original. 
//Muestra ambos resultados por consola.

void main(){

  var nums =[2,7,9,10];

  var cuadradros = nums.map((nums)=> nums*nums).toList();

  var sumaTotal = nums.fold(0,(suma,nums)=>suma + nums);

  print(cuadradros);
  print(sumaTotal);
}