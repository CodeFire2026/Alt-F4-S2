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

#Tarea: Hacer el print igual que con el objeto2.

print(f'El objeto1 de la clase persona es: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona('Osvaldo','Giordanini','45')
print(f'El objeto2 de la clase persona es: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')