# Ejercicio 4: llenar una lista (1-50) y mostrarla con un for de la forma "1-2-3-..."

listasa = list(range(1,51))
for i in listasa:
    if i == listasa[-1]:
        print(i)
    else:
        print(i, end="-")