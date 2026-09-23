# --- Ampliando info sobre conjuntos ---
#   * Pueden tener distintos tipos de datos dentro (int, str, float, bool, etc.)

# se puede inicializar un conjunto vacio (ya que intentar usar {} dará un diccionario)
conjunto = set()

# se pueden comparar conjuntos
conjunto1 = {"hello",}
conjunto2 = {"bye",}
print(conjunto1 == conjunto2) # dara bool

# --- Operaciones con conjuntos ---
conjunto3 = conjunto1 | conjunto2       # union (valores repetidos se omiten)
print(conjunto3)

conjunto2.add("hello")
conjunto3 = conjunto1 & conjunto2       # interseccion
print(conjunto3)

conjunto1.add("hey")
conjunto3 = conjunto1 - conjunto2       # diferencia A-B
print(conjunto3)

conjunto3 = conjunto2 - conjunto1       # diferencia B-A
print(conjunto3)

conjunto3 = conjunto2 ^ conjunto1       # diferencia simetrica
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))    # verificando subconjunto
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto2))    # verificando superconjunto
print(conjunto3.issuperset(conjunto1))
print(conjunto1.issuperset(conjunto3))

conjunto1 = {'hello'}
conjunto2 = {'bye'}
print(conjunto1.isdisjoint(conjunto2))    # verificando si son disjuntos

conjunto1 = frozenset       # se congela el conjunto y se hace inmutable
