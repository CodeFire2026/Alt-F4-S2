# --- Desempaquetado de parametros (iterables no dicc.) ---
# se puede pasar cualquier cantidad de argumentos a una función haciendo uso de asterisco al lado del nombre del parametro

def listarNombres(*args):  # para este caso (un solo *) se recomienda escribir el nombre "args". Aunque puede ir lo que uno quiera
    for nombre in args:
        print(nombre)

listarNombres("Ron", "Dave", "Uni", "Steve")