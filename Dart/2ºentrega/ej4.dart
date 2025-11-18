//Ejercicio 4. Función con parámetros nombrados
//Define una función registrarAlumno que reciba parámetros nombrados: nombre
//(obligatorio), curso (obligatorio) y edad 
//(opcional con valor por defecto 18). 
//La función debe imprimir los datos.
void registrarAlumno({required String nombre, required String curso, int edad = 18}) {
  print("Nombre: $nombre");
  print("Curso: $curso");
  print("Edad: $edad");
}
void main(){
  String nombre = "Ana";
  String curso = "Dart Avanzado";
  int edad = 20;
  registrarAlumno(nombre: nombre, curso: curso);
  registrarAlumno(nombre: "Luis", curso: "Flutter", edad: 22);
}