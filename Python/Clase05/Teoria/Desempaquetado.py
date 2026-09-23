# --- Desempaquetado o unpacking de contenedores ---


def show(name, surname):  # partiendo de una funcion con dos o más parametros
    print(name, surname)


person1 = ["Shiza", "Zepelli"]
show(person1[0], person1[1])  # pasando manualmente
show(*person1)  # desempaquetando, pasando todo de una

person2 = ("Lisa", "Simpson")
show(*person2)  # lo mismo pero con una tupla

person3 = {"name": "Robin", "surname": "Da Banque"}  # ahora con diccionarios
show(**person3)  # en este caso hace falta dos asteriscos para indicar valores, no keys
