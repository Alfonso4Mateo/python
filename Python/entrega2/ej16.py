num_S = input("Introduce un numero entre el 0 y el 99999 \n")
num = int(num_S)
if num > 99999 or num < 0:
    print("idiota te he dicho del 0 al 99999")
else:
    cifras = len(num_S)
    print(f"El numero de cifras que tiene es de", cifras)
