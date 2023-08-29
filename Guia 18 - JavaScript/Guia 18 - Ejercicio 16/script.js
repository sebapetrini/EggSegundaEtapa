/*
Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla.
*/

let vector1 = [];
let vector2 = [];

for(let i = 0; i<5; i++) {
    vector1[i] = Math.floor(Math.random() * 100); //Math.random() devuelve un decimal entre 0 y 1 (excluyendo el 1)
    vector2[i] = Math.floor(Math.random() * 100); //Math.floor() redondea hacia abajo y devuelve un entero
}

alert(`
Vector #1 = ${vector1}
Vector #2 = ${vector2} 
`)