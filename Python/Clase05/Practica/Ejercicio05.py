# Ejercicio 5: funcion recursiva
# Imprimir números de forma descendente utilizando recursividad. Ej: pasar 5 devuelve:
# 5
# 4
# 3
# 2
# 1

def mostrarNumsDescent(num):
    if num < 0:
        print("Numero invalido")
        return
    elif num == 0:
        return
    print(num)
    mostrarNumsDescent(num - 1)

if __name__ == "__main__":
    mostrarNumsDescent(int(input("Ingrese un número a mostrar de forma descendente: ")))