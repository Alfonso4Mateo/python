# Dibuja un ordinograma de un programa que suma independientemente
# los pares y los impares de los números comprendidos
# entre 100 y 200, y luego muestre por pantalla ambas sumas.
suma_pares = 0
suma_impares = 0
for numero in range(100, 201):
    if numero % 2 == 0:
        suma_pares += numero
    else:
        suma_impares += numero
print("Suma de números pares:", suma_pares)
print("Suma de números impares:", suma_impares)
