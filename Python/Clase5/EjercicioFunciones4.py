# Clase 5 Ejercicio 4: crear funcion para multiplicar valores numericos pasados como *args
# mostrar como resultado el producto de todos los valores


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


def multiplicarValores(*numeros):
    mult_total = 1
    for numero in numeros:
        mult_total *= numero
    return mult_total

if __name__ == "__main__":
    print("\nLa suma final es:", multiplicarValores(*solicitarValores()))
    