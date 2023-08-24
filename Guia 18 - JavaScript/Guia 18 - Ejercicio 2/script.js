/*
Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
*/
var radio = prompt("Ingrese el valor del radio: ");
const PI = Math.PI;
var area = PI * Math.pow(radio, 2);
var perimetro = 2 * PI * radio;

var mensaje = `El Área del círculo es: ${area}
El Perímetro del círculo es: ${perimetro}`;
alert(mensaje);