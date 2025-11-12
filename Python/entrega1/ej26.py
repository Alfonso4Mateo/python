# Dibuja un ordinograma que calcula el salario neto semanal
# de un trabajador en función del número de horas trabajadas
# y la tasa de impuestos de acuerdo a las siguientes hipótesis:
# Las primeras 35 horas se pagan a tarifa normal.
# Las horas que pasen de las 35 horas se pagan a 1,5 veces la tarifa normal.
# Las tasas de impuesto son:
# Los primeros 500€ son libres de impuestos.
# Los siguientes 400€ tiene un 25% de impuesto.
# Los restantes un 45% de impuesto.

horas = float(
    input("Introduce el numero de horas trabajadas en la semana: \n"))
tarifa = float(input("Introduce la tarifa por hora: \n"))
if horas <= 35:
    salario_bruto = horas * tarifa
else:
    salario_bruto = (35 * tarifa) + ((horas - 35) * tarifa * 1.5)

if salario_bruto <= 500:
    salario_neto = salario_bruto
elif salario_bruto <= 900:
    salario_neto = 500 + (salario_bruto - 500) * 0.75
else:
    salario_neto = 500 + 400 * 0.75 + (salario_bruto - 900) * 0.55
print(f"El salario neto es: {salario_neto}")
