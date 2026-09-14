# Clase 5 Ejercicio 7: Convertidor de temperaturas
# Hacer dos funciones: convertir de fahrenheit a celsius y viceversa

def menu():
    while True:
        print("\nElige una operación\n1. °F -> °C\n2. °C -> °F\n3. Salir")
        opcion = input("\nOpción: ")
        match opcion:
            case "1":
                FtoC(solicitarTemp())
            case "2":
                CtoF(solicitarTemp())
            case "3":
                print("Adios!")
                break
            case _:
                print("\nOpcion invalida")

def solicitarTemp():
    return float(input("\nIngrese la temperatura: "))

def FtoC(temp):
    print(f"Original: {temp} °F\nConvertido: {(temp - 32) / 1.8} °C")

def CtoF(temp):
    print(f"Original: {temp} °C\nConvertido: {temp * 1.8 + 32} °F")


if __name__ == "__main__":
    menu()