miFuncion(8, 2); // Esto se le  conoce como hoisting

function miFuncion(a, b) {
    //console.log('Sumamos: '+ (a + b));
    return a + b;
}

// Llamando la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

// Declaramos una funcion de tipo expresion o anonima
let x = function(a, b){ return a + b};
resultado = x(5, 6);
console.log(resultado);

// Funciones de tipo self e invoking
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6); //funcion anonima, no se asigna a una variable ni tiene nombre
// no se puede reutilizar, por lo mismo de antes

console.log(typeof miFuncion); // es un tipo de dato
// tambien se puede describir como un objeto

function miFuncionDos(a, b) {
    console.log(arguments); // se tiene que realizar dentro de la funcion
    console.log(arguments.length); // tenemos este metodo porque tambien es tipo objeto
}

miFuncionDos(5, 7);

// toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

// Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);
console.log(resultado)

let sumar = function(a = 4, b = 8){
    console.log(argumentos[0]); // muestra el parametro de: a
    console.log(arguments[1]); // parametro de: b
    console.log(arguments[2]); // undefined, no es necesario: num argumentos = num parametros
    return a + b + arguments[2];
}
resultado = sumar(3, 5, 9); // se reasignan valores
console.log(resultado); // 14

// Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9) // hoisting
console.log(respuesta);
function sumarTodo() {
    let suma = 0;
    for(let i = 0; i < arguments.length; i++) {
        suma += arguments[i]; // arguments es para arreglos
    }
    return suma;
}

// Paso por valor
// Cuando utilizamos tipos que no son objetos (numericos, booleanos, etc)
// Tipos primitivos
let k = 10;
function cambiarValor(a) { // Paso por valor
    a = 20;
}
cambiarValor(k); // La variable no cambia, solo paso una copia
console.log(k);

// Paso por referencia
// Creamos un objeto para asociarle propiedades y metodos
// Lo recomendable y buena practica es usar const
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);

function cambiarValorObjeto(p1) { // p1 es para acceder a los atributos del objeto
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona); // las modificaciones cambian permanentemente al objeto persona
console.log(persona);