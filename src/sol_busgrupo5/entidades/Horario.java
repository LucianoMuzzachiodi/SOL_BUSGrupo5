package sol_busgrupo5.entidades;

import java.sql.Time;
import java.time.LocalTime;

public class Horario {
    private int idHorario;
    private Ruta ruta;
    private Time horaSalida, horaLlegada;

    public Horario() {}

    public Horario(int idHorario, Ruta ruta, Time horaSalida, Time horaLlegada) {
        this.idHorario = idHorario;
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public Horario(Ruta ruta, Time horaSalida, Time horaLlegada) {
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
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

    @Override
    public String toString() {
        return "\nViaje: " + ruta.getOrigen() + '(' + horaSalida + ')' + ruta.getDestino() + '(' + horaLlegada + ')';
    }
}
