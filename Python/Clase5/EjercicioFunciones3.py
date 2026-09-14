# Clase 5 Ejercicio 3: crear funcion para sumar valores numericos pasados como *args
# mostrar como resultado la suma de todos los valores


def solicitarValores():
    print("\nIngrese valores númericos enteros (para terminar, ingresar \"salir\")")

    usr_values = []
    usr_num = ""

    while True:
        usr_num = input("Número: ")
        try:
            usr_values.append(int(usr_num))
        except ValueError:
            if usr_num == "salir":
                return usr_values
            else:
                print("No es número válido ni \"salir\", continuando...")


def sumarValores(*numeros):
    suma_total = 0
    for numero in numeros:
        suma_total += numero
    return suma_total

if __name__ == "__main__":
    print("\nLa suma final es:", sumarValores(*solicitarValores()))
    