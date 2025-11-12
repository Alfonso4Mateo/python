num1 = int(input(" Introduzca un numero \n"))
num2 = int(input(" Introduzca otro numero \n"))

suma = num1 + num2
resta = num1 - num2
multi = num1 * num2
if num2 != 0:
    divi = num1/num2
else:
    divi = "Error infefinida"
print(f"\n La suma de los dos digitos es = ", suma)
print(f"\n La resta de los dos digitos es = ", resta)
print(f"\n La multiplicacion de los dos digitos es = ", multi)
print(f"\n La division de los dos digitos es = ", divi)
