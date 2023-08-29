/*
Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/

let libro = {
    ISBN : "",
    titulo : "",
    autor : "",
    numeroDePaginas : "",

    setIsbn : function(isbn) {
        this.ISBN = isbn
    },

    setTitulo : function(titulo) {
        this.titulo = titulo
    },

    setAutor : function(autor) {
        this.autor = autor
    },

    setPaginas : function(paginas) {
        this.numeroDePaginas = paginas
    },

    toString : function() {
        alert(`
        ISBN = ${this.ISBN}
        Titulo = ${this.titulo}
        Autor = ${this.autor}
        Cantidad de Paginas = ${this.numeroDePaginas}
        `)
    }
}

libro.setIsbn(prompt("Ingrese el ISBN"));
libro.setTitulo(prompt("Ingrese el Titulo"));
libro.setAutor(prompt("Ingrese el Autor"));
libro.setPaginas(prompt("Ingrese la Cantidad de Paginas"));

libro.toString();