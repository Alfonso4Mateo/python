num1 = int(input(" Introduzca un numero \n"))
num2 = int(input(" Introduzca otro numero \n"))
num3 = int(input(" Introduzca otro numero \n"))

if num1 > num2 or num1 > num3:
    print("El numero", num1, "es el mayor")
elif num2 > num1 or num2 > num3:
    print("El numero", num2, "es el mayor")
elif num3 > num1 or num3 > num2:
    print("El numero", num3, "es el mayor")
else:
    print("Los numeros", num1, num2, "y", num3, "son iguales")
