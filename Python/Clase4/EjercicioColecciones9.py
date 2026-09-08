# Ejercicio 9: tabla de multiplicar, dado un numero por teclado, mostrar lista de su tabla hasta el 10


def generar_tabla(user_num):
    return [x * user_num for x in range(1,11)]


def imprimir_elementos_lista(lista):
    for elemento in lista:
        if elemento == lista[-1]:
            print(elemento)
        else:
            print(elemento, end=", ")

imprimir_elementos_lista(
    generar_tabla(
        int(input("Ingrese un número a generar su tabla: "))
    )
)