package sol_busgrupo5.entidades;

public class Ruta {
    private int idRuta;
    private String origen;
    private String destino;
    private String duracionEstimada;
    
    public Ruta() {}

    public Ruta(int idRuta, String origen, String destino, String duracionEstimada) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
    }

    public Ruta(String origen, String destino, String duracionEstimada) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
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

    @Override
    public String toString() {
        return "\nOrigen: " + origen
                + "\nDestino: " + destino
                + "\nDuración estimada: " + duracionEstimada;
    }
}
