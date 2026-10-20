class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f'Color: {self.color}, Ruedas: {self.ruedas}'


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f'{super().__str__()}, Velocidad: {self.velocidad} km/hr'


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f'{super().__str__()}, Tipo: {self.tipo}'


# ==========================================
# CREACIÓN DE OBJETOS Y PRUEBAS
# ==========================================

# 1. Objeto de la clase padre Vehiculo
vehiculo = Vehiculo('Gris', 4)
print('--- Vehículo ---')
print(vehiculo)

# 2. Objeto de la clase hija Auto
auto1 = Auto('Rojo', 4, 180)
print('\n--- Auto ---')
print(auto1)

# 3. Objeto de la clase hija Bicicleta
bici1 = Bicicleta('Azul', 2, 'Urbana')
print('\n--- Bicicleta ---')
print(bici1)