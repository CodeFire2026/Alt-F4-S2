class Persona:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"  Nombre completo: {self._nombre} {self._apellido}, edad: {self._edad}")

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad


# - Primera instancia -
persona1 = Persona("Jack", "Sparrow", 38)
print(
    f"\n- Primer persona -\n  Getters:\n"
    f"  Nombre: {persona1.nombre}, apellido: {persona1.apellido} y edad: {persona1.edad}"
)

print("\n  Setters y metodo:")
persona1.nombre = "Joaquin"
persona1.edad = 39
persona1.mostrar_detalles()

# - Segunda instancia -
persona2 = Persona("Miguel", "Yankee", 25)
print(
    f"\n- Segunda persona -\n  Getters:\n"
    f"  Nombre: {persona2.nombre}, apellido: {persona2.apellido} y edad: {persona2.edad}"
)

print("\n  Setters y metodo:")
persona2.nombre = "Micheal"
persona2.edad = 20
persona2.mostrar_detalles()

# - Tercera instancia -
persona3 = Persona("Foxtrot", "Delta", 50)
print(
    f"\n- Tercera persona -\n  Getters:\n"
    f"  Nombre: {persona3.nombre}, apellido: {persona3.apellido} y edad: {persona3.edad}"
)

print("\n  Setters y metodo:")
persona3.nombre = "Charlie"
persona3.edad = 60
persona3.mostrar_detalles()