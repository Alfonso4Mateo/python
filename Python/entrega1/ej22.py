# Dibuja un ordinograma de un programa que lea 100 números no nulos
# y luego muestre un
# mensaje indicando cuántos son positivos y cuantos negativos.

negativo = 0
positivo = 0
lista = 1
while lista <= 100:
    numero = int(input(f"Introduce el numero {lista}: "))
    if numero < 0:
        negativo += 1
    else:
        positivo += 1
    lista += 1
print(
    f"Se han leido {positivo} numeros positivos y {negativo} numeros negativos")
