# Dibuja un ordinograma de un programa que calcule
# y escriba la suma y el producto de los
# 10 primeros números naturales.

suma = 0
producto = 1
for i in range(1, 11):
    suma += i
    producto *= i
print(f"La suma de los 10 primeros numeros naturales es: {suma}")
print(f"El producto de los 10 primeros numeros naturales es: {producto}")
