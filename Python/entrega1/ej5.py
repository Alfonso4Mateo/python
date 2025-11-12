import math
pi = math.pi
long_radio = float(input("Introduce la longitud del radio \n"))
diametro = long_radio/2

long_cir = pi*(diametro*2)
print(f"\n La longitud del circulo es = ", long_cir)
area_cir = pi*long_radio**2
print(f"\n El area del circulo es = ", area_cir)
volumen_esf = 4/3*pi*long_radio**3
print(f"\n El volumen de la esfera es =", volumen_esf)
