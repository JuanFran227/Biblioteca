public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private boolean activo;
 
    
    public Prestamo(){

    }

    public Prestamo(Libro libro, Usuario usuario){
        this.libro= libro;
        this.usuario=  usuario;
        this.activo= true;

    }

    public void finalizarPrestamo(){
        activo= false;
    }

    public Libro getLibro() {
        return libro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public boolean activo(){
        return activo;
    }
}
