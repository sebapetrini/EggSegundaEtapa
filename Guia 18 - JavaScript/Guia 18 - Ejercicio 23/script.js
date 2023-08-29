/*
Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo)
*/

let boton = document.getElementById("boton");
let parrafo = document.getElementById("texto");

boton.addEventListener("click", function () {

    let aux = "";
    let palabrasResaltadas = [];
    let texto = parrafo.textContent;

    for (let i = 0; i < texto.length; i++) {

        if (texto[i] !== " ") {
            aux += texto[i];
        } else if (aux.length > 8) {
            palabrasResaltadas.push(aux);
            aux = "";
        } else {
            aux = "";
        }
    }

    for (let i = 0; i < palabrasResaltadas.length; i++) {
        texto = texto.replace(palabrasResaltadas[i], '<span style="background-color: yellow;">' + palabrasResaltadas[i] + '</span>');
    }

    parrafo.innerHTML = texto;
});