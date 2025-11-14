//Ejercicio 1. Creación y manipulación de listas
//Crea una lista de enteros con los valores del 1 al 5. 
//Añade los números 6 y 7.
//Elimina el número 3. Muestra la lista final.
void main() {
  List<int> lista = [1, 2, 3, 4, 5];

  lista.add(6);
  lista.add(7);
  lista.addAll([8,9,10]);
  lista.remove(3);

  print(lista);
}