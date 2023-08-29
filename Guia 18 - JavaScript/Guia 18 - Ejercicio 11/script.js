/*
Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”
*/

let frase = prompt("Ingrese una frase");
let auxMax = "";
let aux = "";

for (let i = 0; i < frase.length; i++) {

    if(frase[i] != " ") {
        aux += frase[i]
    } else if(auxMax.length < aux.length){
        auxMax = aux;
        aux = "";
    } else {
        aux = "";
    }
}

alert(auxMax);