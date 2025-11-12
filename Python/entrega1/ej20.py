N = int(input("Introduce un numero \n"))

facrorial = 1
contador = 1

while contador <= N:
    factorial = factorial*contador
    contador += 1

print(f"El factorial de {N} es: {factorial}")
