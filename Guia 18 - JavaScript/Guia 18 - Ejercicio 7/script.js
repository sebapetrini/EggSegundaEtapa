/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
*/

var limite = parseFloat(prompt("Ingrese un número límite para las sumas: "));
var suma = 0;

do{
    suma +=  parseFloat(prompt("Ingrese un número a sumar: "));

}while (suma < limite )
var resultado = `El número límite era:  ${limite} y la suma total dio:  ${suma}`;
alert(resultado);

/*

var numlimite = parseFloat(prompt("Ingrese un numero limite positivo"));
if (numlimite < 0) {
    alert("El numero ingresado es menor a 0. Ingrese un valor positivo")
}

var suma = 0;

do {
    var num = parseFloat(prompt("Ingrese un numero"));
    console.log(suma = suma + num);
} while (suma < numlimite);

alert("LA SUMA DE LOS NUMEROS ES HA SUPERADO EL LIMITE")
*/