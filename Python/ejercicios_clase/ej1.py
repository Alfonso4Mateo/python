altura = int(input("Introduce la altura del triangulo: \n"))
for i in range(1, altura + 1):
    for j in range(1, i + 1):
        if j == 1 or j == i or i == altura:
            print(" 4", end="")
        else:
            print("  ", end="")
    print()
