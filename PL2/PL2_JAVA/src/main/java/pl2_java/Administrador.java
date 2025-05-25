/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;

import java.util.ArrayList;

/**
 * Representa un administrador de la aplicación JavaEvents.
 * 
 * <p>
 * El administrador es una clase adicional (el programa no lo aprovecha) diseñada para manejar múltiples administradores en la aplicación. 
 * Los administradores pueden agregar y modificar eventos, asignar VIPS, así como consultar la información de clientes, eventos y reservas.
 * </p>
 * 
 * @author Alejandro
 * @version 1.0
 */
public class Administrador {
    private String correo;
    private String clave;
    /**
    * Crea un nuevo administrador con el correo y la clave especificados.
    * 
    * @param correo Correo electrónico del administrador.
    * @param clave Clave o contraseña del administrador.
    */
    public Administrador(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
    /**
    * Obtiene el correo electrónico del administrador.
    * 
    * @return el correo electrónico.
    */
    public String getCorreo() {
        return correo;
    }
    /**
    * Establece el correo electrónico del administrador.
    * 
    * @param correo nuevo correo electrónico.
    */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
    * Obtiene la clave o contraseña del administrador.
    * 
    * @return la clave.
    */
    public String getClave() {
        return clave;
    }
    /**
    * Establece la clave o contraseña del administrador.
    * 
    * @param clave nueva clave o contraseña.
    */
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    /**
    * Devuelve una representación en forma de texto del administrador, incluyendo su correo y clave.
    * 
    * @return texto con la información del administrador.
    */
    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}' ;
    }
}