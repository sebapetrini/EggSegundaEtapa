/*
Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario.
*/

let circulo = {
    radio : "",

    setRadio : function(radio) {
        this.radio = radio
    },

    area : function() {
        alert(`
        El area es = ${Math.PI * this.radio ** 2} `)    // Area = PI * radio²
    },

    perimetro : function() {
        alert(`
        El Perimetro es = ${2 * Math.PI * this.radio} `)    // Perimetro = 2 * PI * radio
    }
}

circulo.setRadio(prompt("Ingrese el Radio del Circulo"));
circulo.area();
circulo.perimetro();