# Ejercicio 3: Agregar personajes a una lista.
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos.
# Nombre: Aragon, Clase: Guerrero, Raza: Dúnadan del norte.
# Nombre: Gandalf, Clase: Mago, Raza: Istar.
# Nombre: Legolas, Clase: Arquero, Raza: Elfo Sindar.

# Se genera una lista vacía para los personajes.
personajes = []

# Se asigna cada personaje como un diccionario y lo agregamos a la lista.
personaje1 = {
    "Nombre": "Aragon",
    "Clase": "Guerrero",
    "Raza": "Dúnadan del norte"
}
personajes.append(personaje1)

personaje2 = {
    "Nombre": "Gandalf",
    "Clase": "Mago",
    "Raza": "Istar"
}
personajes.append(personaje2)

personaje3 = {
    "Nombre": "Legolas",
    "Clase": "Arquero",
    "Raza": "Elfo Sindar"
}
personajes.append(personaje3)

# Se muestra la lista con el resultado y el iterador.
print("Personajes agregados a la lista:")
for personaje in personajes:
    print(f"-> Nombre: {personaje['Nombre']}, Clase: {personaje['Clase']}, Raza: {personaje['Raza']}")