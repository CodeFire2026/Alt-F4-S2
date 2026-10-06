# 9.5 Creamos la clase: Rectángulo
# EjercicioPOO_rectangulo01
"""
Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
el nombre del metodo sera calcular area utilizando la formula:
area = base * altura. Pero la base y la altura deben ser ingresadas por
el usuario y los objetos deben ser tres...//
"""
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

# Ingreso de Datos para el Objeto1...//
while True:
    base1 = float(input('Ingrese la base del rectangulo 1: '))
    altura1 = float(input('Ingrese la altura del rectangulo 1: '))

    if base1 != altura1:
        break
    else:
        print('ERROR: La base y la altura no pueden ser iguales.')
        print('Si son iguales, la figura es un cuadrado.')

# Crear Rectangulo1...//
rectangulo1 = Rectangulo(base1, altura1)

# Ingreso de Datos para el Objeto2...//
while True:
    base2 = float(input('Ingrese la base del rectangulo 2: '))
    altura2 = float(input('Ingrese la altura del rectangulo 2: '))

    if base2 != altura2:
        break
    else:
        print('ERROR: La base y la altura no pueden ser iguales.')
        print('Si son iguales, la figura es un cuadrado.')

# Crear Rectangulo2...//
rectangulo2 = Rectangulo(base2, altura2)

# Ingreso de Datos para el Objeto3...//
while True:
    base3 = float(input('Ingrese la base del rectangulo 3: '))
    altura3 = float(input('Ingrese la altura del rectangulo 3: '))

    if base3 != altura3:
        break
    else:
        print('ERROR: La base y la altura no pueden ser iguales.')
        print('Si son iguales, la figura es un cuadrado.')

# Crear Rectangulo3...//
rectangulo3 = Rectangulo(base3, altura3)

# Mostrar las areas de los tres rectangulos...//
print(f'Area del rectangulo 1: {rectangulo1.calcular_area()}')
print(f'Area del rectangulo 2: {rectangulo2.calcular_area()}')
print(f'Area del rectangulo 3: {rectangulo3.calcular_area()}')
