/*
Escribir una función flecha que reciba una palabra y la devuelva al revés.
*/

let frase = prompt("Ingrese una frase");
let fraseModificada = "";

let fraseInvertida = (parametro) => {

    for (let i = (parametro.length - 1); i >= 0; i--) {

        fraseModificada += parametro[i];
    }
    return fraseModificada;
}

alert(fraseInvertida(frase));