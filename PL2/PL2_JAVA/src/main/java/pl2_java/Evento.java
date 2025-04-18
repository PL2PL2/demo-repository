/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Evento {
private String titulo; //(breve descripción del evento que aparece como encabezado, ejemplo: “Concierto de Arde Bogotá”).
private String tipo; //(Concierto, Deporte, Musical, Teatro)
private String direccion; //(calle, número, ciudad y código postal).
private String fechas;// y horas de celebración. Puede ser que un evento solo se celebre una sola vez o se repita en el tiempo.
private Double precio; //de la entrada.
private String portada; //(imagen del evento).
private ArrayList<Double> calificaciones; //(media de las reseñas sobre 5)

    public Evento(String titulo, String tipo, String direccion, String fechas, Double precio, String portada) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.fechas = fechas;
        this.precio = precio;
        this.portada = portada;
        this.calificaciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public void agregarReseña(double c) {
        if (c >= 0 && c <= 5) {
            calificaciones.add(c);
        }
    }

    public double getCalificacionMedia() {
        if (calificaciones.isEmpty()){
            return 0.0;
        }
        double suma = 0;
        for (double r : calificaciones) {
            suma += r;
        }
        return (Math.round((suma / calificaciones.size()) * 100.0) / 100.0); // redondeado a 2 decimales
    }

    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", tipo=" + tipo + ", direccion=" + direccion + ", fechas=" + fechas + ", precio=" + precio + ", portada=" + portada + ", calificacion=" + this.getCalificacionMedia() + '}';
    }

}
