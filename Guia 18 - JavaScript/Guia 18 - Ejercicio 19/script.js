/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20.
*/

let vector1 = [];
let vector2 = [];

for(let i = 0; i < 50; i++) {
    vector1[i] = (Math.random() * 100).toFixed(2);  //.toFixed() formatea el numero a un determinado numero de decimales
}

alert(`
Vector #1
${vector1
}`);

vector1.sort(); // Ordenamos el vector de Menor a Mayor

for(let i = 0; i < 20; i++) {
    if(i < 10) {
        vector2[i] = vector1[i];
    } else {
        vector2[i] = 0.5;
    }
}



alert(`
Vector #1 ordenado de Menor a Mayor:
${vector1}
`);

alert(`
Vector #2
${vector2}
`)