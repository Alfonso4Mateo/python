cadena = str(input("Introduce una primera cadena \n"))
caracter = str(input("Dime el caracter que quieres contar \n"))
contador = 0

for i in cadena:
    if i == caracter:
        contador += 1
print(contador)
