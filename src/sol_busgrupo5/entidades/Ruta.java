package sol_busgrupo5.entidades;

import java.sql.Time;

public class Ruta {
    private int idRuta;
    private String origen;
    private String destino;
    private Time duracionEstimada;
    private boolean estado;
    
    public Ruta() {}

    public Ruta(int idRuta, String origen, String destino, Time duracionEstimada, boolean estado) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
        this.estado = estado;
    }

    public Ruta(String origen, String destino, Time duracionEstimada, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
        this.estado = estado;
    }

    public int getIdRuta() {
        return idRuta;
    }
    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Time getDuracionEstimada() {
        return duracionEstimada;
    }
    public void setDuracionEstimada(Time duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
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
        return idRuta + " Origen: " + origen + ", Destino: " + destino + ", Duración: " +duracionEstimada + " " + activo;
    }
}
