/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaListarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarCliente
     */
    
    private ControladorCliente controladorCliente;
    private Locale localizacion;
    private ResourceBundle mensajes;
    public VentanaListarCliente(ControladorCliente controladorCliente) {
        this.mensajes=mensajes;
        initComponents();
        this.controladorCliente=controladorCliente;
        llenarDatos();
        
        cambiarIdioma();
    }
    public void cambiarIdioma(){
    
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        lbllistar.setText(mensajes.getString("lbllistarCliente"));
        //lbldatos.setText(mensajes.getString("lblCantidada"));
    
    }
    public void llenarDatos(){
    
        DefaultTableModel modelo=(DefaultTableModel) tbldatos.getModel();
        
       // Object[] dato =new Object[5];
        Set<Cliente> lista=controladorCliente.getLista();
        for (Cliente cliente : lista) {
            Object[] dato={cliente.getCodigo(),
                cliente.getCedula(),
                cliente.getNombre(),
                cliente.getDireccion(),
                cliente.getTelefono() };
            modelo.addRow(dato);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        lbllistar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 255));

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cedula", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldatos.setRowHeight(40);
        jScrollPane1.setViewportView(tbldatos);

        lbllistar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lbllistar.setText("LISTAR CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(lbllistar)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbllistar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbllistar;
    private javax.swing.JTable tbldatos;
    // End of variables declaration//GEN-END:variables
}
