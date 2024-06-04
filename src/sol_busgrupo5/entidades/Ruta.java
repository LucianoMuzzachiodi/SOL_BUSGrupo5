package sol_busgrupo5.entidades;

public class Ruta {
    private int idRuta;
    private String origen;
    private String destino;
    private String duracionEstimada;
    private boolean estado;
    
    public Ruta() {}

    public Ruta(int idRuta, String origen, String destino, String duracionEstimada, boolean estado) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
        this.estado = estado;
    }

    public Ruta(String origen, String destino, String duracionEstimada, boolean estado) {
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
    public String getDuracionEstimada() {
        return duracionEstimada;
    }
    public void setDuracionEstimada(String duracionEstimada) {
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
        return idRuta + "" + origen + "" + destino + "" +duracionEstimada + "" + activo;
    }
}
