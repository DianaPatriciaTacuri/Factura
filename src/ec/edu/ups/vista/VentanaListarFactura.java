/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.modelo.Factura;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaListarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarCliente
     */
    
    ControladorFactura controladorFactura;
    private Locale localizacion;
    private ResourceBundle mensajes;
    public VentanaListarFactura(ControladorFactura controladorFactura) {
        this.mensajes=mensajes;
        initComponents();
        this.controladorFactura=controladorFactura;
        llenarDatos();
        cambiarIdioma();
    }
    public void cambiarIdioma(){
    
        //mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        mensajes= ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",VentanaPrincipal.localizacion);	
        lbllistarFactura.setText(mensajes.getString("lbllistarFactura"));
        
        
    }
    
    
    public void llenarDatos(){
    
        DefaultTableModel modelo=(DefaultTableModel) tblCliente.getModel();
        
       // Object[] dato =new Object[5];
        Set<Factura> lista=controladorFactura.getLista();
        for (Factura factura : lista) {
            Object[] dato={factura.getCodigo(),
                factura.getCodigo(),
                factura.getCliente().getNombre(),
                factura.getDetalleFactura().getDescripcion(),
                factura.getDetalleFactura().getCantidadCompra(), 
                factura.getDetalleFactura().getSubTotal(),
                factura.getIva(),
                factura.getSubtotal(),
                factura.getTotal()
            };
            modelo.addRow(dato);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lbllistarFactura = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "nombre", "marca", "Cantidad", "Costo", "iva", "subtotal", "total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setRowHeight(40);
        jScrollPane1.setViewportView(tblCliente);

        lbllistarFactura.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lbllistarFactura.setText("LISTAR FACTURA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(lbllistarFactura)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbllistarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbllistarFactura;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
