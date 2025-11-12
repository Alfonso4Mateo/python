# Dibuja un ordinograma que lea una calificación numérica entre 0 y 10
# y la transforme en la calificación alfabética,
# escribiendo el siguiente resultado.
# De 0 a < 3 Muy Deficiente.
# De 3 a < 5 Insuficiente.
# De 5 a < 6 Suficiente.
# De 6 a < 7 Bien.
# De 7 a <9 Notable.
# De 9 a 10 Sobresaliente

nota = int(input("Introduce tu calificacion: \n"))
match nota:
    case nota if nota >= 0 and nota < 3:
        print(" Usted tiene una nota de Muy Deficiente")
    case nota if nota >= 3 and nota < 5:
        print(" Usted tiene una nota de Insuficiente")
    case nota if nota >= 5 and nota < 6:
        print(" Usted tiene una nota de Suficiente")
    case nota if nota >= 6 and nota < 7:
        print(" Usted tiene una nota de Bien")
    case nota if nota >= 7 and nota < 9:
        print(" Usted tiene una nota de Notable")
    case nota if nota >= 9 and nota < 10:
        print(" Usted tiene una nota de Sobresaliente")
    case _:
        print("Error")
