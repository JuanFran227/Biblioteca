public class Libros {
    /*1. Gestión de Libros:
    ○ Agregar libros nuevos.(admin)
    ○ Eliminar libros existentes.(admin)
    ○ Buscar libros por título, autor o categoría.(todos)
    ○ Mostrar todos los libros disponibles.(todos)*/

    String titulo;
    String autor;
    String categoría;
    int cantidad;

    public void Libros(){

    }

    public void Libros(String titulo, String autor, String categoría, int cantidad){
        this.titulo = titulo;
        this.autor = autor;
        this.categoría = categoría;
        this.cantidad = cantidad;
    }   
}