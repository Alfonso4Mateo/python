saldo = 1000
while (True):
    print("""Bienvenido a su Cajero Virtual
    ¿Qué quieres hacer? Escribe el numero de la accion que desees realizar                     
    1. Ingresar dinero en cuenta
    2. Retirar dinero de la cuenta
    3. Salir\n""")

    opcion = input()
    if opcion == '1':
        ingresar = int(input("Introduce cuanto quiere ingresar\n"))
        saldo = ingresar+saldo
        print(f"Saldo actualizado, ahora tienes ", saldo, "\n")
    elif opcion == '2':
        retirar = int(input("Introduce cuanto quiere retirar\n"))
        saldo = retirar-saldo
        print(f"Saldo actualizado, ahora tienes ", saldo, "\n")
    elif opcion == "3":
        print("¡Hasta luego! Ha sido un placer ayudarte, nos vemos pronto")
        break
    else:
        print("Comando desconocido, vuelve a intentarlo")
