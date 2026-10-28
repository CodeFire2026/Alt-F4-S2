class Producto:
    contador_productos = 0 # Variable de clase ...//

    def __init__(self, nombre, precio):
        producto.contador_productos += 1 # Aumento para la variable clase...///
        self._id_producto = Producto.contador_productos # Asignacion desde la variable de clase...//
        self.nombre = nombre
        self.precio = precio
    # Metodo setters and getters ...///
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    # Sobrescribimos el metodo str...//
    def __str__(self):
        return f'Id Producto: {self._id_producto}, Nombre: {self.nombre}, Precio: {self.precio}'


if __name__ == '__main__': # Solo sera visible si la prueba se ejecuta desde aqui...//
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)
