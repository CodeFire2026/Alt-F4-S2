from Cuadrado import Cuadrado
from Rectangulo import Rectangulo


print('Creación de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado (8, 'Azul')
cuadrado1.alto = -10
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')


#MRO: Method Resolution Order: Sirve para darle un orden a la ejecución de los métodos.
# Sirve para ayudarnos a resolver conflictos cuando tenemos una gran sobrecarga de métodos.
print(Cuadrado.mro())


print(cuadrado1)
print('Creación de objeto clase Rectángulo'.center(50, '_'))
rectangulo1 = Rectangulo(3, 9, 'verde')
rectangulo1.ancho = 15
print(f'Cálculo del área del rectángulo: {rectangulo1.calcular_area()}')
print(rectangulo1)


#figura1 = FiguraGeometrica() No se puede instanciar, es abstracta. 
print(Cuadrado.mro())

