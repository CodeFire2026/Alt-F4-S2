#Clase padre 1

from abc import ABC, abstractmethod
#ABC significa: Abstract Base Class, convierte una clase en abstracta.

class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self.ancho = 0
            print(f'Valor erroneo paara el ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'Valor erroneo para el alto: {alto}')

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'valor erroneo ancho: {ancho}')

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'valor erroneo alto: {alto}')

    @abstractmethod
    def calcular_area(self):
        pass
#Se utiliza para calcular el area de manera abstracta.
    def __str__(self):
        return f'FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]'



    def _validar_valores(self, valor): #Método encapsulado
        return True if 0 < valor < 10 else False


#Se agrego a estos archivos de la clase 08 lo siguiente:
#La validacion de atributos.
#Metodo encapsulado y setter en clase padre.
# Y se vio la explicaión de validaciones setter.