/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Alejandro
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

    public String getNombre() {
        return nombre;
    }


    public String getCorreo_electronico() {
        return correo_electronico;
    }


    public String getClave() {
        return clave;
    }

    

    public String getTeléfono() {
        return teléfono;
    }

    
    public String getDirección() {
        return dirección;
    }


    public String getTarjeta_de_credito() {
        return tarjeta_de_credito;
    }

   
    public boolean isVIP() {
        return VIP;
    }
    
    public String getVip(){
        if (VIP){
            return "true";
        }
        return "false";
    }
    public void setVip(boolean vip){
        if(vip==true){
            this.VIP=true;
        }
        else if(vip==false){
            this.VIP=false;
        }
    }
    
    public void setReservas(ArrayList<Reserva> res){
        this.reservas = res;
    }
    

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", tel\u00e9fono=" + teléfono + ", direcci\u00f3n=" + dirección + ", tarjeta_de_credito=" + tarjeta_de_credito + ", VIP=" + VIP + ", eventos=" + eventos + '}';
    }

    

    
    
}
