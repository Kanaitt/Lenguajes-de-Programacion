
package vista;

public class Home extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form Home
     * @param principal
     */
    public Home(Principal principal) {
        this.principal = principal;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        logo_usuarios = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        LSE = new javax.swing.JLabel();
        Icono_StarM = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jToggleButton1.setText("USUARIOS");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 140, -1));

        logo_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logo_usuarios.png"))); // NOI18N
        add(logo_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 220, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 640, -1, -1));

        LSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/LSE.png"))); // NOI18N
        add(LSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        LSE.getAccessibleContext().setAccessibleName("LSE");

        Icono_StarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logopequeño.png"))); // NOI18N
        add(Icono_StarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 110, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        ingresarausuarios();
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM;
    private javax.swing.JLabel LSE;
    private javax.swing.JLabel fondo;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel logo_usuarios;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
    
    
    private void regresar() {
        principal.irAInicio(this);
    }
    private void ingresarausuarios() {
        principal.irAUsuarios(this);
    }
}
