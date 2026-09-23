# Lista = Pepe, Fernan, Jose, Giorgio

nombres = ['Jose', 'Fernan', 'Giorgio', 'Pepe']

# --- Imprimir listas y pedir elementos especificos ---
print(nombres)          # imprimir la lista entera

print(nombres[0])       # si el indice ingresado es >=0, estamos accediendo a los elementos de izquierda a derecha (primero a ultimo)
print(nombres[1])
print(nombres[3])
print(nombres[-1])      # si es <0 será de derecha a izquierda (ultimo a primero)
print(nombres[-2])

print(nombres[0:2])     # recorre la lista y muestra los elementos desde el
                        # indice izquierdo (incluido) hasta el derecho (no incluido)

print(nombres[:3])      # si dejamos vacio el indice izquierdo, python interpreta "desde el inicio"
                        # si dejamos vacio el indice derecho, python interpreta "hasta el final"
                        # por ejemplo: print(nombres[:]) mostraria todos los elementos de la lista
                        #              desde el inicio hasta el final

print(nombres[1:])      # mostraria desde el elemento en el indice 1 en adelante

# --- Modificar elementos de la lista ---
nombres[2] = 'Santino'  # reemplazamos el elemento en el indice 2 por nuestro nuevo valor
nombres[0] = 'Moni'
print(nombres[2])

# --- Iterar una lista ---
for nombre in nombres:
    print(nombre)

# --- Obtener la cantidad de elementos ---
print(len(nombres))     # 'len' = 'length' (largo), devuelve un entero

# --- Agregar elementos ---
nombres.append('Marcelo')       # con append() se agregará el nuevo elemento pasado como argumento al final de la lista

nombres.insert(1, 'Cecilia')    # con insert() se requiere un indice además del nuevo elemento, y lo agregará en el indice especificado
nombres.insert(3, 'Laura')      # insertará 'Laura' en el indice 3, empujando todo lo demás a la derecha (hacia adelante)
print(nombres)

# --- Eliminar elementos ---
nombres.remove('Fernan')    # remueve el elemento especificado (no se le puede pasar un indice, solo elemento)
print(nombres)

nombres.pop()           # remueve el ultimo elemento de la lista (y tambien lo devuelve, asi que uno puede hacer 'ult_element = nombres.pop()' por ejemplo.)
print(nombres)

del nombres[2]          # 'del' = 'delete' (borrar), elimina el elemento especificado
print(nombres)

nombres.clear()         # borra todos los elementos de la lista
print(nombres)

del nombres             # borra la lista en si