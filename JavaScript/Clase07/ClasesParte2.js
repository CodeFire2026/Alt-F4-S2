// Hoisting NO se puede hacer con clases, pero sí con funciones
// const persona3 = new Persona("Carla", "Ponce");  <-- esto tira error

// Estructura general de clase
class Persona {
	// clase padre

    static contadorPersonas = 0; //Atributos estáticos.
    //Este se asoscia a la clase en si.
    //email = 'Valor default email';//Atributo No estatico.
    //Se asocia directamente con los objetos.

    static get MAX_OBJ(){ //Este método sirve para simular una constante.
        return 5;
    }


	// Metodo constructor para inicializar atributos
	constructor(nombre, apellido){
		// agregamos guion bajo porque el atributo y el get/set no se pueden llamar igual
		this._nombre = nombre;
		this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
         }
        //console.log('Se incrementa el contador: '+Persona.contadorObjetosPersona);
        
        else{
            console.log('Se ha superado el máximo de objetos permitidos');
        }
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
    nombreCompleto(){ //De esta manera, con esta función, heredamos de la clase padre, a la clase hija
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }
    //Sobreescribiendo el método de la clase padre (Object)
    toString(){ //Regresa un String.
        //Se aplico el polimorfismo que significa = multiples formas en tiempo de ejecución.
        //El método que se ejecuta depende si es una referencia de tipo padre o hija.
        return this.nombreCompleto();
    }
    static saludar(){
        console.log('Saludos desde este método static');
    }
    static saludar2(persona){
        console.log(persona.nombre);
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
    
     //Sobreescritura: Modifica el comportamiento de algun método definido en la clase padre.
    nombreCompleto(){
        return super.nombreCompleto()+' '+this._departamento;
    }//Si no respetamos la sobreescritura, estariamos realizando otro método, por ende se debe usar mismos nombres y parámetros.
}

// Creando objetos
let persona1 = new Persona("Martin", "Perez");
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre); 
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);

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
let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombreCompleto()); // a pesar de no estar dentro de la clase, podemos acceder al metodo get gracias a la herencia
//Se aparece en la variable, la herencia en la clase hija, proveniente de la clase padre
//Con este método estamos accediendo sin ningun tipo de problema.

//Object.prototype.toString: Esta es la manera de acceder a atributos y métodos de manera dinamica.
console.log(empleado1.toString());
console.log(persona1.toString());


//persona1.saludar(); No se utiliza desde el objeto.
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No se puede acceder desde la clase.
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas)

let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; //No se puede modificar ni alterar.
console.log(Persona.MAX_OBJ);


let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana','Paz');
console.log(persona5.toString());