# --- Definiendo tuplas ---
cocina = ('cuchara', 'cuchillo', 'tenedor')     # las tuplas se definen con comas, y se usan parentesis para hacer más prolija la sintaxis (excepto a la hora de pasarlos como argumentos, ahí necesitan parentesis sí o sí)
cocina_dos = 'espatula',                        # por ejemplo, esto también es una tupla, en este caso de 1 elemento
print(cocina)

# --- Acceder a elementos ---
# practicamente igual a las listas

print(len(cocina))

print(cocina[0])
print(cocina[-1])

print(cocina[0:1])  # no olvidar que el extremo derecho es abierto

# --- Iterar una tupla ---
for utensilio in cocina:
    print(utensilio)

# --- Modificar una tupla ---
# NOTA: NO se debe modificar una tupla, esto es solamente para demostrar que es posible
cocina_lista = list(cocina)
cocina_lista[0] = 'Plato'
cocina = tuple(cocina_lista)
print(cocina)

# --- Borrar una tupla ---
del cocina