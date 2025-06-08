package org.example.Clases;

public class Servicio {
    private int id;
    private String descripcion;
    private String fecha;
    private int vehiculoId;


    public Servicio(int idServicio, Vehiculo vehiculo, String descripcion, String fecha, int vehiculoId) {
        this.id = idServicio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.vehiculoId = vehiculoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }
}