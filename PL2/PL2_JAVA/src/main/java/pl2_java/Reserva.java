/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.io.Serializable;

/**
 *
 * @author daniel
 */
public class Reserva implements Serializable{
    private Cliente cliente;
    private Evento evento;
    private String fecha;
    public Reserva(Cliente cl, Evento ev, String fecha){
        this.cliente = cl;
        this.evento = ev;
        this.fecha= fecha;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
        @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", evento=" + evento + ", fecha=" + fecha + '}';
    }

}
