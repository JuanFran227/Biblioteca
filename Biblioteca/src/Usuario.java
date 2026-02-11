public class Usuario {
    /*2. Gestión de Usuarios:
    ○ Registrar nuevos usuarios.(admin)
    ○ Consultar información de usuarios registrados.(admin)*/
    // Requerimientos Técnicos Usa arrays para almacenar libros y usuarios.



    /*No tocar*/

    String nombreusuario;
    int idusuario;

    public Usuario(){

    }

    public Usuario(String nombreusuario, int idusuario){
        this.nombreusuario = nombreusuario;
        this.idusuario = idusuario;
    }

    public String getNombreUsuario(){
        return nombreusuario;
    }

    public int getIdUsuario(){
        return idusuario;
    }
}