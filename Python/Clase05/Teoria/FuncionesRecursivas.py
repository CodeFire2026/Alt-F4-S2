# --- Funciones recursivas ---
# la recursividad se da cuando una función se llama a sí misma, no importa cómo

def factorial(numero):
    if numero == 1:  # caso base
        return 1
    else:
        return numero * factorial(numero - 1)  # caso recursivo

print(f"Factorial de 5 es: {factorial(5)}")