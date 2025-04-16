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
    private ArrayList<Cliente> clientes; // Todos los clientes.

    public Administrador(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
        this.eventos = new ArrayList<>();
        this.clientes = new ArrayList<>();
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
        if (eventos != null) {
            this.eventos = eventos;
        }
    }

    public void agregarEvento(Evento evento) {
        if (evento != null) {
            eventos.add(evento);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        if (clientes != null) {
            this.clientes = clientes;
        }
    }

    public boolean agregarCliente(Cliente cliente) {
        if (cliente != null) {
            for(Cliente c : clientes){
                if (c.getCorreo_electronico().equals(cliente.getCorreo_electronico())){
                    return false;
                }
            }
            clientes.add(cliente);
            return true;
        }
        return false;
    }
    
    public boolean modificarEventoPorTitulo(String titulo, String nuevoTitulo, String nuevoTipo, String nuevaDireccion,List<String> nuevasFechas, double nuevoPrecio, String nuevaPortada) {
    for (Evento e : eventos) {
        if (e.getTitulo().equals(titulo)) {
            e.setTitulo(nuevoTitulo);
            e.setTipo(nuevoTipo);
            e.setDireccion(nuevaDireccion);
            e.setFechas(nuevasFechas);
            e.setPrecio(nuevoPrecio);
            e.setPortada(nuevaPortada);
            return true; 
        }
    }
    return false;

    
}

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + ", eventos=" + eventos + ", clientes=" + clientes + '}';
    }
}