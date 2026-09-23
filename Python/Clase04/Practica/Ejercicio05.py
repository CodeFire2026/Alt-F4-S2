# Ejercicio 5: llenar una lista (1-10) y multiplicar sus elementos por un valor ingresado por el usuario

listosa = list(range(1,11))
mult = int(input("Ingrese el multiplicador: "))

print("\nAntes:", listosa)

for i in range(len(listosa)):
    listosa[i] *= mult
    
print("Despues:", listosa)
