# --- Listas por comprensión ---
# es posible crear listas en una sola linea usando un iterable y una condicion

lista_nombres = ["Peter", "Bruce", "Reggie", "Bob"]
lista_nombres_con_b = [nombre for nombre in lista_nombres if nombre[0] == "B"]  # solo los nombres que empiezan con B
print(lista_nombres_con_b)

cervezas = [
    {"name": "Quilmes", "origin": "Argentina"},
    {"name": "Corona", "origin": "Mexico"},
    {"name": "Andes", "origin": "Argentina"},
    {"name": "Stella Artois", "origin": "Belgium"},
]

cervezas_argentinas = [marca for marca in cervezas if marca["origin"] == "Argentina"]
print(cervezas_argentinas)