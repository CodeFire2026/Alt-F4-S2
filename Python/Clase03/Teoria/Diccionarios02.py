# Ampliando info sobre diccionarios

# se puede eliminar elementos usando del y la llave
diccionario1 = {"Azul": "Blue", "Red": "Rojo", "Yellow": "Amarillo"}
del diccionario1["Azul"]
print(diccionario1)

# pueden tener distintos tipos de datos dentro
diccionario2 = {
    "Juanito": {"Edad": 40, "Altura": 1.83},  # incluso otro diccionario
    "Geronimo": [28, 1.85],
    "Lucia": True,
}
