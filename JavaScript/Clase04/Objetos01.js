// --- Creacion de objeto ---
console.log("--- Creando primitivo y objetos ---");
// Tipo primitivo
const x = 10;
console.log(x.length);

// Objeto
const persona1 = {
	nombre: "Carlos",
	apellido: "Gil",
	email: "cgil@gmail.com",
	edad: 30,

	nombreCompleto() {
		return `${this.nombre} ${this.apellido}`;
	},
};

console.log(persona1.nombre);
console.log(persona1.apellido);
console.log(persona1.email);
console.log(persona1.edad);
console.log(persona1.nombreCompleto());

// Forma alternativa de crear un objeto
const persona2 = new Object();
persona2.nombre = "Juan";
persona2.direccion = "Calle 123";
persona2.telefono = "2604112233";
console.log(persona2.telefono);

// --- Accediendo a atributos ---
console.log("");
console.log("--- Accediendo a atributos ---");
// Se puede acceder a atributos como si fuera un arreglo
console.log(persona1["apellido"]);

// Iterando atributos
for (prop in persona1) {
	console.log(prop);
	console.log(persona1[prop]);
}

// --- Modificando, Añadiendo o eliminando atributos ---
console.log("");
console.log("--- Modificando, Añadiendo o eliminando atributos ---");
persona1.apellido = "Garcia";
console.log(persona1.apellido);

// tener cuidado porque si le erramos al atributo por 1 letra podemos terminar creando sin querer un nuevo atributo
// en este caso le erramos aproposito para crear un nuevo atributo que vamos a eliminar despues
persona1.apellidos = "Santos";
console.log(persona1);

delete persona1.apellidos;
console.log(persona1);

// --- Distintas formas de imprimir un objeto ---
console.log("");
console.log("--- Distintas formas de imprimir objetos ---");

// primer forma
console.log("Forma 1: concatenando manualmente");
console.log(persona1.nombre + " " + persona1.apellido);

// segunda forma
console.log("Forma 2: a traves de ciclo for in");
for (propiedad in persona1) {
	console.log(persona1[propiedad]);
}

// tercera forma
console.log("Forma 3: la funcion Object.values()");
console.log(Object.values(persona1)); // Object.values() devuelve un array

// cuarta forma
console.log("Forma 4: utlizando JSON.stringify()");
console.log(JSON.stringify(persona1)); // devuelve un string con el tipico formato llave-valor de JSON

// Investigar sobre JSON, preguntar a IA de preferencia
// por ejemplo: el opuesto de stringify() seria parse() es decir convertir una cadena json en un objeto