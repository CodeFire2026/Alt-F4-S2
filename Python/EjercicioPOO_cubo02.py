# 9.6 Creamos la clase: Cubo
# EjercicioPOO_cubo02
"""
Crear una clase llamada cubo con los atributos, ancho, alto y profundida, con
un metodo calcular_volumen que tendra la formula:
volumen = ancho * altura * profundidad
que el usuario ingrese los valores...//
"""
class Cubo: # Creamos la clase Cubo...//
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

# Ingreso de datos...//
while True:
    ancho = float(input('Ingrese el ancho del cubo: '))
    alto = float(input('Ingrese el alto del cubo: '))
    profundidad = float(input('Ingrese la profundidad del cubo: '))

    if ancho == alto and alto == profundidad:
        break
    else:
        print('ERROR: Los tres lados del cubo deben ser iguales. Intente nuevamente.')

# Crear objeto Cubo...//
cubo = Cubo(ancho, alto, profundidad)

# Mostrar el volumen...//
print(f'El volumen del cubo es: {cubo.calcular_volumen()}')
