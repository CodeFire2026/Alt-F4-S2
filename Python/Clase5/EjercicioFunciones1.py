# Clase 5 Ejercicio 1: No repetir caracteres
# Pedir una cadena por teclado y meter los caracteres en una lista sin repetidos


def solicitarCadena():
    usr_str = input("Ingrese una cadena: ").replace(" ", "")
    return usr_str

def extraerCaracteres(cadena: str):
    usr_no_repeats = []
    for letra in cadena:
        if letra not in usr_no_repeats:
            usr_no_repeats.append(letra)
    return usr_no_repeats

if __name__ == "__main__":
    print("Tu cadena sin repetidos: ", extraerCaracteres(solicitarCadena()))