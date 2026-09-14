# Clase 5 Ejercicio 6: calculadora de impuestos
# Crear funcion para calcular el total de un pago sumando impuestos
# Formula: total = pago + pago * (impuesto/100)

def solicitarValores():
    pago = float(input("Ingrese el pago: $"))
    impuesto = float(input("Ingrese los impuestos: "))
    mostrarValores(*calcularValores(pago, impuesto))

def calcularValores(pago, impuesto):
    total = pago + pago * (impuesto / 100)
    return total, pago, impuesto

def mostrarValores(total, pago, impuesto):
    print(f"\nPago sin impuestos: ${pago}\nImpuestos: {impuesto}%\nTotal a pagar: ${total}")


if __name__ == "__main__":
    solicitarValores()