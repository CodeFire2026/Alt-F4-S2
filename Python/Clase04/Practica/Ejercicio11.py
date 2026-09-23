# Ejercicio 11: Menu interactivo - Cajero automatico, saldo inicial de $1000 con las siguientes opciones:
# 1. Ingresar dinero
# 2. Retirar dinero
# 3. Mostrar dinero disponible
# 4. Salir


def mostrarMenu():
    print("\nBienvenido al cajero automatico BruBank, seleccione una operación:" \
        "\n1. Ingresar dinero a su cuenta" \
        "\n2. Retirar dinero de su cuenta" \
        "\n3. Consultar saldo" \
        "\n4. Salir")

def realizarOperacion(usr_option):
    global exit
    if usr_option == 1:
        ingresarDinero()
    elif usr_option == 2:
        retirarDinero()
    elif usr_option == 3:
        mostrarSaldo()
    elif usr_option == 4:
        print("\nGracias por utilizar nuestros servicios. Hasta pronto!")
        exit = 1
    else:
        print("\nOpción inválida, vuelva a intentarlo.")

def ingresarDinero():
    global saldo
    while True:
        cant_ingreso = int(input("\nDigite la cantidad a ingresar: "))
        if cant_ingreso < 0:
            print("Por favor ingrese un número válido")
        elif cant_ingreso == 0:
            print("Operación cancelada, volviendo al menu...")
            break
        else:
            saldo += cant_ingreso
            print(f"Listo! Se añadió ${cant_ingreso} a su cuenta. Su saldo ahora es ${saldo}")
            break

def retirarDinero():
    global saldo
    while True:
        cant_retirar = int(input("\nIngrese la cantidad a retirar: "))
        if cant_retirar < 0:
            print("Por favor ingrese un número válido")
            continue
        elif cant_retirar == 0:
            print("Operación cancelada, volviendo al menu...")
            break
        elif cant_retirar > saldo:
            print("No puede retirar más de lo que tiene! Vuelva a intentarlo")
        else:
            saldo -= cant_retirar
            print(f"Se han retirado ${cant_retirar}. Saldo actual: ${saldo}")
            break

def mostrarSaldo():
    print(f"\nSu saldo es ${saldo}")


if __name__ == "__main__":
    exit = 0
    saldo = 1000
    while exit != 1:
        mostrarMenu()
        realizarOperacion(int(input("Opción: ")))