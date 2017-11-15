/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Galeria;
import clases.Imagen;
import clases.ListaImagenes;
import clases.NodoD;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class FrmPrincipal extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    Galeria gestion = new Galeria();
    //FrmAgregarImagen imagen;
    Imagen imagen;
    
    //Lista de imagenes
    private List<String> listaC;
    ListaImagenes lista = new ListaImagenes();

    private double zoom = 1.0;
    public String imagenes[];
    FrmAcercaDE abrir = new FrmAcercaDE();

    /**
     * Creates new form frmEjercicioPrueba
     */
    public FrmPrincipal() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstImagenes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAgregarImagenes = new javax.swing.JMenuItem();
        btnVerImagenes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galeria Imagenes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ruta");

        txtRuta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRuta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRuta.setText("Presione el botón abrir.");
        txtRuta.setEnabled(false);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir-el-archivo-icono-8581-128.png"))); // NOI18N
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lstImagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstImagenesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lstImagenes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Ingrese el nombre de la imagen.");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Agregar Imágenes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(72, 72, 72)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        btnAgregarImagenes.setText("Agregar Imagen...");
        btnAgregarImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenesActionPerformed(evt);
            }
        });
        jMenu1.add(btnAgregarImagenes);

        btnVerImagenes.setText("Ver Imagenes");
        btnVerImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerImagenesActionPerformed(evt);
            }
        });
        jMenu1.add(btnVerImagenes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Más");

        btnAcercaDe.setText("Acerca De");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(btnAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser jfch = new JFileChooser();

        txtRuta.setText("");
        if (seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("gif") || archivo.getName().endsWith("png")) {
                    bytesImg = gestion.AbrirImagen(archivo);
                    //lblImagen.setIcon(new ImageIcon(bytesImg));
                } else {
                    JOptionPane.showMessageDialog(this, "Favor de seleccionar un archivo de texto o imagen.");
                }
                String pathFile = null;
                pathFile = seleccionado.getSelectedFile().getPath();
                txtRuta.setText(pathFile);
                imagen = new Imagen();
//                imagen.setRuta(seleccionado.getSelectedFile().toPath());
            }
            txtRuta.setForeground(Color.BLACK);
            btnAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        JFileChooser jfch= new JFileChooser();

        txtRuta.setText("");
        if(seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    try {
                        String contenido = gestion.AbrirATexto(archivo);
                       // txtAreaText.setText(contenido);
                    } catch (FileNotFoundException ex) {

                    }
                } else {
                    if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("gif")||archivo.getName().endsWith("png")){
                        bytesImg = gestion.AbrirImagen(archivo);
                        lblImagen.setIcon(new ImageIcon(bytesImg));
                    } else {
                        JOptionPane.showMessageDialog(this, "Favor de seleccionar un archivo de texto o imagen.");
                    }
                }
            }
            String pathFile= null;
            pathFile= seleccionado.getSelectedFile().getPath();
            txtRuta.setText(pathFile);
        }
        
        
        imagen= new Imagen();
        NodoD nodoNuevo;
        imagen.setTitulo(txtNombre.getText());
//        imagen.setRuta(seleccionado.getSelectedFile().toPath());
        
        nodoNuevo= new NodoD(imagen);
        lista.insertarOrden(nodoNuevo);
        limpiarTxt();
        btnAgregar.setEnabled(false);        

//Agregar a la lista de canciones
       try{
        //listaC.add(txtTitulo.getText());
        listaC.add(imagen.getTitulo());
        
        
        //ordenar lista
        listaC.lastIndexOf(nodoNuevo);
        /*for (String item : listaC) {
            txtListado.append(item + ", ");
        }
        txtListado.append("\n");*/
        
        lstImagenes.setModel(new AbstractListModel<String>(){
            @Override
            public int getSize() {
                return listaC.size();
            }

            @Override
            public String getElementAt(int i) {
                return listaC.get(i);
            }
            
        });
        } catch(java.lang.NullPointerException e){
            
        }
        limpiarTxt();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        /*if (seleccionado.showDialog(this, "Guardar Texto") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String contenido = txtAreaText.getText();
                String resp = gestion.GuardarATexto(archivo, contenido);
                if (resp != null) {
                    JOptionPane.showMessageDialog(this, resp);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar texto.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El texto se debe guardar en formato txt.");
        }*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lstImagenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstImagenesMouseClicked
        // TODO add your handling code here:
        /*cancion.setTitulo(lstCanciones.getSelectedValue());
        //Ver el primero y último en la lista
        if(lstCanciones.isSelectedIndex(0)){
            lista.irPrimero();
        } else if(lstCanciones.isSelectedIndex(WIDTH)){
            lista.irUltimo();
        }
        
        mostrarCancion();
        btnEliminar.setEnabled(true);*/
    }//GEN-LAST:event_lstImagenesMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        txtNombre.setText("");
        txtNombre.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombreMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        listaC = new ArrayList();
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAgregarImagenesActionPerformed

    private void btnVerImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerImagenesActionPerformed
        // TODO add your handling code here:
        FrmAgregarImagen ver = new FrmAgregarImagen();
        ver.setVisible(true);
    }//GEN-LAST:event_btnVerImagenesActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        abrir.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    public void limpiarTxt() {
        txtNombre.setText("");
        txtRuta.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JMenuItem btnAcercaDe;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JMenuItem btnAgregarImagenes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JMenuItem btnVerImagenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JList<String> lstImagenes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
