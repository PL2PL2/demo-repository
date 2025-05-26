/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 * Clase utilitaria para manejar la persistencia y gestión de datos relacionados con clientes, eventos y reservas.
 * 
 * <p>
 * Proporciona métodos para cargar y guardar datos serializados en ficheros, 
 * así como para acceder y hacer una ordenacion básica de listas de objetos.</p>
 * 
 * <p>Los ficheros utilizados son:
 * </p>
 * <ul>
 *   <li><code>registroClientes.dat</code></li>
 *   <li><code>registroEventos.dat</code></li>
 *   <li><code>registroReservas.dat</code></li>
 * </ul>
 * 
 * @author Alejandro
 * @version 1.0
 */
public class ManejarDatos {
    private static ArrayList<Evento> eventos = new ArrayList<>();
    private static Evento objeve;
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Cliente objcli;
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static Reserva objres;
    
    // --- CLIENTES ---

    /**
     * Establece la lista completa de clientes.
     * 
     * @param c lista de clientes a establecer.
     */
    public static void setClientes(ArrayList<Cliente> c) {
        clientes = c;
    }

    /**
     * Devuelve la lista de clientes ordenada alfabéticamente por nombre.
     * 
     * @return lista ordenada por nombre de clientes.
     */
    public static ArrayList<Cliente> getClientes() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomCliComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.getNombre().compareTo(c2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, NomCliComp);
        return clientes;
    }
    
    
    /**
     * Carga la lista de clientes desde el fichero <code>registroClientes.dat</code>.
     * Si el archivo todavía no existe, se crea una lista vacía.
     */
     public static void cargarClientes() {
         File archivo = new File("registroClientes.dat");

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado. Se iniciará una lista vacía.");
            clientes = new ArrayList<Cliente>(); // inicializa vacío
            guardarClientes();
            return;
        }
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamCli = new FileInputStream("registroClientes.dat");
            ObjectInputStream oisCli = new ObjectInputStream(istreamCli);
            clientes = (ArrayList) oisCli.readObject();
            istreamCli.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda la lista de clientes en el fichero <code>registroClientes.dat</code>.
     * 
     * Después de asignar la lista con setClientes(), guarda la lista actualizada.
     */
    public static void guardarClientes() {
        File archivo = new File("registroClientes.dat");
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamCli = new FileOutputStream("registroClientes.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de personas
                oosCli.writeObject(clientes);
                ostreamCli.close();
            } else {
                System.out.println("Error: No hay datos...");
                if(!archivo.exists()){
                    FileOutputStream ostreamCli = new FileOutputStream("registroClientes.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de personas
                oosCli.writeObject(clientes);
                ostreamCli.close();
                }
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    

    // --- EVENTOS ---
    
    /**
     * Establece la lista de eventos.
     * 
     * @param e lista de eventos a establecer.
     */
    public static void setEventos(ArrayList<Evento> e) {
        eventos = e;
    }

    /**
     * Devuelve la lista de eventos ordenada alfabéticamente por título.
     * 
     * @return lista ordenada de eventos por su título.
     */
    public static ArrayList<Evento> getEventos() {
        //Comparador para ordenar los eventos por su título
        Comparator NomEveComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Evento e1 = (Evento) o1;
                Evento e2 = (Evento) o2;
                return e1.getTitulo().compareTo(e2.getTitulo());
            }
        };
        //Ordenamos el array
        Collections.sort(eventos, NomEveComp);
        return eventos;
    }
    
    
    
    /**
     * Carga la lista de eventos desde el fichero <code>registroEventos.dat</code>.
     * Si el archivo no existe, se crea una lista vacía.
     */
    public static void cargarEventos() {
         File archivo = new File("registroEventos.dat");

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado. Se iniciará una lista vacía.");
            eventos = new ArrayList<Evento>(); // inicializa vacío
            guardarEventos();
            return;
        }
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamEve = new FileInputStream("registroEventos.dat");
            ObjectInputStream oisEve = new ObjectInputStream(istreamEve);
            eventos = (ArrayList) oisEve.readObject();
            istreamEve.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda la lista de eventos en el fichero <code>registroEventos.dat</code>.
     * 
     * Después de asignar la lista con setEventos(), guarda la lista actualizada.
     */
    public static void guardarEventos() {
        File archivo = new File("registroEventos.dat");
        try {
            //Si hay datos los guardamos...
            if (!eventos.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamEve = new FileOutputStream("registroEventos.dat");
                ObjectOutputStream oosEve = new ObjectOutputStream(ostreamEve);
                //guardamos el array de personas
                oosEve.writeObject(eventos);
                ostreamEve.close();
            } else {
                System.out.println("Error: No hay datos...");
                if(!archivo.exists()){
                    FileOutputStream ostreamEve = new FileOutputStream("registroEventos.dat");
                ObjectOutputStream oosEve = new ObjectOutputStream(ostreamEve);
                //guardamos el array de personas
                oosEve.writeObject(eventos);
                ostreamEve.close();
                }
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    
    
    
    // --- RESERVAS ---

    /**
     * Establece la lista de reservas.
     * 
     * @param r lista de reservas a establecer.
     */
    public static void setReservas(ArrayList<Reserva> r) {
        reservas = r;
    }

    /**
     * Devuelve la lista de reservas ordenada por el correo electrónico del cliente.
     * 
     * @return lista ordenada de reservas por el correo electrónico del cliente.
     */
    public static ArrayList<Reserva> getReservas() {
        //Comparador para ordenar las reservas por el correo electrónico de su cliente.
        Comparator NomCliComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Reserva r1 = (Reserva) o1;
                Reserva r2 = (Reserva) o2;
                return r1.getCliente().getCorreo_electronico().compareTo(r2.getCliente().getCorreo_electronico());
            }
        };
        //Ordenamos el array
        Collections.sort(reservas, NomCliComp);
        return reservas;
    }
    
    /**
     * Carga la lista de reservas desde el fichero <code>registroReservas.dat</code>.
     * Si el archivo no existe, se crea una lista vacía.
     */
    public static void cargarReservas() {
         File archivo = new File("registroReservas.dat");

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado. Se iniciará una lista vacía.");
            reservas = new ArrayList<Reserva>(); // inicializa vacío
            guardarReservas();
            return;
        }
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamCli = new FileInputStream("registroReservas.dat");
            ObjectInputStream oisCli = new ObjectInputStream(istreamCli);
            reservas = (ArrayList) oisCli.readObject();
            istreamCli.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda la lista de reservas en el fichero <code>registroReservas.dat</code>.
     */
    public static void guardarReservas() {
        File archivo = new File("registroReservas.dat");
        try {
            //Si hay datos los guardamos...
            if (!reservas.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamCli = new FileOutputStream("registroReservas.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de personas
                oosCli.writeObject(reservas);
                ostreamCli.close();
            } else {
                System.out.println("Error: No hay datos...");
                if(!archivo.exists()){
                    FileOutputStream ostreamCli = new FileOutputStream("registroReservas.dat");
                ObjectOutputStream oosCli = new ObjectOutputStream(ostreamCli);
                //guardamos el array de personas
                oosCli.writeObject(reservas);
                ostreamCli.close();
                }
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
