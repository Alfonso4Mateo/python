# Escriba un programa que recibe como datos de entrada
# una hora expresada en horas,minutos y segundos que
# nos calcula y escribe la hora, minutos y segundos que serán,
# transcurrido un segundo
horas = int(input("Introduce las horas (0-23): \n"))
minutos = int(input("Introduce los minutos (0-59): \n"))
segundos = int(input("Introduce los segundos (0-59): \n"))
segundos += 1
if segundos == 60:
    segundos = 0
    minutos += 1
if minutos == 60:
    minutos = 0
    horas += 1
if horas == 24:
    horas = 0
print(
    f"La hora un segundo después es {horas:02d}:{minutos:02d}:{segundos:02d}")
