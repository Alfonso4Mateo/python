# Dibuja un ordinograma de un programa que lea 100 números no nulos
# y luego muestre un
# mensaje de si ha leído número negativo o no.

lista = 1
negativo = False
while lista <= 100:
    numero = int(input(f"Introduce el numero {lista}: "))
    if numero < 0:
        negativo = True
    lista += 1
if negativo:
    print("Se ha leido al menos un numero negativo")
else:
    print("No se ha leido ningun numero negativo")
