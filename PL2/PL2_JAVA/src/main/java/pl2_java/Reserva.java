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
    
    public Reserva(Cliente cl, Evento ev){
        this.cliente = cl;
        this.evento = ev;
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
    
        @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", evento=" + evento + '}';
    }

}
