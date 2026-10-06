class Persona:
    def __init__(self, nombre, apellido, edad, dni, *args, **kwargs):  # Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self._dni = dni
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(
            f"Persona: {self.nombre}, {self.apellido}, {self.edad}, {self._dni}\n"
            f"la dirección es {self.args}, \nlos datos importantes son {self.kwargs}"
        )


persona1 = Persona("Cristian", "Balmaceda", "28", "23257835")
persona2 = Persona("Osvaldo", "Giordanini", "45", "33775889")

persona1.mostrar_detalle()
persona2.mostrar_detalle()

# --- Video 9.1: self ---
# en "def __init__(self, ...)" el "self" se puede cambiar por otra palabra, pero se recomienda dejarla así
# Persona.mostrar_detalle() <- debemos pasarle una referencia (es decir persona1) para el self o dará error
# con persona1.mostrar_datalle() no pasa lo mismo porque se pasa la referencia de forma automatica con el punto

# --- Video 9.2: agregar atributos fuera del inicializador ---
persona1.telefono = "445542234"
print(f"El telefono de {persona1.nombre} es: {persona1.telefono}")
# print(persona2.telefono) <- daria error porque no se le agregó el atributo telefono

""" 
--- Video 9.7: init dunder y argumentos variables ---

Aquí cambiamos:
    def __init__(self, nombre, apellido, edad):
        self... = ...

y lo dejamos asi:
    def __init__(self, nombre, apellido, edad, *args, **kwargs):
        self ... = ...
        self.args = args
        self.kwargs = kwargs

Y reflejamos los cambios en mostrar_detalle() agregando esos nuevos atributos al print.
Luego usamos un nuevo objeto para probar las adiciones
"""
persona3 = Persona("Rogelio", "Romero", 22, 40396123,
                   "Telefono", "23349583",
                   "Calle Lopez", 823,
                   "Manzana", 77,
                   "Casa", 18,
                   Altura=1.83,
                   Peso=105,
                   CFavorito="Azul",
                   Auto="Citroen",
                   Modelo=2021)

persona3.mostrar_detalle()

""" 
--- Video 9.8: Encapsulamiento parte 1 ---

Acá agregamos un _ al nombre de un atributo para hacerlo privado
hicimos esto dentro de la clase, y luego todas las instancias y prints deben ser actualizados
ejemplo: 
    def __init__(self, nombre, dni):
        ...
        self._dni = dni <- aquí ponemos el _
    
    def mostrar_detalle(self):
        print(f"bla {self._dni}") <- aquí tambien debe ir el guion bajo
    
    persona1 = Persona("bla", 23598677) <- y en el instanciado y el print agregamos el nuevo atributo requerido
    print(persona1.???) <- pycharm no va a sugerir el dni
"""
print(persona3._dni) # hacer esto esta MAL (aunque se pueda hacer),
                    # no se debe hacer porque está encapsulado y solo va a demostrar que carecemos de experiencia en python

""" 
--- Video 9.9: Encapsulamiento parte 2 ---

Aquí vimos como SÍ encapsular por completo un atributo, haciendolo inmodificable
Para esto agregamos dos guiones bajo al atributo __
Ejemplo:

class Persona:
    def __init__(self, nombre, ...):
            self.__nombre = nombre
            ...

    def mostrar_detalle(self):
            print(f"Persona: {self.__nombre}, ...")
            
    persona1 = Persona("Juan", ...)
    print(persona1.__nombre) <- esto va a tirar error
    print(persona1.mostrar_detalle()) <- en cambio aca no da error, ya que se puede acceder al atributo a traves de un metodo de la clase
"""