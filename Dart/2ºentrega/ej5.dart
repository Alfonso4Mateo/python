//Ejercicio 5. Funciones flecha, map y fold
//Crea una lista con [4, 6, 8, 10]. Usa .map() 
//para obtener el doble de cada número y .fold() 
//para obtener la suma total. Imprime ambos resultados
void main() {
  List<int> lista = [4, 6, 8, 10];

  List<int> doble = lista.map((nums) => nums * 2).toList();

  int sumaTotal = lista.fold(0, (num1, num2) => num1 + num2);
  
  print("Números dobles: $doble");
  print("Suma total: $sumaTotal");
}