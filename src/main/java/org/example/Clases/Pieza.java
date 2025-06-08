package org.example.Clases;

public class Pieza {
    private int id;
    private String nombre;
    private int cantidadStock;
    private double precio;

    public Pieza(int idPieza, String nombre, int cantidadStock, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcantidadStock() {
        return cantidadStock;
    }

    public void setcantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
