# Ejercicio 4: dada la siguiente tupla (13, 1, 8, 3, 2, 5, 8)
# crear una lista que solo incluya los numeros menores a 5, imprimir la lista

tupla = (13, 1, 8, 3, 2, 5, 8)
lista = []

for num in tupla:
    if num < 5:
        lista.append(num)


print(lista)