// Sintaxis Antigua, ya no se recomienda usar esta forma
//let autos = new Array('Ferrari', 'Renault', 'BMW');
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);
// Con const definimos el tipo del arreglo (que va a ser string) y no cambiará
// pero podemos cambiar los elementos del arreglo.

// Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0;i < autos.length; i++) {
    console.log(i+': '+autos[i]);
}

// Modificamos los elementos de un arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

// Agregamos nuevos valores al arreglo
autos.push('Audi'); // Agregamos un elemento al final del arreglo
console.log(autos);

// Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porsche';
console.log(autos);

// Tercera forma de agregar elementos teniendo CUIDADO
autos[6] = 'Renault';
console.log(autos);

// Como preguntar si es un Array o un Arreglo
console.log(Array.isArray(autos));

// Preguntamos si la variable es una instancia de la clase Array
console.log(autos instanceof Array);