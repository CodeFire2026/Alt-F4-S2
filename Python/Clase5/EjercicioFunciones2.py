# Clase 5 Ejercicio 2: Agenda telefonica
# Simular una agenda de contactos. Crear un diccionario donde
# la clave sea el nombre y el valor el numero de telefono. Menu:
# 1. Nuevo contacto
# 2. Borrar contecto
# 3. Ver contactos existentes
# 4. Salir

def menu():
    while True:
        print("\n1. Nuevo contacto\n2. Borrar contacto\n3. Ver contactos existentes\n4. Salir\n")
        usr_option = input("Opcion: ")

        match usr_option:
            case "1":
                agregarContacto()
            case "2":
                borrarContacto()
            case "3":
                print("\n")
                mostrarContactos()
            case "4":
                print("Adios!")
                break
            case _:
                print("\nOpcion invalida")

def agregarContacto():
    contact_name = input("\nIngrese el nombre del nuevo contacto: ")

    if contact_name not in contactos:
        contactos[contact_name] = input("\nIngrese el numero: ")
        print("\nContacto agregado con exito")
    else:
        print("\nContacto ya existe!")

def borrarContacto():
    contact_name = input("\nIngrese el nombre del contacto a borrar: ")

    if contact_name in contactos:
        contactos.pop(contact_name, None)
        print("\nContacto borrado con exito")
    else:
        print("\nEse contacto no existe!")

def mostrarContactos():
    if contactos:
        for i, (key, value) in enumerate(contactos.items(), start=1):
            print(f"{i} - {key}: {value}")
    else:
        print("\nNo hay nadie agendado!")


if __name__ == "__main__":
    contactos = {}
    menu()