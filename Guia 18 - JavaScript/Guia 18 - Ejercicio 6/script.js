/*
Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.
*/

var num = parseFloat(prompt("Ingrese un número: "));
if (num  ==  0)
    var resultado = `El número no es par, ni impar....`;
else if (num % 2 == 0)
    var resultado = `El número es par...`;
else
    var resultado = `El número es impar...`;
alert(resultado);



