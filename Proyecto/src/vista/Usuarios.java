
package vista;

public class Usuarios extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form Usuarios
     * @param principal
     */
    public Usuarios(Principal principal) {
        this.principal = principal;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modificarUsuariosText = new javax.swing.JLabel();
        crearUSuariosText = new javax.swing.JLabel();
        crearUsuarios = new javax.swing.JLabel();
        modificarUsuarios = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Usuarios = new javax.swing.JLabel();
        LSE = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuariosText.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        modificarUsuariosText.setForeground(new java.awt.Color(0, 0, 0));
        modificarUsuariosText.setText("EDICIÓN DE USUARIOS");
        add(modificarUsuariosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 270, -1));

        crearUSuariosText.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        crearUSuariosText.setForeground(new java.awt.Color(0, 0, 0));
        crearUSuariosText.setText("CREACIÓN DE USUARIOS");
        add(crearUSuariosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        crearUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/crear_usuarios.png"))); // NOI18N
        crearUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                crearUsuariosMouseMoved(evt);
            }
        });
        crearUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUsuariosMouseClicked(evt);
            }
        });
        add(crearUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 180, -1));

        modificarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/modificar_usuarios.png"))); // NOI18N
        modificarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarUsuariosMouseClicked(evt);
            }
        });
        add(modificarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 180, -1));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton1.setText("VOLVER");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Usuarios2.png"))); // NOI18N
        add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        regresaraHome();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void crearUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuariosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_crearUsuariosMouseMoved

    private void crearUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuariosMouseClicked
        // TODO add your handling code here:
        pasaracrearusuario();
    }//GEN-LAST:event_crearUsuariosMouseClicked

    private void modificarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUsuariosMouseClicked
        pasaramodificarusuario();
    }//GEN-LAST:event_modificarUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JLabel LSE;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JLabel crearUSuariosText;
    private javax.swing.JLabel crearUsuarios;
    private javax.swing.JLabel fondo;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel modificarUsuarios;
    private javax.swing.JLabel modificarUsuariosText;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
    
    private void regresar() {
        principal.irAInicio(this);
    }
    
    private void regresaraHome() {
        principal.irAHome(this);
    }
    
    private void pasaracrearusuario(){
        principal.irACrearUsuarios(this);
    }
    
    protected void pasaramodificarusuario(){
        principal.irAModificarUsuarios(this);
    }
}

