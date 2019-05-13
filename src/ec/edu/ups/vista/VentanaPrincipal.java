
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorProducto;

public class VentanaPrincipal extends javax.swing.JFrame {

    ControladorCliente controladorcliente;
    ControladorProducto controladorProducto;
    
    public VentanaPrincipal() {
        initComponents();
        controladorcliente=new ControladorCliente();
        controladorProducto=new ControladorProducto();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemLeer = new javax.swing.JMenuItem();
        itemActualizar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        itemListar = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        itemCrear.setMnemonic('o');
        itemCrear.setText("Crear");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        fileMenu.add(itemCrear);

        itemLeer.setMnemonic('s');
        itemLeer.setText("Leer");
        itemLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLeerActionPerformed(evt);
            }
        });
        fileMenu.add(itemLeer);

        itemActualizar.setMnemonic('a');
        itemActualizar.setText("Actualizar");
        itemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarActionPerformed(evt);
            }
        });
        fileMenu.add(itemActualizar);

        itemEliminar.setMnemonic('x');
        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        fileMenu.add(itemEliminar);

        itemListar.setText("Listar");
        itemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarActionPerformed(evt);
            }
        });
        fileMenu.add(itemListar);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Producto");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Crear");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Buscar");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Actualizar");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Eliminar");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        jMenuItem1.setText("Listar");
        editMenu.add(jMenuItem1);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        VentanaEliminarCliente eliminar=new VentanaEliminarCliente(controladorcliente);
        eliminar.setVisible(true);
        desktopPane.add(eliminar);
        setSize(eliminar.getWidth()+20,eliminar.getHeight()+70);
        
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed
       VentanaCrearCliente crear=new VentanaCrearCliente(controladorcliente);
       crear.setVisible(true);
       desktopPane.add(crear);
       setSize(crear.getWidth()+20,crear.getHeight()+70);
    }//GEN-LAST:event_itemCrearActionPerformed

    private void itemLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLeerActionPerformed
        VentanaLeerCliente leer=new VentanaLeerCliente(controladorcliente);
        leer.setVisible(true);
        desktopPane.add(leer);
        setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_itemLeerActionPerformed

    private void itemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarActionPerformed
       VentanaActualizarCliente actualizar=new VentanaActualizarCliente(controladorcliente);
       actualizar.setVisible(true);
       desktopPane.add(actualizar);
       setSize(actualizar.getWidth()+20,actualizar.getHeight()+70);
    }//GEN-LAST:event_itemActualizarActionPerformed

    private void itemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarActionPerformed
        VentanaListarCliente listar=new VentanaListarCliente(controladorcliente);
        listar.setVisible(true);
        desktopPane.add(listar);
        setSize(listar.getWidth()+20,listar.getHeight()+70);
    }//GEN-LAST:event_itemListarActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        VentanaCrearProducto crear=new VentanaCrearProducto(controladorProducto);
        crear.setVisible(true);
        desktopPane.add(crear);
        setSize(crear.getWidth()+20,crear.getHeight()+70);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        VentanaLeerProducto leer=new VentanaLeerProducto(controladorProducto);
        leer.setVisible(true);
        desktopPane.add(leer);
        setSize(leer.getWidth()+20,leer.getHeight()+70);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        VentanaActualizarProducto actualizar=new VentanaActualizarProducto(controladorProducto);
        actualizar.setVisible(true);
        desktopPane.add(actualizar);
        setSize(actualizar.getWidth()+20,actualizar.getHeight()+70);
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        VentanaEliminarProducto eliminar=new VentanaEliminarProducto(controladorProducto);
        eliminar.setVisible(true);
        desktopPane.add(eliminar);
        setSize(eliminar.getWidth()+20,eliminar.getHeight()+70);
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemActualizar;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemLeer;
    private javax.swing.JMenuItem itemListar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
