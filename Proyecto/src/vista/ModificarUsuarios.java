
package vista;

import controlador.UsuarioModificar;
import controlador.UsuarioBorrar;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;



public class ModificarUsuarios extends javax.swing.JPanel {

    private final Principal principal;
    
    Conexion conectar = new Conexion();
    Connection conector = Conexion.getConnection();
    
    DefaultTableModel tabla;
    int filas;
    
    UsuarioModificar modificar_usuario = new UsuarioModificar();
    UsuarioBorrar borrar_usuario = new UsuarioBorrar();
    
    
    public ModificarUsuarios(Principal principal) {
        this.principal = principal;
        initComponents();
        listar();
   
    }
        public void limpiar(){
        nombreText.setText("");
        correoText.setText("");
        cedulaText.setText("");
        cargoText.setText("");
        telefonoText.setText("");
        usuarioText.setText("");
        contraseñaText.setText("");
    }


        void listar() {
        tabla = new DefaultTableModel();
        tabla.addColumn("NOMBRE");
        tabla.addColumn("CORREO");
        tabla.addColumn("CEDULA");
        tabla.addColumn("CARGO");
        tabla.addColumn("TELEFONO");
        tabla.addColumn("USUARIO");
        tabla.addColumn("CONTRASEÑA");
        this.tablaDatos.setModel(tabla);
        
        String mostrarDatos = "SELECT * FROM Usuarios";
        
        String datos[] = new String[7];
        
        
        try {
            Statement st = conector.createStatement();
            ResultSet rs = st.executeQuery(mostrarDatos);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                tabla.addRow(datos);
            }
            tablaDatos.setModel(tabla);
        } catch (SQLException e) {
            System.out.println("no se pudieron mostrar los datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borrarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        usuarioLabel = new javax.swing.JLabel();
        contraseñaLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        cargoLabel = new javax.swing.JLabel();
        cedulaLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        contraseñaText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        cargoText = new javax.swing.JTextField();
        cedulaText = new javax.swing.JTextField();
        correoText = new javax.swing.JTextField();
        nombreText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        LSE = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrarButton.setText("BORRAR");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 100, -1));

        modificarButton.setText("MODIFICAR");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });
        add(modificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 100, -1));

        usuarioLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("Usuario");
        add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 155, -1, -1));

        contraseñaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contraseñaLabel.setForeground(new java.awt.Color(0, 0, 0));
        contraseñaLabel.setText("Contraseña");
        add(contraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 195, -1, -1));

        telefonoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        telefonoLabel.setForeground(new java.awt.Color(0, 0, 0));
        telefonoLabel.setText("Telefono");
        add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 275, -1, -1));

        cargoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cargoLabel.setForeground(new java.awt.Color(0, 0, 0));
        cargoLabel.setText("Cargo");
        add(cargoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 235, -1, -1));

        cedulaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cedulaLabel.setForeground(new java.awt.Color(0, 0, 0));
        cedulaLabel.setText("Cedula");
        add(cedulaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 195, -1, -1));

        correoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        correoLabel.setForeground(new java.awt.Color(0, 0, 0));
        correoLabel.setText("Correo");
        add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 155, -1, -1));

        nombreLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreLabel.setText("Nombre");
        add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 115, -1, -1));
        add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 150, 30));
        add(contraseñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 150, 30));
        add(telefonoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 150, 30));
        add(cargoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, 30));
        add(cedulaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, 30));
        add(correoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, 30));

        nombreText.setToolTipText("");
        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });
        add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 150, 30));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        tablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 900, 300));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton1.setText("VOLVER");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        LSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/LSE.png"))); // NOI18N
        add(LSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 640, -1, -1));

        Icono_StarM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logopequeño.png"))); // NOI18N
        add(Icono_StarM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 110, 150));

        fondo.setBackground(new java.awt.Color(204, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        regresarausuarios();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        String name = nombreText.getText();
        String email = correoText.getText();
        String cc = cedulaText.getText();
        String position = cargoText.getText();
        String cell = telefonoText.getText();
        String user = usuarioText.getText();
        String pass = contraseñaText.getText();
        
        modificar_usuario.modificarUsuariosBD(name, email, cc, position, cell, user, pass);
        limpiar();
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaDatos.getSelectedRow();
        
        nombreText.setText(tablaDatos.getValueAt(seleccion, 0).toString());
        correoText.setText(tablaDatos.getValueAt(seleccion, 1).toString());
        cedulaText.setText(tablaDatos.getValueAt(seleccion, 2).toString());
        cargoText.setText(tablaDatos.getValueAt(seleccion, 3).toString());
        telefonoText.setText(tablaDatos.getValueAt(seleccion, 4).toString());
        usuarioText.setText(tablaDatos.getValueAt(seleccion, 5).toString());
        contraseñaText.setText(tablaDatos.getValueAt(seleccion, 6).toString());
        filas=seleccion;
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        // TODO add your handling code here:
        String name = nombreText.getText();
        String email = correoText.getText();
        String cc = cedulaText.getText();
        String position = cargoText.getText();
        String cell = telefonoText.getText();
        String user = usuarioText.getText();
        String pass = contraseñaText.getText();
        
        borrar_usuario.borrarUsuariosBD(name, email, cc, position, cell, user, pass);
        
        limpiar();
    }//GEN-LAST:event_borrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JLabel LSE;
    private javax.swing.JButton borrarButton;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JTextField cargoText;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JTextField contraseñaText;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoText;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables

    private void regresar(){
        principal.irAInicio(this);
    }
    
    private void regresarausuarios(){
        principal.irAUsuarios(this);
    }
    
   
    }


