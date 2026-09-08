# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud Hacer un programa donde el usuario ingrese una frase,
# se le devuelva la misma frase pero sin espacios en blanco, y además un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco).
# Ejemplo: frase = vivir por siempre en paz
# frase final = vivirporsiempreenpaz
# N° de caracteres = 20

frase = input("Ingrese una frase: ")
contador = 0

def quitar_espacios(frase):
    frase_final = ""

    for caracter in frase:
        if caracter != " ":
            frase_final += caracter

    return frase_final


frase_final = quitar_espacios(frase)

print("Frase final:", frase_final)
print("N° de caracteres:", len(frase_final))

