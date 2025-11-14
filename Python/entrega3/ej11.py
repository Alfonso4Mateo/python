# Crea una aplicación que dibuje una escalera de asteriscos.
# Nosotros le pasamos la altura de la escalera por teclado.
# Este es un ejemplo si insertaras un 5 de altura
try:
    altura = int(input("Introduce la altura de la escalera: \n"))
    if altura <= 0:
        raise ValueError
except ValueError:
    print("Por favor, introduce un número entero válido.")
else:
    print("\nforma1")
    for i in range(1, altura + 1):
        for j in range(1, i + 1):
            print(" ", end="")
        print("*" * i)

    print("\nforma2")
    asteriscos = "*"
    for i in range(1, altura+1):
        print(asteriscos)
        asteriscos = asteriscos + "*"

    print("\nforma3")
    for i in range(1, altura + 1):
        print("*" * i)
