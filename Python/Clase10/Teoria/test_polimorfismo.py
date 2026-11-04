from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    # print(objeto)       # de manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto)) # esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())

    # print(objeto.departamento)  <- por si solo daria un error, porque empleado no tiene departamento
    if isinstance(objeto, Gerente):
        print(objeto.departamento) # ahora no va a dar error, porque nos aseguramos de que sea instancia de gerente primero


empleado = Empleado("Charlie", 30000)
imprimir_detalles(empleado)

gerente = Gerente("Natalia", 60000, "Sistemas")
imprimir_detalles(gerente)