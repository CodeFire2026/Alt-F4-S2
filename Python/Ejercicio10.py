# Ejercicio 10: No repetir caracteres ...//
# Hacer un programa que pida una cadena por teclado, luego
# al meter los caracteres en una lista sin repetir caracteres...//

cadena = input("Introduce una cadena: ") 
caracteres = []

for caracter in cadena:
    if caracter not in caracteres:
        caracteres.append(caracter)

print(caracteres)
