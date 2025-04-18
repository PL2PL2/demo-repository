/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl2_java;
import java.io.*;

/**
 *
 * @author Alejandro
 */
public class MiObjectOutputStream extends ObjectOutputStream { //Esto es para poder manejar correctamente los objetos al guardarlos en el .dat
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Evita escribir el encabezado si ya hay datos en el archivo
        reset();
    }
}
