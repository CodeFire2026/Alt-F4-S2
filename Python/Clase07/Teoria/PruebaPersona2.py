from Persona2 import Persona2

# from Persona2 import * <- le pondriamos un asterisco en caso de que tuviera muchas clases y funciones

print("Creamos un objeto".center(50, "-")) # Video 10.6: probamos el metodo center() para cadenas

if __name__ == "__main__": # comprobacion de metodo principal
    persona1 = Persona2("Lionel", "Messi", 35)
    persona1.mostrar_detalles()

print("Eliminamos un objeto".center(50, "-"))
del persona1 # Video 10.6: no es comun, pero utilizamos el metodo delete aqui para comprobar nomas