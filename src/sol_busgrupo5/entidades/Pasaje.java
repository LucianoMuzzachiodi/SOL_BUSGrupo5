package sol_busgrupo5.entidades;

import java.util.Date;

public class Pasaje {
    private int idPasaje, asiento;
    private Pasajero pasajero;
    private Colectivo colectivo;
    private Ruta ruta;
    private Date fechaViaje, horaViaje;
    private double precio;
    private boolean estado;

    public Pasaje() {}

    public Pasaje(int idPasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, Date fechaViaje, Date horaViaje, int asiento, double precio, boolean estado) {
        this.idPasaje = idPasaje;
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
        this.estado = estado;
    }

    public Pasaje(Pasajero pasajero, Colectivo colectivo, Ruta ruta, Date fechaViaje, Date horaViaje, int asiento, double precio, boolean estado) {
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getIdPasaje() {
        return idPasaje;
    }
    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public Colectivo getColectivo() {
        return colectivo;
    }
    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    public Date getFechaViaje() {
        return fechaViaje;
    }
    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }
    public Date getHoraViaje() {
        return horaViaje;
    }
    public void setHoraViaje(Date horaViaje) {
        this.horaViaje = horaViaje;
    }
    public int getAsiento() {
        return asiento;
    }
    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
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
        return idPasaje + "" + pasajero.getApellido() + "" + pasajero.getNombre() + "" + colectivo.getMarca() + "" + colectivo.getModelo() + "" + colectivo.getMatricula() + "" + ruta.getOrigen() + "" + ruta.getDestino() + "" + horaViaje + "" + ruta.getDuracionEstimada() + "" + asiento + "" + precio + "" + activo;
    }
}
