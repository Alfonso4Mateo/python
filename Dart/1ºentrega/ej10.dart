//Ejercicio 10. Agenda simple (Listas, Maps y bucles)
//Crea un pequeño programa que funcione como agenda de contactos. 
//Declara un Map> donde la clavesea el nombre de una persona y 
//el valor sea una lista con sus números de teléfono. 
//Añade al menos tres contactos con uno o más teléfonos. 
//Agrega un nuevo número a uno de los contactos existentes usando.add(). 
//Recorre el mapa con un bucle for-in anidado para mostrar cada nombre 
//y sus teléfonos
void main() {
 
  Map<String, List<String>> agenda = {
    "Alicia": ["123-456-7890", "098-765-4321"],
    "Pepe": ["555-555-5555"],
    "Carlos": ["111-222-3333", "444-555-6666"],
  };

  agenda["Alicia"]?.add("222-333-4444");
  for (var entry in agenda.entries) {
    String nombre = entry.key;
    List<String> telefonos = entry.value;
    print("Contacto: $nombre");
    for (var telefono in telefonos) {
      print(" - Teléfono: $telefono");
    }
  }
}