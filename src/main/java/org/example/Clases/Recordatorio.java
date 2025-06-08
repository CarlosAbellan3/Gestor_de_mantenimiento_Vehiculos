package org.example.Clases;

public class Recordatorio {
    private int id;
    private String vehiculo;
    private String tipo;
    private String fechaProgramada;

    public Recordatorio(int id, String vehiculo, String tipo, String fechaProgramada) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.tipo = tipo;
        this.fechaProgramada = fechaProgramada;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String setfechaProgramada() {
        return fechaProgramada;
    }

    public void setfechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }
}
