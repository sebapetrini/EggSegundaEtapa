/*
Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
elección.
*/

let boton = document.getElementById("boton");

boton.addEventListener("click", function() {
    document.getElementById("texto").innerHTML = "Feliz Programacion!"
});