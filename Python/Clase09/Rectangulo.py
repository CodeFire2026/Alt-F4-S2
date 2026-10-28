
# Creación de la clase Rectangulo.

#Clase Padre

class FiguraGeometrica:
    def __init__(self, alto, ancho):
        self._alto = alto
        self._ancho = ancho

    # getters y setters para alto
    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        self._alto = alto

    # getters y setters para ancho
    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        self._ancho = ancho

    def __str__(self):
        return f'FiguraGeometrica [Alto: {self._alto}, Ancho: {self._ancho}]'


class Color:
    def __init__(self, color):
        self._color = color

    # getter y setter para color
    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        self._color = color

    def __str__(self):
        return f'Color [Color: {self._color}]'


# Clases hijas , herencias múltiples

class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        # En un cuadrado el alto y el ancho son iguales al 'lado'
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def calcular_area(self):
        return self._alto * self._ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)} - ÁREA: {self.calcular_area()}'


class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def calcular_area(self):
        return self._alto * self._ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)} - ÁREA: {self.calcular_area()}'


# Prueba de ejecución de cuadrado, y de rectángulo.

if __name__ == '__main__':
    print('--- PRUEBA DE CUADRADO ---')
    cuadrado1 = Cuadrado(5, 'Rojo')
    print(cuadrado1)

    print('\n--- PRUEBA DE RECTÁNGULO ---')
    rectangulo1 = Rectangulo(3, 8, 'Azul')
    print(rectangulo1)