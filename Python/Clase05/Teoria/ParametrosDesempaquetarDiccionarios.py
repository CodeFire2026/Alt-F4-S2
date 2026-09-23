# --- Desempaquetado de parametros (diccionarios) ---
# lo mismo que el desempaquetado de iterables, pero este caso especificamente para diccionarios donde se usa doble asterisco

def listarTerminos(**kwargs):  # en este caso (doble *) se recomienda usar la palabra "kwargs", aunque puede ir lo que uno quiera
    for llave, valor in kwargs.items():
        print(f"{llave}: {valor}")

listarTerminos()  # de no pasarle nada, no pasa nada
listarTerminos(IDE="Int Dev Env", PK="Primary key")
listarTerminos(Diez="Leonel Messi")  # no se puede usar un entero porque la clave sigue las reglas de nombramiento de variables (no pueden empezar con numeros)
