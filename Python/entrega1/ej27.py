# Dibuja un ordinograma de un programa que lea una secuencia de notas
# (con valores que van de 0 a 10) que termina con el valor -1
# y nos dice si hubo o no alguna nota con valor 10.
nota = float(input("Introduce una nota (o -1 para terminar): \n"))
hay_nota_diez = False
while nota != -1:
    if nota == 10:
        hay_nota_diez = True
    nota = float(input("Introduce una nota (o -1 para terminar): \n"))
if hay_nota_diez:
    print("Hubo al menos una nota con valor 10.")
else:
    print("No hubo ninguna nota con valor 10.")
