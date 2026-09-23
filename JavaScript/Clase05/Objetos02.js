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
		return this.idioma;
	},

	set lang(abreviatura_idioma) {
		this.idioma = abreviatura_idioma.toUpperCase();
	},
};

console.log("--- Utilizando el metodo get ---");
console.log(persona1.nombreEdad); // aqui nos ahorramos tener que escribir "nombreEdad()", es decir, no hace falta los parentesis

console.log("--- Utilizando metodo set ---");
persona1.lang = "es";   // de nuevo, no hace falta los parentesis
console.log(persona1.idioma);
