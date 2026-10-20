from Cuadrado import Cuadrado

cuadrado1 = Cuadrado (5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')


#MRO: Method Resolution Order: Sirve para darle un orden a la ejecución de los métodos.
# Sirve para ayudarnos a resolver conflictos cuando tenemos una gran sobrecarga de métodos.
print(Cuadrado.mro())
