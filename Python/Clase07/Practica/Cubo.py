class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


while True:
    ancho = int(input("Ingrese el ancho: "))
    alto = int(input("Ingrese el alto: "))
    profundidad = int(input("Ingrese la profundidad: "))

    """ 
    Las dimensiones de un cubo deberian ser iguales,
    asi que por las dudas dejo esto acá

    if ancho != alto or ancho != profundidad:
        print("\nEso no seria un cubo! Intente de nuevo\n")
    """
    
    if ancho <= 0 or alto <= 0 or profundidad <= 0:
        print("\nLa longitud no puede ser negativa o nula! Intente de nuevo\n")
    else:
        break

cubo1 = Cubo(ancho, alto, profundidad)

print(f"\nVolumen del cubo: {cubo1.calcular_volumen()}")
