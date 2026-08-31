# Ingresar elementos al diccionario llamado seleccionArgentina, los elementos a ingresar 
# deben ser como mínimo 4, estos elementos son los jugadores con su número de camiseta, nombre,
# apellido, edad, altura, precio y posición de juego.

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 39, 'Altura': 1.70, 'Precio': '11.5 Millones', 'Posicion': 'Mediapunta'},
    23: {'Nombre': 'Emiliano Martínez', 'Edad': 33, 'Altura': 1.95, 'Precio': '16.8 Millones', 'Posicion': 'Arquero'},
    4: {'Nombre': 'Gonzalo Montiel', 'Edad': 29, 'Altura': 1.75, 'Precio': '2.7 Millones', 'Posicion': 'Lateral Derecho'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 28, 'Altura': 1.85, 'Precio': '46.7 Millones', 'Posicion': 'Defensor Central'},
    6: {'Nombre': 'Lisandro Martínez', 'Edad': 28, 'Altura': 1.75, 'Precio': '33.1 Millones', 'Posicion': 'Defensor Central'},
    3: {'Nombre': 'Nicolás Tagliafico', 'Edad': 34, 'Altura': 1.72, 'Precio': '2.3 Millones', 'Posicion': 'Lateral Izquierdo'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 32, 'Altura': 1.78, 'Precio': '9.1 Millones', 'Posicion': 'Mediocampista'},
    24: {'Nombre': 'Enzo Fernández', 'Edad': 25, 'Altura': 1.78, 'Precio': '92.6 Millones', 'Posicion': 'Mediocampista'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 27, 'Altura': 1.76, 'Precio': '76.4 Millones', 'Posicion': 'Mediocampista'},
    15: {'Nombre': 'Nicolás González', 'Edad': 28, 'Altura': 1.80, 'Precio': '18.1 Millones', 'Posicion': 'Extremo Izquierdo'},
    9: {'Nombre': 'Julián Álvarez', 'Edad': 26, 'Altura': 1.70, 'Precio': '93.4 Millones', 'Posicion': 'Delantero Centro'}
}


for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))