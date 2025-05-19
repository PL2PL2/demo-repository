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
    
    
    
    
    
    
    
    
    
    
    
     public static void cargarDatos() {
         File archivo = new File("registroClientes.dat");

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado. Se iniciará una lista vacía.");
            clientes = new ArrayList<Cliente>(); // inicializa vacío
            guardarDatos();
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
    public static void guardarDatos() {
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
    
}
