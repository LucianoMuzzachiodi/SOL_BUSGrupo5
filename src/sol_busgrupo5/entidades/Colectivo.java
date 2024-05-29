package sol_busgrupo5.entidades;

public class Colectivo {
    private int idColectivo, capacidad;
    private String matricula, marca, modelo;

    public Colectivo() {}

    public Colectivo(int idColectivo, String matricula, String marca, String modelo, int capacidad) {
        this.idColectivo = idColectivo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public Colectivo(String matricula, String marca, String modelo, int capacidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public int getIdColectivo() {
        return idColectivo;
    }
    public void setIdColectivo(int idColectivo) {
        this.idColectivo = idColectivo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "\nID: " + idColectivo
                + "\nMatrícula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCapacidad: " + capacidad;
    }  
}