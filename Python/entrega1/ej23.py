# Dibuja un ordinograma de un programa que lea una secuencia de números
# no nulos hasta que se introduzca un 0,
# y luego muestre si ha leído algún número negativo,
# cuantos positivos y cuantos negativos.

lista = 1
negativo = 0
positivo = 0
while True:
    numero = int(input(f"Introduce el numero {lista}: "))
    if numero == 0:
        break
    if numero < 0:
        negativo += 1
    else:
        positivo += 1
    lista += 1
print(
    f"Se han leido {positivo} numeros positivos y {negativo} numeros negativos")
if negativo > 0:
    print("Se ha leido al menos un numero negativo")
