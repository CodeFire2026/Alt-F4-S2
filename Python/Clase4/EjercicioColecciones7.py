# Ejercicio 7: Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares dentro de un rango, por ejemplo:
#               suma de numeros pares del 2 al 30
#               suma = 240

# pido el rango al usuario
inicio = int(input("Ingresa el numero inicial: "))
fin = int(input("Ingresa el numero final: "))

# ajusto inicio a par si es necesario
if inicio % 2 != 0:
    inicio += 1

suma = 0 # inicializo el acumulador
# recorrer todos los numeros del rango
for numero in range(inicio, fin + 1, 2): # +1 porque range no incluye el limite superior
    if numero % 2 == 0: # si es par, acumulamos sino pasamos
        suma += numero # acumulamos

print(f"La suma de los números pares entre {inicio} y {fin} es: {suma}")