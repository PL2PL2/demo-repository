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
public class Administrador {
    private String correo;
    private String clave;
    private ArrayList<Evento> eventos; // Todos los eventos.
    private ArrayList<Clientes> clientes; // Todos los clientes.

    public Administrador(String correo, String clave, ArrayList<Evento> eventos, ArrayList<Clientes> clientes) {
        this.correo = correo;
        this.clave = clave;
        this.eventos = eventos;
        this.clientes = clientes;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + ", eventos=" + eventos + ", clientes=" + clientes + '}';
    }

    
    
}
