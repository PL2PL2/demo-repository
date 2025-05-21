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
 *
 * @author Alejandro
 */
public class ManejarDatos {
    private static ArrayList<Evento> eventos = new ArrayList<>();
    private static Evento objeve;
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Cliente objcli;
    
    
    public static void setClientes(ArrayList<Cliente> c) {
        clientes = c;
    }

    /**@return Devuelve el ArrayList de personas */
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

    /** Guarda los datos de personas en el fichero */
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
    
    
    public static void setEventos(ArrayList<Evento> e) {
        eventos = e;
    }

    /**@return Devuelve el ArrayList de personas */
    public static ArrayList<Evento> getEventos() {
        //Comparador para ordenar las personas por su nombre
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

    /** Guarda los datos de personas en el fichero */
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
    
}
