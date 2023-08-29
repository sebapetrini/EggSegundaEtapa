/*
Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
muestre el siguiente array [6, 9, 12, 15, 18].
*/

let matriz = [[3], [6], [9], [12], [15]];

function metodo() {
    let vector = [];

    for (let i = 0; i < 5; i++) {
        vector[i] = matriz[i][0] + 3;
    }

    return vector;
}

alert(metodo());