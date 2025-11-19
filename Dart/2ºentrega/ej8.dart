//Ejercicio 8. Future con async/await
//Crea una función cargarPerfil() que espere 2 segundos 
//y devuelva "Perfil cargado". Usa await en main para 
//mostrar el resultado tras imprimir "Cargando..."
void main() async {
  print('Cargando...');
  String resultado = await cargarPerfil();
  print(resultado);
}

Future<String> cargarPerfil() async {
  print("Cargando perfil...");
  await Future.delayed(Duration(seconds: 2));
  return("Perfil cargado correctamente.");
}