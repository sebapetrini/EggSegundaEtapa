/*
Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring().
*/

let frase = prompt("Ingrese una frase");
let fraseModificada = "";

for (let i = 0; i < frase.length; i++) {

    fraseModificada += frase[i];

    if (frase[i] != " " && i != (frase.length) - 1) {
        fraseModificada += " ";
    }
}

alert(fraseModificada);