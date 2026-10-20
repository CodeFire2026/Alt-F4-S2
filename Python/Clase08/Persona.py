#Tarea: encapsular los atributos y agregar los métodos getters and setters
#Crear otro objeto, pasar los datos para nombre, edad, sueldo.
#Mostrar estos datos, luego modificar y mostrar nuevamente
from typing import NoReturn


class Persona:
    def __init__(self, nombre,edad):
        self.nombre = nombre
        self.edad = edad

        #Se encapsuló los atributos y se uso método getters a setters.

        # Getter para nombre
        @property
        def nombre(self):
            return self._nombre

        # Setter para nombre
        @nombre.setter
        def nombre(self, nombre):
            self._nombre = nombre

        # Getter para edad
        @property
        def edad(self):
            return self._edad

        # Setter para edad
        @edad.setter
        def edad(self, edad):
            self._edad = edad

    def __str__(self):#Override = sobreescribir los atributos
            return f'Persona: [ Nombre: {self.nombre}, Edad: {self.edad}]'


class Empleado(Persona):#Esta clase es hija de la clase persona.
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

        # Getter para sueldo
        @property
        def sueldo(self):
            return self._sueldo

        # Setter para sueldo
        @sueldo.setter
        def sueldo(self, sueldo):
            self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [Sueldo: {self.sueldo}] {super().__str__()}'

empleado1 = Empleado('Ariel',40,75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)



#Se crea un objeto pasando los datos para nombre, edad y sueldo
empleado2 = Empleado('Cristian', 28, 85000)

# Se muestran los datos
print("--- Datos iniciales del empleado 2 ---")
print(f"Nombre: {empleado2.nombre}")
print(f"Edad: {empleado2.edad}")
print(f"Sueldo: ${empleado2.sueldo}")

# 3. Modificar los datos mediante los setters
empleado2.nombre = 'José Alberto'
empleado2.edad = 65
empleado2.sueldo = 95000

# 4. Mostrar nuevamente los datos modificados
print("\n--- Datos modificados del empleado 2 ---")
print(f"Nombre: {empleado2.nombre}")
print(f"Edad: {empleado2.edad}")
print(f"Sueldo: ${empleado2.sueldo}")




