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
