//Ejercicio 11. Excepción personalizada
//Define la excepción SaldoInsuficienteException y una clase Pago con un
//método cobrar(cantidad). Si cantidad es mayor que el saldo disponible debe
//lanzar la excepción. Captúrala en main e imprime un mensaje adecuado.
void main() {
  Pago pago = Pago(50.0); // Saldo inicial de 50.0

  try {
    pago.cobrar(75.0); // Intentar cobrar 75.0
  } catch (e) {
    if (e is SaldoInsuficienteException) {
      print('Error: ${e.message}');
    } else {
      print('Error inesperado: ${e.toString()}');
    }
  }
}

class SaldoInsuficienteException implements Exception {
  final String message;
  SaldoInsuficienteException(this.message);
}

class Pago {
  double saldo;

  Pago(this.saldo);

  void cobrar(double cantidad) {
    if (cantidad > saldo) {
      throw SaldoInsuficienteException('Saldo insuficiente para cobrar $cantidad');
    }
    saldo -= cantidad;
  }
}