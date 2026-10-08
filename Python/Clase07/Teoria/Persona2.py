class Persona2:
    def __init__(self, nombre, apellido, edad):
        # Los encapsulamos
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Persona: {self._nombre}, {self._apellido}, {self._edad}")

    @property  # decorador (permite acceder al metodo como si fuera un atributo, es decir de manera indirecta)
    def nombre(self):  # Getter
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Setter
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

    # Video 10.6: creamos el destructor
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__": # esta linea se agregó por el video 10.5 sobre comprobacion de modulo principal
    persona1 = Persona2("Samuel", "Rodriguez", 34)
    # print(persona1._nombre) <- recordar que esto NO se debe hacer
    print(persona1.nombre)  # llamamos al getter sin necesidad de poner los parentesis
    persona1.nombre = "Juan" # llamamos al setter
    print(persona1.nombre)
    persona1.mostrar_detalles()

    print(persona1.apellido)
    print(persona1.edad)

    # --- Video 10.2: atributo read-only ---
    # Aquí vimos como al sacarle (comentar) el metodo setter a edad, esta se transforma en read-only
    # es decir, que al intentar hacer:
    #   persona1.edad = 40
    # daria error