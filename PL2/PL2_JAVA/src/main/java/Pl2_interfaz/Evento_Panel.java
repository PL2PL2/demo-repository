/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pl2_interfaz;

import Pl2_interfaz.Ver_Entradas;
import java.awt.Dimension;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import pl2_java.Cliente;
import pl2_java.Evento;
import pl2_java.ManejarDatos;
import pl2_java.Reserva;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.SwingUtilities;



/**
 *
 * @author daniel
 */
// Utilizada para mostrar eventos, reservas...
public class Evento_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Evento_Panel
     */
    private Evento evento;
    private Cliente cliente;
    private ArrayList<Reserva> reservas;
    private String fechaSeleccionada;
    private int cont;
    private JFrame parentFrame;
    private ArrayList<Evento> eventos;
    private double PrecioReal; 
    public Evento_Panel(Evento ev, Cliente cl, JFrame frame) {
        this.evento = ev;
        this.cliente = cl;
        this.parentFrame = frame;
        if(cl.isVIP()==true){
            PrecioReal=0.9*evento.getPrecio();
        }
        else{
            PrecioReal=evento.getPrecio();
        }
        
        ManejarDatos.cargarReservas();
        reservas = ManejarDatos.getReservas();
        ManejarDatos.cargarEventos();
        eventos= ManejarDatos.getEventos();
        this.setPreferredSize(new Dimension(600, 400));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120)); // evita que crezca verticalmente
        initComponents();
        
        jLabel1.setPreferredSize(new Dimension(200, 200)); // tamaño fijo: ancho = 200px, alto = 150px
        jLabel1.setText("");
        jTextArea2.addMouseWheelListener(e -> {
            java.awt.Component scroll = javax.swing.SwingUtilities.getAncestorOfClass(javax.swing.JScrollPane.class, this);
            if (scroll instanceof javax.swing.JScrollPane) {
                ((javax.swing.JScrollPane) scroll).dispatchEvent(e);
            }
        });
        for(String fecha : ev.getFechas()){
            jComboBox1.addItem(fecha);
        }
        this.fechaSeleccionada=(String) jComboBox1.getSelectedItem();
    }
    
    public void setTexto(String texto){
        jTextArea2.setText(texto);
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setOpaque(false);
        jTextArea2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    }
    public void setImagenEvento(ImageIcon img){
        if (img != null) {
            int width = jLabel1.getPreferredSize().width;
            int height = jLabel1.getPreferredSize().height;
            Image imagen = img.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(imagen));
        } else {
            System.out.println("⚠️ Imagen es null al intentar ponerla en el panel.");
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 472));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("RESERVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(5);
        jSlider1.setMinorTickSpacing(1);

        jLabel2.setText(" 0        1         2         3          4         5");
        jLabel2.setToolTipText("");

        jButton2.setText("Calificar:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    public JComboBox getComboBox(){
        return this.jComboBox1;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "¿Confirmas la compra de la entrada?" + "\nTitulo: " +  evento.getTitulo() + "\nFecha " + jComboBox1.getSelectedItem().toString() + "\nCoste " + PrecioReal + "€",
                                                "Confirmar compra", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
        
            System.out.println(evento);
            System.out.println(cliente);
            ManejarDatos.cargarReservas();
            reservas = ManejarDatos.getReservas();
            String fecha1 = jComboBox1.getSelectedItem().toString();
            Reserva nueva = new Reserva(cliente, evento, fecha1);
            boolean yaReservado = false;
            for (Reserva r : cliente.getReservas()) {
                if (r.getEvento().getTitulo().equals(nueva.getEvento().getTitulo())
                        && r.getFecha().equals(nueva.getFecha())) {
                    yaReservado = true;
                    break;
                }
            }
        

        if (yaReservado) {
            JOptionPane.showMessageDialog(parentFrame, "Reserva ya realizada", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cliente.addReserva(nueva);
            reservas.add(nueva);
            ManejarDatos.guardarReservas();
            
            String nombreArchivo = "facturas.txt";
            LocalDate fechaFactura = LocalDate.now();
            LocalDateTime fechaHora = LocalDateTime.now();

            int hora = fechaHora.getHour();
            int minuto = fechaHora.getMinute();
            int segundo = fechaHora.getSecond();

            
            String contenido = "Fecha: " + fechaFactura.toString() + " " + hora + ":" + minuto + ":" + segundo + "\nImporte: " + String.valueOf(PrecioReal) + "€" 
                    + "\nEvento: " + evento + "\nCliente: " + cliente;

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                escritor.write(contenido);
                escritor.newLine();
                System.out.println("El archivo se ha escrito correctamente.");
            } catch (IOException e) {
                System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            }
    }
}

        
        

    
        
//        jButton1.setText("RESERVADO");
//        jButton1.setEnabled(false);
//        String fecha = jComboBox1.getSelectedItem().toString();
//        jComboBox1.removeAllItems();
//        jComboBox1.addItem(fecha);
//        jComboBox1.setEnabled(false);
        System.out.println(reservas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for(Reserva r:cliente.getReservas()){
            if(r.getEvento().getTitulo().equals(evento.getTitulo()) && r.getNotaIndividual()!=null){
                JOptionPane.showMessageDialog(parentFrame, "Reseña ya realizada", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            else{
        int CalificacionInt = jSlider1.getValue();
        double CalificacionDou = CalificacionInt;
        evento.agregarReseña(CalificacionDou);
        System.out.println("Calificaciones actuales: " + evento.getCalificacionMedia());
        int i=0;
        int l=0;
        for(Evento e:eventos){
            if(e.getTitulo().equals(evento.getTitulo())){
                eventos.set(i, evento);
                ManejarDatos.setEventos(eventos);
                ManejarDatos.guardarEventos();
                break;
            }
            i++;
        }
        r.setNotaIndividual(CalificacionDou);
        r.setEvento(evento);
        for(Reserva re:reservas){
            if(re.getCliente().getCorreo_electronico().equals(r.getCliente().getCorreo_electronico()) && re.getEvento().getTitulo().equals(r.getEvento().getTitulo())){
                reservas.set(l, r);
                ManejarDatos.setReservas(reservas);
                ManejarDatos.guardarReservas();
                break;
            }
            l++;
        }
        
            }
        }
        Window window = SwingUtilities.getWindowAncestor(this); 
    if (window instanceof JFrame) {
        window.dispose(); // Cerrar el Jframe que lo contiene
    }
        Ver_Entradas ver = new Ver_Entradas(cliente);
            ver.setVisible(true); //Recargar vista
    
    }//GEN-LAST:event_jButton2ActionPerformed
        
    public JButton getBoton1() {
    return this.jButton1;
    }
    public JLabel getLabel2() {
        return this.jLabel2;
    }
    public JSlider getSlider1() {
        return this.jSlider1;
    }
    public JButton getBoton2(){
        return this.jButton2;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
