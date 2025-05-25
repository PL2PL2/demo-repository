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
 * Representa un evento dentro de la aplicación JavaEvents.
 * 
 * <p>
 * Un evento contiene información sobre el título, tipo, dirección, fechas de celebración,
 * precio de la entrada, imagen de portada y las calificaciones que han dado los clientes.
 * </p>
 * 
 * @author Alejandro
 * @version 1.0
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
    /**
         * Crea un nuevo evento con los datos especificados.
         * 
         * @param titulo Breve descripción o título del evento.
         * @param tipo Tipo de evento (Concierto, Deporte, Musical, Teatro).
         * @param direccion Dirección donde se celebra el evento (calle, número, ciudad y código postal).
         * @param fechas Lista de fechas y horas en las que se celebra el evento.
         * @param precio Precio base de la entrada.
         * @param portada Ruta relativa de la imagen del evento.
         * @param calificaciones Lista con las calificaciones dadas al evento (sobre 5).
         */
    public Evento(String titulo, String tipo, String direccion, ArrayList<String> fechas, Double precio, String portada, ArrayList<Double> calificaciones) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.fechas = fechas;
        this.precio = precio;
        this.portada = portada;
        this.imagen = cargarImagen(portada);
        this.calificaciones = calificaciones;
    }
    
    /**
     * Carga la imagen de portada desde la ruta relativa indicada.
     * 
     * @param rutaRelativa Ruta relativa de la imagen.
     * @return ImageIcon con la imagen cargada, o null si ocurre un error.
     */
    private ImageIcon cargarImagen(String rutaRelativa) {
    try {
        String rutaCompleta = System.getProperty("user.dir") + File.separator + "Portadas" + File.separator + rutaRelativa;
        return new ImageIcon(rutaCompleta);
    } catch (Exception e) {
        System.out.println("Error al cargar imagen: " + rutaRelativa);
        return null;
    }
}
    /**
     * Obtiene el título del evento.
     * 
     * @return título del evento.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el título del evento.
     * 
     * @param titulo nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     /**
     * Obtiene el tipo del evento.
     * 
     * @return tipo del evento.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el tipo del evento.
     * 
     * @param tipo nuevo tipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Obtiene la dirección del evento.
     * 
     * @return dirección donde se celebra el evento.
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Establece la dirección del evento.
     * 
     * @param direccion nueva dirección.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Obtiene las fechas y horas de celebración del evento.
     * 
     * @return lista con las fechas y horas.
     */
    public ArrayList<String> getFechas() {
        return fechas;
    }
    /**
     * Establece las fechas y horas de celebración del evento.
     * 
     * @param fechas nueva lista de fechas y horas.
     */
    public void setFechas(ArrayList<String> fechas) {
        this.fechas = fechas;
    }
    /**
     * Obtiene el precio de la entrada al evento.
     * 
     * @return precio de la entrada.
     */
    public Double getPrecio() {
        return precio;
    }
    /**
     * Establece el precio de la entrada al evento.
     * 
     * @param precio nuevo precio.
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    /**
     * Obtiene la ruta relativa de la imagen de portada.
     * 
     * @return ruta de la portada.
     */
    public String getPortada() {
        return portada;
    }
     /**
     * Establece la ruta relativa de la imagen de portada y actualiza la imagen cargada.
     * 
     * @param portada nueva ruta de la portada.
     */
    public void setPortada(String portada) {
        this.portada = portada;
        this.imagen = cargarImagen(portada); // actualiza imagen también
    }
    /**
     * Obtiene la imagen de portada como ImageIcon.
     * 
     * @return imagen del evento.
     */
    public ImageIcon getImagen() {
        return imagen;
    }
    /**
     * Añade una nueva calificación al evento.
     * 
     * @param c calificación del 0 al 5.
     */
    public void agregarReseña(double c) {
        if (c >= 0 && c <= 5) {
            calificaciones.add(c);
        }
    }
    /**
     * Calcula y devuelve la calificación media del evento, redondeada a 2 decimales.
     * 
     * @return calificación media, 0 si no hay reseñas.
     */
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
    /**
     * Devuelve una representación en texto con la información del evento.
     * 
     * @return cadena con detalles del evento.
     */
    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", tipo=" + tipo + ", direccion=" + direccion + ", fechas=" + fechas + ", precio=" + precio + ", portada=" + portada + ", calificacion=" + this.getCalificacionMedia() + '}';
    }

}
