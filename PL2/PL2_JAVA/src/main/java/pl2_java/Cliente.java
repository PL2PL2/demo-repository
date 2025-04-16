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
public abstract class Cliente {
    private String nombre;
    private String correo_electronico;
    private String clave;
    private int teléfono;
    private String dirección; // (calle, número, ciudad y código postal).
    private String tarjeta_de_credito; //(nombre del titular, número de 16 dígitos y fecha de caducidad).
    private boolean VIP;
    private ArrayList<Evento> eventos; // eventos comprados.

    public Cliente(String nombre, String correo_electronico, String clave, int teléfono, String dirección, String tarjeta_de_credito, boolean VIP, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.clave = clave;
        this.teléfono = teléfono;
        this.dirección = dirección;
        this.tarjeta_de_credito = tarjeta_de_credito;
        this.VIP = VIP;
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTarjeta_de_credito() {
        return tarjeta_de_credito;
    }

    public void setTarjeta_de_credito(String tarjeta_de_credito) {
        this.tarjeta_de_credito = tarjeta_de_credito;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", tel\u00e9fono=" + teléfono + ", direcci\u00f3n=" + dirección + ", tarjeta_de_credito=" + tarjeta_de_credito + ", VIP=" + VIP + ", eventos=" + eventos + '}';
    }

    

    
    
}
