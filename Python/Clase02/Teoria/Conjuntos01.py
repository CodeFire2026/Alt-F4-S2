# --- Definiendo un set ---
# Recordar que no tiene orden ni indices

planetas = {'Marte', 'Jupiter', 'Venus'}
print(planetas)     # se mostrarán en orden aleatorio

# --- Accediendo a elementos ---
print(len(planetas))
print('Marte' in planetas)      # es case sensitive, debe ser identico

# --- Agregar elementos ---
planetas.add('Tierra')
planetas.add('Tierra')      # si se intenta agregar de nuevo, no pasa nada ya que no se puede repetir elementos en un conjunto
print(planetas)


# --- Eliminar elementos ---
planetas.remove('Jupiter')      # remove() puede dar error si el elemento no es identico
print(planetas)

planetas.discard('Tierro')      # con discard() no dara error, simplemente no pasa nada
planetas.discard('Tierra')
print(planetas)

planetas.clear()
print(planetas)

del planetas