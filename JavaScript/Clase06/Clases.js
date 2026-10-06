// Hoisting NO se puede hacer con clases, pero sí con funciones
// const persona3 = new Persona("Carla", "Ponce");  <-- esto tira error

// Estructura general de clase
class Persona {
	// clase padre

	// Metodo constructor para inicializar atributos
	constructor(nombre, apellido) {
		// agregamos guion bajo porque el atributo y el get/set no se pueden llamar igual
		this._nombre = nombre;
		this._apellido = apellido;
	}

	// Creando getters
	get nombre() {
		return this._nombre;
	}

	get apellido() {
		return this._apellido;
	}

	// Creando setters
	set nombre(nombre) {
		this._nombre = nombre;
	}

	set apellido(apellido) {
		this._apellido = apellido;
	}
}

class Empleado extends Persona {
	// clase hija

	/* Este constructor tira error porque falta el super(9)
    constructor(departamento) {
        this._departamento = departamento;
	} 
    */
	constructor(nombre, apellido, departamento) {
		super(nombre, apellido); // esta primera linea DEBE estar a la hora de hacer una clase hija
		this._departamento = departamento;
	}

	get departamento() {
		return this._departamento;
	}

	set departamento(departamento) {
		this._departamento = departamento;
	}
}

// Creando objetos
const persona1 = new Persona("Martin", "Perez");
console.log(persona1);
const persona2 = new Persona("Carlos", "Lara");
console.log(persona2);

// Obteniendo atributos con get
console.log(persona1.nombre); // no hace falta escribir nombre() porque javascript interpreta que es el get
console.log(persona2.nombre);

// Estableciendo atributos con set
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
persona2.nombre = "María Laura";
console.log(persona2.nombre);

// Tarea: agregar get y set para apellido
console.log(persona1.apellido); // antes
persona1.apellido = "Rodriguez";
console.log(persona1.apellido); // despues

// Llamando al constructor de la clase hija Empleado
const empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre); // a pesar de no estar dentro de la clase, podemos acceder al metodo get gracias a la herencia

