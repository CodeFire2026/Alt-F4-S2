class Persona:
    #Creamos una clase
    def __init__(self, nombre, apellido, edad):
        #Atributos de métodos, no de clase por que aún no hay atributos de clase.
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad


persona1 = Persona('Cristian', 'Balmaceda',
                   '28')  #Necesitamos enviar argumentos, por eso no debe estar vacío dentro del parentesis.

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
