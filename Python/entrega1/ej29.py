# Dibuja un ordinograma de un programa donde el usuario “piensa”
# un número del 1 al 100 y el ordenador intenta adivinarlo.
# Es decir, el ordenador irá proponiendo números una y otra vez
# hasta adivinarlo (El usuario deberá indicarlo al ordenador
# si es mayor o menor o igual al número pensado)
print("Piensa un número del 1 al 100 y yo intentaré adivinarlo.")
bajo = 1
alto = 100
intento = None
while intento != "igual":
    adivinanza = (bajo + alto) // 2
    print(f"¿Es {adivinanza}?")
    intento = input("Responde 'mayor', 'menor' o 'igual': ").lower()
    if intento == "mayor":
        bajo = adivinanza + 1
    elif intento == "menor":
        alto = adivinanza - 1
print(f"¡He adivinado tu número! Es {adivinanza}.")
