/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.io.Serializable;

/**
 * Representa una reserva realizada por un cliente para un evento concreto en una fecha específica.
 * 
 * <p>
 * Incluye información sobre el cliente, el evento reservado, la fecha de la reserva y una calificación
 * individual (opcional) dada por el cliente al evento.
 * </p>
 * 
 * @author Daniel
 * @version 1.0
 */
public class Reserva implements Serializable{
    private Cliente cliente;
    private Evento evento;
    private String fecha;
    private Double notaIndividual;
    /**
     * Crea una nueva reserva para un cliente y un evento en una fecha dada.
     * 
     * @param cl Cliente que realiza la reserva.
     * @param ev Evento al que se refiere la reserva.
     * @param fecha Fecha de la reserva (formato "dd/MM/yy - HH:mm").
     */
    public Reserva(Cliente cl, Evento ev, String fecha){
        this.cliente = cl;
        this.evento = ev;
        this.fecha= fecha;
        this.notaIndividual=null;
    }

    /**
     * Devuelve el cliente que hizo la reserva.
     * 
     * @return cliente de la reserva.
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Establece el cliente que hizo la reserva.
     * 
     * @param cliente nuevo cliente asociado.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Devuelve el evento reservado.
     * 
     * @return evento de la reserva.
     */
    public Evento getEvento() {
        return evento;
    }
    /**
     * Establece el evento reservado.
     * 
     * @param evento nuevo evento.
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    /**
     * Devuelve la fecha de la reserva.
     * 
     * @return fecha en que se hizo la reserva.
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Establece la fecha de la reserva.
     * 
     * @param fecha nueva fecha de reserva.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Devuelve la calificación individual dada por el cliente al evento.
     * 
     * @return nota individual del cliente (puede ser null si no se ha calificado).
     */
    public Double getNotaIndividual() {
        return notaIndividual;
    }
    /**
     * Establece la calificación individual dada por el cliente al evento.
     * 
     * @param notaIndividual calificación entre 0 y 5.
     */
    public void setNotaIndividual(Double notaIndividual) {
        this.notaIndividual = notaIndividual;
    }
    /**
     * Devuelve una representación textual de la reserva.
     * 
     * @return String con la información de la reserva.
     */
        @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", evento=" + evento + ", fecha=" + fecha + '}';
    }

}
