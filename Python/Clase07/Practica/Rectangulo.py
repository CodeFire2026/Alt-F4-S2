class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura


rectangulos = []

print("\nIngrese la altura y base de 3 rectangulos")

for i in range(3):
    while True:
        print(f"\n{i + 1}° Rectangulo")

        altura = int(input("Altura: "))
        base = int(input("Base: "))

        if altura == base:
            print("\nEso seria un cuadrado! Intente de nuevo")
        elif altura < 0 or base < 0:
            print("\nLa longitud no puede ser negativa! Intente de nuevo")
        else:
            rectangulos.append(Rectangulo(altura, base))
            break

print(
    "\n- Areas -\n"
    f"Primer rectangulo: {rectangulos[0].calcular_area()}\n"
    f"Segundo rectangulo: {rectangulos[1].calcular_area()}\n"
    f"Tercer rectangulo: {rectangulos[2].calcular_area()}"
)
