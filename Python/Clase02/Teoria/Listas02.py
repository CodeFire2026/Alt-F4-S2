# --- Ampliando info sobre listas ---

# las listas pueden almacenar distintos tipos de datos
lista = []
lista.append('hello world')
lista.append(19)
lista.append(True)
lista.append([1, 2, 'wow!'])    # inclusive otra lista
lista.append(True)
lista.append(10.45)
print(lista)

# las listas pueden ser concatenadas
lista_1 = [1, 2, 3]
lista_2 = [4, 5, 6]
lista_3 = lista_1 + lista_2
print(lista_3)

# se le puede agregar más de un elemento a la lista a la vez
lista_3.extend([7, 8, 9, 4])
print(lista_3)

# se puede saber en qué indice está un elemento especifico
print(lista.index('hello world'))   # si el elemento no existe, dará error
print(lista.index(True))    # en caso de haber un elemento duplicado, se mostrará el index la primera aparición de dicho elemento
print(lista_3.index(4))

# se puede contar cuántas veces aparece un elemento
print(lista.count(True))
print(lista_3.count(7))

# se puede invertir el orden de una lista
lista_3.reverse()
print(lista_3)

# es posible hacer que una lista se repita "multiplicandola"
lista_1 = lista_1 * 2
print(lista_1)

# se puede ordenar la lista de forma ascendente y descendente
lista_3.sort()              # asc
print(lista_3)
lista_3.sort(reverse=True)  # des
print(lista_3)