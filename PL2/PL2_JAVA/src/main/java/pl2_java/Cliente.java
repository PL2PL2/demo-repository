/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.util.ArrayList;
import java.io.*;
/**
 * Representa un cliente de la aplicación JavaEvents.
 * 
 * <p>
 * Dependiendo del tipo de acceso (cliente o administrador), un cliente podrá:
 * </p>
 * <ul> 
 *   <li>Registrarse e iniciar sesión con su correo y clave.</li>
 *   <li>Buscar y reservar eventos.</li>
 *   <li>Consultar sus reservas.</li>
 *   <li>Dejar reseñas sobre los eventos comprados.</li>
 *   <li>Modificar sus datos personales.</li>
 * </ul>
 * 
 * Además, puede tener estatus VIP que puede ser gestionado internamente por el Administrador.
 * 
 * @author Alejandro
 * @version 1.0
 */
public class Cliente implements Serializable {
    private String nombre;
    private String correo_electronico;
    private String clave;
    private String teléfono;
    private String dirección; // (calle, número, ciudad y código postal).
    private String tarjeta_de_credito; //(nombre del titular, número de 16 dígitos y fecha de caducidad).
    private boolean VIP;
    private ArrayList<Evento> eventos; // eventos comprados.
    private ArrayList<Reserva> reservas; // eventos comprados.
    /**
     * Constructor para crear un nuevo cliente con todos sus datos personales.
     * 
     * @param nombre Nombre completo del cliente.
     * @param correo_electronico Correo electrónico del cliente (usado como login).
     * @param clave Clave o contraseña de acceso.
     * @param teléfono Número de teléfono.
     * @param dirección Dirección (calle, número, ciudad y código postal).
     * @param tarjeta_de_credito Información de tarjeta de crédito (nombre del titular, número de 16 dígitos y fecha de caducidad).
     * @param VIP Indica si el cliente es VIP (supone un descuento del 10%).
     */
    public Cliente(String nombre, String correo_electronico, String clave, String teléfono, String dirección, String tarjeta_de_credito, boolean VIP) {
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.clave = clave;
        this.teléfono = teléfono;
        this.dirección = dirección;
        this.tarjeta_de_credito = tarjeta_de_credito;
        this.VIP = VIP;
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        
    }
    /** @return Nombre del cliente. */
    public String getNombre() {
        return nombre;
    }

    /** @return Correo del cliente. */
    public String getCorreo_electronico() {
        return correo_electronico;
    }

    /** @return Clave del cliente. */
    public String getClave() {
        return clave;
    }

    
    /** @return Teléfono del cliente. */
    public String getTeléfono() {
        return teléfono;
    }

    /** @return Dirección del cliente. */
    public String getDirección() {
        return dirección;
    }

    /** @return Tarjeta de crédito del cliente. */
    public String getTarjeta_de_credito() {
        return tarjeta_de_credito;
    }

    /** @return Si el cliente es VIP (true/false). */
    public boolean isVIP() {
        return VIP;
    }
    /** @return Si el cliente es VIP, en texto ("true"/"false"). */
    public String getVip(){
        if (VIP){
            return "true";
        }
        return "false";
    }
    /** 
     * Asigna el estado de VIP del cliente.
     * @param vip true si debe ser VIP y false si no debe ser VIP. */
    public void setVip(boolean vip){
        if(vip==true){
            this.VIP=true;
        }
        else if(vip==false){
            this.VIP=false;
        }
    }
    /** 
     * Asigna la lista de reservas al cliente.
     * @param res Lista de reservas. */
    public void setReservas(ArrayList<Reserva> res){
        this.reservas = res;
    }
    
    /** @return Lista de eventos comprados por el cliente. */
    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    /**
     * Añade una nueva reserva al cliente.
     * 
     * @param reserva Reserva a añadir.
     */
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    /** @return Lista de reservas hechas por el cliente. */
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    
    /**
     * Devuelve una representación en cadena del cliente.
     * 
     * @return Información del cliente en texto.
     */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", tel\u00e9fono=" + teléfono + ", direcci\u00f3n=" + dirección + ", tarjeta_de_credito=" + tarjeta_de_credito + ", VIP=" + VIP + ", eventos=" + eventos + '}';
    }

    

    
    
}
