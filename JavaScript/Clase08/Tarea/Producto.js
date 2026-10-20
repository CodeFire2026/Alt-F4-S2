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
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}