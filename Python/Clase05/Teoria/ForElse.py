# esta estructura permite ejecutar codigo al finalizar el bucle
# pero se debe usar junto con break dentro del ciclo para que tenga sentido
# por ejemplo: de ser una condicion verdadera, se ejecuta codigo y se usa un break, dicho caso no se ejecuta el else
#               por otra parte, si no fuese a ser verdadera una condicion, el ciclo terminaria y por defecto se ejecuta lo que esté en el else

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:  # aqui queremos que se pare el bucle al cumplirse algo
        break
else:  # pero de no cumplirse y finalizar el bulce entonces queremos que suceda esto
    print("no more numbers!")
