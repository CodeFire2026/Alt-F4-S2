class Producto {
    
    // Atributo estatico para llevar la cuenta global de  cuantos productos se crean
    static contadorProductos = 0;

    constructor(nombre, precio) {
        // Usamos ++ para que el primer ID sea 1 y se autoincremente
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    // Getters y setters
    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }

    // Metodo para devolver la informacion del producto como texto
    toString() {
        return `idProducto: ${this._idProducto}, Producto: ${this._nombre}, Precio: $${this._precio}`;
    }
}

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

// Prueba de la aplicación de ventas
console.log('Iniciando Prueba de Ventas');

// Creación de objetos Producto
let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturón', 50);
let producto4 = new Producto('Zapatos', 300);
let producto5 = new Producto('Medias', 20);
let producto6 = new Producto('Gorra', 40);

// Prueba Orden 1
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.mostrarOrden();

// Prueba Orden 2 probando el límite de MAX_PRODUCTOS
let orden2 = new Orden();
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto4); // 4to producto
orden2.agregarProducto(producto5); // 5to producto
orden2.agregarProducto(producto6); // Este debería fallar por superar el máximo
orden2.mostrarOrden();