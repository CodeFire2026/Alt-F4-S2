# Ejercicio 10: Juego adivina el numero, termina cuando el usuario acierta el numero aleatorio (1-100), contar numero de intentos

import random

rand_num = random.randint(1, 100)
print(rand_num)
intentos = 0

print("Adivina el número! Te sientes con suerte? (entre 1 y 100)")
while True:
    usr_num = int(input("\nNúmero: "))
    intentos += 1
    if usr_num < rand_num:
        print("Es más grande...")
    elif usr_num > rand_num:
        print("Es más chico...")
    else:
        if intentos == 1:
            puntaje = "S+ !!!"
        elif 2 <= intentos <= 5:
            puntaje = "S"
        elif 6 <= intentos <= 9:
            puntaje = "A"
        elif 10 <= intentos <= 13:
            puntaje = "B"
        elif 14 <= intentos <= 17:
            puntaje = "C"
        elif 18 <= intentos <= 20:
            puntaje = "D"
        else:
            puntaje = "F"
        print(f"\nCORRECTO! Acertaste, el número era {rand_num}\nIntentos: {intentos}\nPuntaje: {puntaje}")
        break