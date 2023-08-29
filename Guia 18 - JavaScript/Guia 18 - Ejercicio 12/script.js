/*
Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de dato.
*/

let indefinido;
let nulo = null;
const num = 1;
const frase = "frase";
const flotante = 1.10;
const buleana = 1 == 1;
const arreglo = [];

const objeto = {
    nombre : "Jose",
    apellido : "Perez"
}

const funcion = function() {}; // Creamos una funcion vacia

alert(`
indefinido = ${typeof indefinido}
nulo = ${typeof nulo}
num = ${typeof num}
frase = ${typeof frase}
flotante = ${typeof flotante}
buleana = ${typeof buleana}
arreglo = ${typeof arreglo}
objeto = ${typeof objeto}
funcion = ${typeof funcion}
`);