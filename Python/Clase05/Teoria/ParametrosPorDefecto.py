# --- Valores por default de los parametros ---

def suma(a = 0, b = 0):
    return a + b

print(suma())  # esto devolverá 0, en lugar de un error
print(suma(2, 2))  # esto devolverá la suma normal sin problemas

# extra: también se puede ser redundante en la definicion de una función:
def suma2(a:int = 0, b:int = 0) -> int:  # donde "a:int" quiere decir "a será un entero", y "-> int" quiere decir "la función retornará un entero"
    return a + b