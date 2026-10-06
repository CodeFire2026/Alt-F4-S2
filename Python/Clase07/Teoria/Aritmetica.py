class Aritmetica:
    """
    El nombre de este tipo de documentacion es: DocString
    esto es documentacion de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y más
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(7, 9)
print(aritmetica1.sumar())
print(f"Resta: {aritmetica1.restar()}\n"
      f"Multiplicación: {aritmetica1.multiplicar()}\n"
      f"Division: {aritmetica1.dividir():.2f}")
