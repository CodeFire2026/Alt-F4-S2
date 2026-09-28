class Persona: #Creamos una clase
    def __init__(self):

        #Método especial que en ingles se lo puede llamar como Init Dunder.

#El self significa "uno mismo", haciendo referenica al objeto que se va a crear.
        self.nombre = 'Juan'
        self.apellido = 'Zalazar'
        self.edad = 22
        #Estos no son atributos con clase. Por que estamos dentro de un método.
persona1 = Persona()


print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

#Las referencias por el Init, es totalmente indirecto.