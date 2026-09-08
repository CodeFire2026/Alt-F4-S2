# Ejercicio 8: Factorial de un numero positivo
# Hacer un programa para calcular el factorial de un numero positivo

# pido al usuario un numero positivo
numero = int(input("Ingresa un número entero positivo: "))

# verifico que sea positivo
while numero < 0:
    print("El número debe ser positivo.")
    numero = int(input("Ingresa un número entero positivo: "))

factorial = 1
# multiplicar desde 1 hasta el numero
for i in range(1, numero + 1): # +1 para incluir el numero
    factorial *= i

print(f"El factorial de {numero} es: {factorial}")