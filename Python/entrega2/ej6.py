precio = float(input("Introduce el precio del articulo \n"))
precio_real = float(input("Introduce el precio de venta real \n"))
descuento = precio-precio_real
porcentaje = ((descuento/precio)*100)

print(f"\n El descuento realizado es del ", porcentaje, "%")
