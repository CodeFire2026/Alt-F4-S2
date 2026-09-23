# --- Colas ---
# (!) No son más que funciones aplicadas a listas. Utiliza el metodo FIFO (first in, first out)

cola = ["primero", "segundo"]

# agregamos elementos al final
cola.append("tercero")
cola.append("cuarto")
print(cola)

# Sacamos el elemento al principio
cola.pop(0)
print(cola)