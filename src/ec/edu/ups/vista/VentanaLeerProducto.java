/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Usuario
 */
public class VentanaLeerProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private ResourceBundle mensajes;
    public VentanaLeerProducto(ControladorProducto controladorProducto) {
        this.mensajes=mensajes;
        initComponents();
        this.controladorProducto=controladorProducto;
        
        cambiarIdioma();
    }
    public void cambiarIdioma(){
    
        mensajes= ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",VentanaPrincipal.localizacion);
        lblbusvarProducto.setText(mensajes.getString("lblbuscarProducto"));
        lblcantidad.setText(mensajes.getString("lblCantidada"));
        lblmarca.setText(mensajes.getString("lblMarca"));
        lblinhresar.setText(mensajes.getString("crear.lblingresar"));
        lblnombre.setText(mensajes.getString("crear.lblnombre"));
        lblcosto.setText(mensajes.getString("lblCosto"));
        btnBuscar.setText(mensajes.getString("menu.item.buscar"));
        btnCancelar.setText(mensajes.getString("crear.btncancelar"));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblinhresar = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblmarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblcosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        lblcantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblbusvarProducto = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 153));

        lblinhresar.setText("Ingrese el codigo");

        lblmarca.setText("Marca");

        txtMarca.setEditable(false);
        txtMarca.setEnabled(false);

        lblnombre.setText("Nombre");

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);

        lblcosto.setText("Costo");

        txtCosto.setEditable(false);
        txtCosto.setEnabled(false);

        lblcantidad.setText("Cantidad");

        txtCantidad.setEditable(false);
        txtCantidad.setEnabled(false);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblbusvarProducto.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblbusvarProducto.setText("BUSCAR  PRODUCTO");

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblinhresar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblbusvarProducto)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblbusvarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinhresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo =Integer.parseInt(txtCodigo.getText());
        Producto buscarProducto=controladorProducto.read(codigo);
        txtNombre.setText(buscarProducto.getNombre());
        txtCosto.setText(String.valueOf(buscarProducto.getCosto()));
        txtMarca.setText(buscarProducto.getMarca());
        txtCantidad.setText(String.valueOf(buscarProducto.getCantidad()));
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1ActiontxtMarca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblbusvarProducto;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JLabel lblinhresar;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
