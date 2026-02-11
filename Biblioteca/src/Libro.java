public class Libro {
    /*1. Gestión de Libros:
    ○ Agregar libros nuevos.(admin)
    ○ Eliminar libros existentes.(admin)
    ○ Buscar libros por título, autor o categoría.(todos)
    ○ Mostrar todos los libros disponibles.(todos)*/
    // Requerimientos Técnicos Usa arrays para almacenar libros y usuarios.



    /*No tocar*/

    private String titulo;
    private String autor;
    private String categoria;

    public Libro(){

    }

    public Libro(String titulo, String autor, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }



    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getcategoria(){
        return categoria;
    }
}