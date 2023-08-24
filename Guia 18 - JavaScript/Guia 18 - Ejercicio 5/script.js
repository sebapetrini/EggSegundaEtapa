/*Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división*/
/*
var num1 = prompt(Ingrese el primer Número: );
var num2 = prompt(Ingrese el segundo Número: );
var operacion = prompt("Ingrese la operación que desea realizar (r/resta - d/division - s/suma - m/multiplicación):");

operacion = operacion.toUpperCase; */

let num1 = parseFloat(prompt('Indique el primer numero '));

let num2 = parseFloat(prompt('Indique el segundo numero'));

let e = prompt(
  'Indique alguna de las siguientes opciones: S - Suma, R - Resta, M - Multiplicación, D - Division'
);

e = e.toLowerCase();

var resultado = 0;

if (e === 's') {
  resultado = num1 + num2;
  alert(`Tu suma es: ${resultado}`);
} else if (e === 'r') {
  resultado = num1 - num2;
  alert(`Tu resta es: ${resultado}`);
} else if (e === 'm') {
  resultado = num1 * num2;
  alert(`Tu multiplicación es: ${resultado}`);
} else if (e === 'd') {
  if (num2 === 0) {
    alert('No se puede dividir por 0');
  } else {
    resultado = num1 / num2;
    alert(`Tu division es: ${resultado}`);
  }
}else{
  alert('La opción ingresada no es válida...')

}

/*

var selUser = prompt(`Calculadora\n
S- Suma\n
R- Restar\n
M- Multiplicar\n
D- Dividir\n
Ingrese el tipo de operación a realizar`);

var valor1 = parseFloat(prompt("Ingrese el primer valor"));
var valor2 = parseFloat(prompt("Ingrese el segundo valor"));

switch (selUser.toLowerCase()) {
    case "s":
        var suma = valor1 + valor2;
        console.log(`La suma entre ${valor1} y ${valor2} equivale a ${suma}`);
        break;
    case "r":
        var resta = valor1 - valor2;
        console.log(`La resta entre ${valor1} y ${valor2} equivale a ${resta}`);
        break;
    case "m":
        var multiplicacion = valor1 * valor2;
        console.log(`La multiplicación entre ${valor1} y ${valor2} equivale a ${multiplicacion}`);
        break;
    case "d":
        if (valor2 !== 0) {
            var division = valor1 / valor2;
            console.log(`La división entre ${valor1} y ${valor2} equivale a ${division}`);
        } else {
            console.log("No se puede dividir por cero");
        }
        break;
    default:
        console.log("Operación no válida");
}


*/