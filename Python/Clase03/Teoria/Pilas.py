# --- Pilas ---
#  (!) Pilas no son más que funciones aplicadas a listas. Utiliza el metodo LIFO (last in, first out)
pila = [1, 2, 3]

# --- Agregando elementos "encima" (al final) ---
pila.append(4)
pila.append(5)
print(pila)

# --- Sacamos elementos desde el final ---
pila.pop()
print(pila)

# asignamos el elemento borrado
elemento_popeado = pila.pop()
print("pila: ", pila)
print("elemento borrado: ", elemento_popeado)