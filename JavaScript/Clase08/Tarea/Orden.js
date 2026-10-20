class Orden {

    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5; // Constante estatica que define el limite maximo de productos

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = []; // Arreglo vacio donde se iran guardando los objetos de tipo Producto
        this._contadorProductosAgregados = 0; // Variable para llevar el control de cuantos
        // productos se han agregado a esta orden
    }

    // Getter
    get idOrden() {
        return this._idOrden;
    }

    // Metodo para agregar un producto a la orden
    agregarProducto(producto) {
        // Solo agregamos si no se supera el maximo permitido
        if (this._contadorProductosAgregados < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto); // Agrega el objeto al arreglo
            this._contadorProductosAgregados++; // Incrementa el contador de esta orden
        } else { // Si se supera el limite muestra mensaje de error
            console.log(`No se puede agregar el producto. Se ha alcanzado el límite de ${Orden.MAX_PRODUCTOS} productos por orden.`);
        }
    }

    // Metodo para calcular el precio total de la orden
    calcularTotal() {
        let total = 0;
        // Recorremos el arreglo de productos y sumamos sus precios
        for (let producto of this._productos) {
            total += producto.precio;
        }
        return total;
    }

    // Metodo para imprimir en consola el detalle de la orden
    mostrarOrden() {
        // Imprimimos primero la cabecera con el ID y el Total
        console.log(`\nOrden N°: ${this._idOrden} | Total: $${this.calcularTotal()}`);
        console.log(`Productos:`);
        
        // Recorremos el arreglo e imprimimos cada producto uno por uno
        for (let producto of this._productos) {
            console.log(` - [${producto.toString()}]`);
        }
    }
}