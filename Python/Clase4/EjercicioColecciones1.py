# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

# Hice la variable y una lista con elementos repetidos
mi_lista = [1, 2, 3, 2, 4, 5, 1, 6, 3, "hola", "hola"]

# Converti la lista a un conjunto (set) para eliminar los duplicados 
# y despues la convierte de nuevo a lista sin los números que se repiten.
lista_sin_duplicados = list(set(mi_lista))

# Ahora se pasan a ver los resultados
print("Lista original:", mi_lista)
print("Lista sin duplicados:", lista_sin_duplicados)