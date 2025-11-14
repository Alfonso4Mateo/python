//Ejercicio 2. Filtrado de listas
//Dada la lista [12, 5, 7, 20, 3, 8], usa el método.where() 
//para obtener una lista
//con solo los números mayores que 10 e imprímela.
void main() {
  List<int> numeros = [12, 5, 7, 20, 3, 8];

  var mayorQue = numeros.where((numero) => numero > 10).toList();

  print(mayorQue);
}