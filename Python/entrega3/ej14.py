# Crea una aplicación que dibuje una pirámide de asteriscos.
# Nosotros le pasamos la altura de la pirámide por teclado.
# Este es un ejemplo, si introducimos 5 de altura:

altura = int(input("Introduce la altura de la piramide: \n"))
for i in range(1, altura + 1):
    for j in range(i, altura):
        print(" ", end="")
    for k in range(1, (i*2)):
        print("*", end="")
    print()
