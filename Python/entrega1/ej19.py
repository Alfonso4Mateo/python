num1 = int(input(" Introduzca un numero \n"))
num2 = int(input(" Introduzca otro numero \n"))

if num1 > num2:
    print("El numero", num1, "es el mayor")
elif num2 > num1:
    print("El numero", num2, "es el mayor")
else:
    print("Los numeros", num1, "y", num2, "son iguales")
