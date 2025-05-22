/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro
 */
public class Evento implements Serializable {
private String titulo; //(breve descripción del evento que aparece como encabezado, ejemplo: “Concierto de Arde Bogotá”).
private String tipo; //(Concierto, Deporte, Musical, Teatro)
private String direccion; //(calle, número, ciudad y código postal).
private ArrayList<String> fechas;// y horas de celebración. Puede ser que un evento solo se celebre una sola vez o se repita en el tiempo.
private Double precio; //de la entrada.
private String portada; //(imagen del evento).
private ArrayList<Double> calificaciones; //(media de las reseñas sobre 5)
private ImageIcon imagen;

    public Evento(String titulo, String tipo, String direccion, ArrayList<String> fechas, Double precio, String portada) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.fechas = fechas;
        this.precio = precio;
        this.portada = portada;
        this.imagen = cargarImagen(portada);
        this.calificaciones = new ArrayList<>();
    }
    
    private ImageIcon cargarImagen(String rutaRelativa) {
    try {
        String rutaCompleta = System.getProperty("user.dir") + File.separator + "Portadas" + File.separator + rutaRelativa;
        return new ImageIcon(rutaCompleta);
    } catch (Exception e) {
        System.out.println("Error al cargar imagen: " + rutaRelativa);
        return null;
    }
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

    public ArrayList<String> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<String> fechas) {
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
        this.imagen = cargarImagen(portada); // actualiza imagen también
    }

    public ImageIcon getImagen() {
        return imagen;
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
