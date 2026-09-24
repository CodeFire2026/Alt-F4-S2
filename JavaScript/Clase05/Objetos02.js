// --- Viendo metodos Get y Set ---
const persona1 = {
	nombre: "Carlos",
	apellido: "Gil",
	email: "cgil@gmail.com",
	edad: 28,
	idioma: "es",

	nombreCompleto() {
		return `${this.nombre} ${this.apellido}`;
	},

	get nombreEdad() {
		return `La edad de ${this.nombre} es: ${this.edad}`;
	},

	get lang() {
		return this.idioma.toUpperCase();
	},

	set lang(abreviatura_idioma) {
		this.idioma = abreviatura_idioma.toUpperCase();
	},
};

console.log("--- Utilizando el metodo get ---");
console.log(persona1.nombreEdad); // aqui nos ahorramos tener que escribir "nombreEdad()", es decir, no hace falta los parentesis

console.log("--- Utilizando metodo set ---");
persona1.lang = "en"; // de nuevo, no hace falta los parentesis
console.log(persona1.idioma);

// funcion constructor
function persona2(nombre = "Luis", apellido, email) {
	// se puede preasignar
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.nombreCompleto = function () {
		return `${this.nombre} ${this.apellido}`;
	};
}

// ---o---o---o---
// Igual se recomienda usar la forma moderna:
/* 
class persona2 {
	constructor(nombre = "Luis", apellido, email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	metodoEjemplo() {
		return bla bla
	}
}
*/
// ---o---o---o---

const padre = new persona2("Lao", "Kung", "lkung@gmail.com");
padre.nombre = "Yoshi";
console.log(padre);
console.log(padre.nombreCompleto());

const madre = new persona2("Sonia", "Zamora", "szamora@gmail.com");
console.log(madre);
console.log(madre.nombreCompleto());

// --- Diferentes formas de crear objetos ---
// Caso 1
const miObjeto1 = new Object(); // Formal
// Caso 2
const miObjeto2 = {}; // Recomendada

// Caso String
const miCadena1 = new String(); // Formal
// Caso String 2
const miCadena2 = "Hola"; // Recomendada

// Caso numeros
const miNumero = new Number(1); // Formal (no recomendada)
// Caso numeros 2
const miNumero2 = 1; // Recomendada

// Caso bool
const miBool = new Boolean(false); // Formal
// Caso bool 2
const miBool2 = false; // Recomendada

// Caso arreglo
const miArreglo = new Array(); // Formal (no recomendada)
// Caso arreglo 2
const miArreglo2 = []; // Recomendada

// Caso funcion
const miFuncion = new (function () {})();
// Caso funcion 2
const miFuncion2 = function () {};

// --- Uso de prototype ---
persona2.prototype.telefono = "2604567890";
// el atributo se aplica a todos los objetos sin tener que ir al constructor
console.log(madre.telefono);
madre.telefono = "18009356782"; // y se pueden reasignar despues
console.log(madre.telefono);

// --- Uso de call y apply---
// ambos hacen lo mismo (cambiar a quién apunta "this"), pero difieren en cómo aceptan argumentos
const persona3 = {
	nombre: "Juan",
	apellido: "Perez",
	nombreCompleto2: function (titulo, telefono) {
		return `${titulo}: ${this.nombre} ${this.apellido} ${telefono}`;
	},
};

const persona4 = {
	nombre: "Carlos",
	apellido: "Lara",
};

// call (acepta elementos individualmente)
console.log(persona3.nombreCompleto2("Lic.", "12345"))
console.log(persona3.nombreCompleto2.call(persona4, "Ing.", "678910"))

// apply (acepta solo un array)
console.log(persona3.nombreCompleto2.apply(persona4, ["Dr.", "55778822"]))