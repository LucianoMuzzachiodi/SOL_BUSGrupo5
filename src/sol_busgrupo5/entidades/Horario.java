package sol_busgrupo5.entidades;

import java.util.Date;


public class Horario {
    private int idHorario;
    private Ruta ruta;
    private Date horaSalida;
    private Date horaLlegada;

    public Horario() {
    }

    public Horario(int idHorario, Ruta ruta, Date horaSalida, Date horaLlegada) {
        this.idHorario = idHorario;
        this.ruta = ruta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public Horario(Ruta ruta, Date horaSalida, Date horaLlegada) {
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

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", ruta=" + ruta + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + '}';
    }  
}
