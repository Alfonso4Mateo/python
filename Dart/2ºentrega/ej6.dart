//Ejercicio 6. Closure (función que recuerda estado)
//Crea una función contador() que devuelva una función interna. 
//Cada invocación debe aumentar un valor interno y mostrarlo. 
//Llámalo tres veces para demostrar su funcionamiento.
void main() {
  Function contador = crearContador();

  contador(); 
  contador(); 
  contador(); 
}
Function crearContador() {
  int cuenta = 0;

  return () {
    cuenta++;
    print(cuenta);
  };
}