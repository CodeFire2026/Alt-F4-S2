# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no deben haber repetición)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

# Creamos las dos listas iniciales
lista1 = ["java", "python", "javascript", "c++", "python"]
lista2 = ["javascript", "c#", "ruby", "java"]

# Convertimos las listas a conjuntos para eliminar duplicados iniciales
# y poder aplicar las operaciones matemáticas de conjuntos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# 1 Lista de palabras que aparecen en las listas (Unión de conjuntos)
lista_todas = list(conjunto1 | conjunto2)

# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda (Diferencia)
lista_solo_en_1 = list(conjunto1 - conjunto2)

# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera (Diferencia)
lista_solo_en_2 = list(conjunto2 - conjunto1)

# 4 Lista de palabras que aparecen en ambas listas (Intersección)
lista_ambas = list(conjunto1 & conjunto2)

# Imprimimos los resultados
print(f"Lista 1 original: {lista1}")
print(f"Lista 2 original: {lista2}\n")

print(f"1. Todas las palabras (sin repetición): {lista_todas}")
print(f"2. Solo en la lista 1: {lista_solo_en_1}")
print(f"3. Solo en la lista 2: {lista_solo_en_2}")
print(f"4. En ambas listas: {lista_ambas}")