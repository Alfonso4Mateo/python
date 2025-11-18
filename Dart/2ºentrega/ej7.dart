//Ejercicio 7. Clase con getter y setter
//Crea una clase CuentaBancaria con un atributo privado _saldo, 
//getter saldo y setter saldo que impida valores negativos. 
//Comprueba su funcionamiento con varias asignaciones
void main() {
  CuentaBancaria cuenta = CuentaBancaria();

  cuenta.saldo = 1000; 
  print("Saldo actual: ${cuenta.saldo}");

  cuenta.saldo = -500; 
  print("Saldo actual después de intento negativo: ${cuenta.saldo}");

  cuenta.saldo = 2500; 
  print("Saldo actual: ${cuenta.saldo}");
}
class CuentaBancaria {
  double _saldo = 0.0;

  double get saldo => _saldo;

  set saldo(double valor) {
    if (valor >= 0) {
      _saldo = valor;
    } else {
      print("Error: No se puede asignar un saldo negativo.");
    }
  }
}