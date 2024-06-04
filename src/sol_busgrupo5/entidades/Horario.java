package sol_busgrupo5.entidades;

import java.sql.Time;

public class Horario {
    private int idHorario;
    private Ruta ruta;
    private Time horaSalida, horaLlegada;
    private boolean estado;

    public Horario() {}

    public Horario(int idHorario, Ruta ruta, Time horaSalida, Time horaLlegada, boolean estado) {
        this.idHorario = idHorario;
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.estado = estado;
    }

    public Horario(Ruta ruta, Time horaSalida, Time horaLlegada, boolean estado) {
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.estado = estado;
    }

    public int getIdHorario() {
        return idHorario;
    }
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    public Time getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }
    public Time getHoraLlegada() {
        return horaLlegada;
    }
    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
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
        return ruta.getOrigen() + '(' + horaSalida + ')' + ruta.getDestino() + '(' + horaLlegada + ')' + "" + activo;
    }
}
