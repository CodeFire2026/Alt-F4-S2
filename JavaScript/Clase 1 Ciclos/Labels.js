// Etiquetas Labels
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        break inicio; // Va a la siguiente iteracion
    }
    console.log(contando);
}
console.log('Termina el ciclo');