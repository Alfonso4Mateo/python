//Ejercicio 3. Map y actualización de valores
//Crea un Map<String, double> para almacenar productos 
//y sus precios. Añade tres productos, actualiza el precio de uno 
//y elimina otro. Muestra el resultado final.
void main() {
  Map<String, double> productos = {
    "monster": 1.5,
    "coca": 2.0,
    "fanta": 1.2,
  };

  productos["monster"] = 2.5;
  productos.remove("coca");

  print(productos);
}