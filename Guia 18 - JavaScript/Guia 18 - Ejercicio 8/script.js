/*
Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos.

template string
*/
var cant = 0;
var max = 0;
var min = 0;
var sum = 0;
do{
    var num = parseFloat(prompt("Ingrese un número (con 0 termina el ingreso): "));
    if (num !==0){ 
        if (cant == 0){
            max = num;
            min = num;
        }
        cant ++;
        sum += num;
        if (max < num){
            max = num;
        }
        if (min > num)
            min = num;
    }
}while (num !== 0);

var resultado = `El número máximo ingresado es: ${max}
El número mínimo ingresado es: ${min}
El promedio de los números ingresados es: ${sum/cant}`;
alert(resultado);

