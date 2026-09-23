# --- Definiendo diccionarios ---
# Tienen elementos de tipo "LLAVE - VALOR"
# NO pueden haber llaves duplicadas

diccionario = {
    'IDE' : 'Integrated Development Environment',
    'POO' : 'Programación orientada a objetos',
    'SABD' : 'Sistema de administracion de base de datos'
}

print(diccionario)

# --- Accediendo a elementos ---
# Podemos hacerlo usando la llave
print(len(diccionario))

print(diccionario['IDE'])       # devuelve el valor de la llave IDE, case sensitive la key debe ser identica
print(diccionario.get('POO'))   # lo mismo distinta forma

# --- Modificando elementos ---
diccionario['IDE'] = 'Entorno de desarrollo integrado'
print(diccionario)

# --- Iterando diccionarios ---
for llave in diccionario:       # si solo usamos 1 variable de iteracion, estaremos iterando solo las llaves
    print(llave)

for llave, valor in diccionario.items():    # si usamos 2 variables, tenemos que usar items() para iterar cada llave y su valor
    print(llave, valor)

for llave in diccionario.keys():    # forma alternativa  # noqa: SIM118
    print(llave)

for valor in diccionario.values():  # especificamente los valores
    print(valor)

print('IDE' in diccionario)     # verificar si existe un elemento dentro del diccionario (se puede usar values() para verificar valores en vez de llaves)

# --- Agregando elementos ---
diccionario['PK'] = 'Llave primaria'
print(diccionario)

# --- Eliminar elementos ---
diccionario.pop('SABD')     # parecido a una lista, pero requiere una llave
print(diccionario)

diccionario.clear()
print(diccionario)

del diccionario