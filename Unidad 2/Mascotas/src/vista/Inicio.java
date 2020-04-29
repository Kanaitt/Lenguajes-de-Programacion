
package vista;

import javax.swing.table.DefaultTableModel;
import controlador.CrearMascota;
import controlador.ModificarMascotas;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JPanel {
    
    DefaultTableModel tabla;
    int filas;
    private final Principal principal;

    public Inicio(Principal principal) {
        this.principal=principal;
        initComponents();
        tabla = (DefaultTableModel) tablaVariables.getModel();
        
        tabla = new DefaultTableModel();
        tabla.addColumn("NOMBRE");
        tabla.addColumn("RAZA");
        tabla.addColumn("EDAD");
        tabla.addColumn("DUEÑO");
        tabla.addColumn("CELULAR");
        this.tablaVariables.setModel(tabla);
    }
    
    public void limpiar(){
        textNombre.setText("");
        textRaza.setText("");
        textEdad.setText("");
        textDueño.setText("");
        textCelular.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textEdad = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textRaza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textCelular = new javax.swing.JTextField();
        textDueño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVariables = new javax.swing.JTable();
        crearMascotaButtom = new javax.swing.JButton();
        modificarMascotaButtom = new javax.swing.JButton();
        borrarMascotaButtom = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel1.setText("MASCOTA");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("RAZA");

        jLabel4.setText("EDAD");

        jLabel5.setText("DUEÑO");

        textEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEdadActionPerformed(evt);
            }
        });

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRazaActionPerformed(evt);
            }
        });

        jLabel6.setText("NOMBRE");

        jLabel7.setText("CELULAR");

        textCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCelularActionPerformed(evt);
            }
        });

        textDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDueñoActionPerformed(evt);
            }
        });

        tablaVariables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVariables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVariablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVariables);

        crearMascotaButtom.setText("CREAR");
        crearMascotaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMascotaButtomActionPerformed(evt);
            }
        });

        modificarMascotaButtom.setText("MODIFICAR");
        modificarMascotaButtom.setToolTipText("");
        modificarMascotaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMascotaButtomActionPerformed(evt);
            }
        });

        borrarMascotaButtom.setText("BORRAR");
        borrarMascotaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarMascotaButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(crearMascotaButtom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarMascotaButtom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(borrarMascotaButtom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearMascotaButtom)
                    .addComponent(modificarMascotaButtom)
                    .addComponent(borrarMascotaButtom))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEdadActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRazaActionPerformed

    private void textCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCelularActionPerformed

    private void textDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDueñoActionPerformed

    private void crearMascotaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMascotaButtomActionPerformed

        String nombre = textNombre.getText();
        String raza = textRaza.getText();
        String edad = textEdad.getText();
        String duenno = textDueño.getText();
        String celular = textCelular.getText();
        
        CrearMascota crearMascota = new CrearMascota();
        String[] objectoTablaUsuario = crearMascota.Crear(nombre, raza, edad, duenno, celular);
      
        tabla.addRow(objectoTablaUsuario);
        limpiar();
       
    }//GEN-LAST:event_crearMascotaButtomActionPerformed

    private void borrarMascotaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarMascotaButtomActionPerformed
        // TODO add your handling code here:
        if (tablaVariables.getSelectedRow() != -1){
            tabla.removeRow(tablaVariables.getSelectedRow());
        }else {
            JOptionPane.showMessageDialog(null, "No has seleccionado un registro");
        }
    }//GEN-LAST:event_borrarMascotaButtomActionPerformed

    private void modificarMascotaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMascotaButtomActionPerformed
        // TODO add your handling code here:
        
        String nombre = textNombre.getText();
        String raza = textRaza.getText();
        String edad = textEdad.getText();
        String duenno = textDueño.getText();
        String celular = textCelular.getText();
        
        ModificarMascotas modificarmascota = new ModificarMascotas();
        String[] objectoTablaUsuario = modificarmascota.Crear(nombre, raza, edad, duenno, celular);
        
        for (int i = 0; i < tablaVariables.getColumnCount(); i++) {
            tabla.setValueAt(objectoTablaUsuario [i], filas, i);
            
        }
        limpiar();
    }//GEN-LAST:event_modificarMascotaButtomActionPerformed

    private void tablaVariablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVariablesMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaVariables.getSelectedRow();
        
        textNombre.setText(tablaVariables.getValueAt(seleccion, 0).toString());
        textRaza.setText(tablaVariables.getValueAt(seleccion, 1).toString());
        textEdad.setText(tablaVariables.getValueAt(seleccion, 2).toString());
        textDueño.setText(tablaVariables.getValueAt(seleccion, 3).toString());
        textCelular.setText(tablaVariables.getValueAt(seleccion, 4).toString());
        filas=seleccion;
        
    }//GEN-LAST:event_tablaVariablesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarMascotaButtom;
    private javax.swing.JButton crearMascotaButtom;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarMascotaButtom;
    private javax.swing.JTable tablaVariables;
    private javax.swing.JTextField textCelular;
    private javax.swing.JTextField textDueño;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textRaza;
    // End of variables declaration//GEN-END:variables

}
