/*
Escribir un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
*/

let Persona = {
    nombre: "Jose",
    edad: "34",
    sexo: "H",
    peso: 76.4,
    altura: 1.75
};

let vector = [];
let i = 0;

for (let elemento in Persona) {
    vector[i] = elemento;
    i++
}

alert(vector);