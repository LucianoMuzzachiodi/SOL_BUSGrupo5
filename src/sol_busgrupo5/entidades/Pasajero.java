package sol_busgrupo5.entidades;

public class Pasajero {
    private int idPasajero, dni;
    private String nombre, apellido, correo, telefono;
    private boolean estado; 

    public Pasajero() {}

    public Pasajero(int idPasajero, String nombre, String apellido, int dni, String correo, String telefono, boolean estado) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Pasajero(String nombre, String apellido, int dni, String correo, String telefono, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdPasajero() {
        return idPasajero;
    }
    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }    

    @Override
    public String toString() {
        String activo;
        if(estado){activo = "Activo";}else{activo = "Inactivo";}
        return idPasajero + "" + nombre + "" + apellido + "" + dni + "" + correo + "" + telefono + "" + activo;
    }
}
