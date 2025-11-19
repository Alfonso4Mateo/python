
"""
altura = int(input("Introduce la altura del diamante"))
e = 1
for i in range(1, altura+1):
    if i == 1:
        print(" "*(altura-1), end="")
        print("*")
    else:
        print(" "*(altura-i), end="*")
        print(" "*(e), end="*")
        e += 2
    print()
for i in range(1, altura):
    print(" "*(i), end="*")
    print(" "*(e), end="*")
    e -= 2
    print()
"""

a = 5
print(" "*a+"*")
for i in range(a-2):
    print(" "*(a-1-i) + "*" + " "*(2*i+1)+"*")
for i in range(a-2, -1, -1):
    print(" "*(a-1-i) + "*" + " "*(2*i+1)+"*")
print(" "*a+"*")
