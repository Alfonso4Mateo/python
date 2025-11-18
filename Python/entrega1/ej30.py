# Dibuja un ordinograma de un programa que dada una cantidad de euros
# que el usuario introduce por teclado (múltiplo de 5 €)
# mostrará los billetes de cada tipo que serán necesarios para
# alcanzar dicha cantidad (utilizando billetes de
# 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
# billetes posible. Por ejemplo, si el usuario introduce 145
# el programa indicará que será necesario 1 billete de 100 €,
# 2 billetes de 20 € y 1 billete de 5 € (no será válido por
# ejemplo 29 billetes de 5, que aunque sume 145 €
# no es el mínimo número de billetes posible).
cantidad = int(input("Introduce una cantidad de euros (múltiplo de 5 €): \n"))
billetes = [500, 200, 100, 50, 20, 10, 5]
resultado = {}
for billete in billetes:
    if cantidad >= billete:
        num_billetes = cantidad // billete
        resultado[billete] = num_billetes
        cantidad -= num_billetes * billete
for billete, num_billetes in resultado.items():
    print(f"{num_billetes} billete(s) de {billete} €")
