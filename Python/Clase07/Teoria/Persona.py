# Clase 6: POO parte 1...//
# 8.1 Creación de una clase
class Persona: # Creamos una clase...//
    # def __init__(self):  # Se llama Metodo Init Dunder...//
    #   self.nombre = 'Maxi'
    #   self.apellido = 'Rojas'
    #   self.edad = 39
    def __init__(self, nombre, apellido, edad): # 8.3 Creación de objetos con argumentos...//
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self): # 8.8 Métodos de instancia: Definimos un método...//
        print(f'Persona: {self.nombre} {self.apellido} su edad es {self.edad} años') # 8.8
# Self seria igual a this....///


# la referencia en init es indirecta...//
persona1 = Persona('Maxi', 'Rojas', 39) # constructor que apunta directamente
# al metodo(es automatico) lo hace a traves del metodo self e init...// 8.3
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

# 8.2 Atributos en métodos y creación de un objeto
# METODO INIT INICIALIZADO ES SIMILAR AL CONSTRUTOR, EN PYTHON EL CONSTRUCTOR ESTA OCULTO
# Y SE LLAMA POR EL LENGUAJE DE PYTHON...//
# NO ES MUY COMUN ASIGNAR VALORES POR DEFAULT A LOS ATRIBUTOS, MAS ADELANTE LO
# HAREMOS CON PARAMETROS...//

# 8.3 Creación de objetos con argumentos...//
#def __init__(self, nombre, apellido, edad):  # Se agregan las variables//
#  self.nombre(atributos) = nombre(variables) De Metodo NO de clase...
#  self.apellido = apellido
#  self.edad = edad

# 8.4 Creamos más objetos en una clase
persona2 = Persona('Lucas', 'Garcia', 38)
print(f'El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido} '
      f'Su edad es: {persona2.edad} años')
# Tarea: hacerlo con el objeto1
persona1 = Persona('Maxi', 'Rojas', 39)
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} '
      f'Su edad es: {persona1.edad} años')

# 8.5 Referencias de memoria de objetos con el Debug...//
# Todo apunta al mismo espacio de memoria, nada cambia, observado por el modo debug...//

# 8.6 Modificar atributos de un objeto...//
# Se pueden modificar...//
persona2.nombre = 'Liliana'
persona2.apellido = 'Luciani'
persona2.edad = 40
print(f'El objeto 2 modificado de la clase persona: {persona2.nombre} {persona2.apellido} '
      f'Su edad es: {persona2.edad} años')

# 8.7 Métodos de instancia. crear UML...//
# los Atributos: Son caracteristicas.
# Los Metodos: son el comportamiento que van a tener los objetos(acciones)...//
# Instalacion de extension uml en VScode y sino tambien se busca web UMLetino...//
# Se crean diagramas con ello, en VScode crear en carpeta de py diagrama .uxf...//

# 8.8 Métodos de instancia: Definimos un método...//
persona1.mostrar_detalle() # la referencia se pasa de forma automatica...//
persona2.mostrar_detalle()

# Clase 7: POO parte 2,c/tarea...//
# 9.1 Palabra reservada self y atributos de instancia...//

# Persona.mostrar_detalle(persona1) Debemos pasarle una referencia para elñ self o da error

# 9.2 Crear atributos desde un objeto...//
persona2.telefono = '2622458458'
print(f'Este es el telefono de: {persona2.nombre} {persona2.telefono}') # Hemos creado el atributo de un objerto...//

# print(persona1.telefono) el objeto persona1 no tiene este atributo, da error...//






