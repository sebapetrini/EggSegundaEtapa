/*
Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
circulo y lo muestre en el HTML.
*/

let botonDiametro = document.getElementById("btn-diametro");

botonDiametro.addEventListener("click", function () {
    event.preventDefault();

    let diametro = parseFloat(document.getElementById("diametro").value);
    let radio = (diametro / 2).toFixed(2);

    document.getElementById("txt-diametro").innerHTML = "El radio del circulo es: " + radio;
})

let botonCircunferencia = document.getElementById("btn-circunferencia");

botonCircunferencia.addEventListener("click", function () {
    event.preventDefault();

    let circunferencia = parseFloat(document.getElementById("circunferencia").value);
    let radio = (circunferencia / 2 * Math.PI).toFixed(2);

    document.getElementById("txt-circunferencia").innerHTML = "El radio del circulo es: " + radio;
})