public class Libros {
    /*1. Gestión de Libros:
    ○ Agregar libros nuevos.(admin)
    ○ Eliminar libros existentes.(admin)
    ○ Buscar libros por título, autor o categoría.(todos)
    ○ Mostrar todos los libros disponibles.(todos)*/

    private String titulo;
    private String autor;
    private String categoria;
    private int cantidadlibros;
    private int librostotal;

    public void Libros(){

    }

    public void Libros(String titulo, String autor, String categoria, int cantidad){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.cantidadlibros = cantidad;
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

    public int getcantidad(){
        return cantidadlibros;
    }

    public int librostotal(){
        return librostotal;
    }
}