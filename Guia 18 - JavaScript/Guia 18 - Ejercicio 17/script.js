/*
Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
resultado
*/

let vector1 = [];

for (let i = 0; i < 5; i++) {   // Creamos un vector con 5 numeros aleatorios
    vector1[i] = Math.floor(Math.random() * 100);
}

let modificarVector = () => {
    let vectorModificado = vector1.slice();  // Creamos una copia del vector ya que si lo igualamos estamos haciendo Referencia al Objeto Array vector1
    for(let i = 1; i < 3; i++) {
        vectorModificado.pop(); // Elimina el ultimo objeto del Array
    }
    return vectorModificado;
};

alert(`
Vector entero = ${vector1}
Vector sin los dos ultimos numero = ${modificarVector()} 
`)