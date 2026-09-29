class Persona:
    #Creamos una clase
    def __init__(self, nombre, apellido, edad):
        #Atributos de métodos, no de clase por que aún no hay atributos de clase.
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):  #Se conoce como método de instancia.
        print(f'Persona: {self.nombre}, {self.apellido}, {self.edad}')


# La variable self, se encuentra dentro de los métodos

persona1 = Persona('Cristian', 'Balmaceda',
                   '28')
persona2 = Persona('Osvaldo', 'Giordanini', '45')
print(f'El objeto2 de la clase persona es: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

#Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()
