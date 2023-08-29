/*
A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos
*/

var valores = [true, 5, false, "hola", "adios", 2];

// a) Determinar cual de los dos elementos de texto es mayor

let aux1;
let aux2 = "";

for (let i = 0; i < valores.length; i++) {
    if (typeof valores[i] === "string") {

        aux1 = valores[i];

        if (aux2.length < aux1.length) aux2 = aux1;
    }
}

alert(`El elemento de texto mas grande es: ${aux2}`);

/*
    b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
    operadores necesarios para obtener un resultado true y otro resultado false
*/

let vectorBooleanos = [];
let num = 0;
for (let i = 0; i < valores.length; i++) {

    if (typeof valores[i] === "boolean") {
        vectorBooleanos[num] = valores[i];
        num++;
    }
}

alert(`Los elementos booleanos son: ${vectorBooleanos}`);

/*
    c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
    dos elementos numéricos
*/

let suma = () => valores[1] + valores[5];
let resta = () => valores[1] - valores[5];
let multiplicacion = () => valores[1] * valores[5];
let division = () => valores[1] / valores[5];

alert(`
Teniendo los numeros: ${valores[1]} y ${valores[5]}
Suma = ${suma()}
Resta = ${resta()}
Multiplicacion = ${multiplicacion()}
Division = ${division()}
`);