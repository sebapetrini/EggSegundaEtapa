/*
Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.
*/

function getFormValores() {
    event.preventDefault();

    let nombre = document.getElementById("form1").nombre.value;
    let apellido = document.getElementById("form1").apellido.value;

    alert(`
    Nombre: ${nombre}
    Apellido: ${apellido}
    `)
}