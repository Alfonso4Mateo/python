//Ejercicio 12. Proyecto final de tareas
//Crea un programa con una lista de tareas (List<String>). 
//Implementa una función asíncrona procesarTarea(tarea) 
//que tarde 1 segundo y muestre "Tareacompletada: {tarea}".
// Implementa eliminarTarea(index) que lance una excepción 
//si la posición no existe. Procesa todas las tareas en main usando
//await, elimina una válida y otra inválida y 
//maneja la excepción resultante.
void main() async {
  List<String> tareas = [
    'Comprar comestibles',
    'Lavar el coche',
    'Pagar facturas',
    'Estudiar Dart',
    'Hacer ejercicio'
  ];

  // Procesar todas las tareas
  for (String tarea in tareas) {
    await procesarTarea(tarea);
  }

  // Eliminar una tarea válida
  try {
    eliminarTarea(tareas, 2); // Eliminar "Pagar facturas"
    print('Tarea eliminada correctamente.');
  } catch (e) {
    print('Error: ${e.toString()}');
  }

  // Intentar eliminar una tarea inválida
  try {
    eliminarTarea(tareas, 10); // Índice inválido
  } catch (e) {
    print('Error: ${e.toString()}');
  }
}

Future<void> procesarTarea(String tarea) async {
  await Future.delayed(Duration(seconds: 1));
  print('Tarea completada: $tarea');
}

void eliminarTarea(List<String> tareas, int index) {
  if (index < 0 || index >= tareas.length) {
    throw Exception('Índice fuera de rango');
  }
  tareas.removeAt(index);
}