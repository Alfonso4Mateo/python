ancho = int(input("Introduce el ancho maximo del romboide: \n"))


def linea(i):
    derecho = ancho - 1
    izquierdo = ancho - i
    linea = ""
    for j in range(ancho):
        if j == izquierdo:
            linea += "*"
        elif j == derecho:
            linea += "*"
        else:
            linea += " "
    return linea


for i in range(1, ancho + 1):
    print(linea(i))

for i in range(ancho - 1, 0, -1):
    print(linea(i))
