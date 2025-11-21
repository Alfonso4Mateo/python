altura = int(input("Introduce la altura que desees: "))
print(" "*altura+"*")
for i in range(altura-2):
    print(" "*(altura-1-i) + "*" + "*"*(2*i+1)+"*")
for i in range(altura-2, -1, -1):
    print(" "*(altura-1-i) + "*" + "*"*(2*i+1)+"*")
print(" "*altura+"*")
