
package vista;

import javax.swing.JOptionPane;
import controlador.ValidacionContrasenna;

public class CambioContrasenna extends javax.swing.JPanel {

    private final Principal principal;
    
    ValidacionContrasenna validacionContrasenna = new ValidacionContrasenna();

    public CambioContrasenna(Principal principal) {
        this.principal=principal;
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

        cedulaConfirmar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ingresarBotom = new javax.swing.JButton();
        cambioContrasenna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(cedulaConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 240, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("INGRESE SU CEDULA PARA CONFIRMAR IDENTIDAD");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        ingresarBotom.setText("INGRESAR");
        ingresarBotom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBotomActionPerformed(evt);
            }
        });
        add(ingresarBotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));
        add(cambioContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("INGRESE SU CONTRASEÑA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CAMBIAR CONTRASEÑA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        Icono_StarM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logopequeño.png"))); // NOI18N
        add(Icono_StarM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 150));

        fondo.setBackground(new java.awt.Color(204, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(500, 500));
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        gestioninicioe();
    }//GEN-LAST:event_salirMouseClicked

    private void ingresarBotomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBotomActionPerformed
        // TODO add your handling code here:
        String contrasenna = cambioContrasenna.getText();
        String cedula = cedulaConfirmar.getText();
        
        cambiandoContrasenna(contrasenna,cedula);
    }//GEN-LAST:event_ingresarBotomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JTextField cambioContrasenna;
    private javax.swing.JTextField cedulaConfirmar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresarBotom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables

   
    private void cambiandoContrasenna(String contrasenna, String cedula){
        if (contrasenna.equals("") || cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "no puede dejar campos vacios");
        }else{
            modelo.Usuarios datos = validacionContrasenna.cambiaContrasennaBD(contrasenna, cedula);
            
            if (datos == null){
                JOptionPane.showMessageDialog(null, "Cambio de contraseña exitoso");
                gestioninicioe();
            }
           
        }
    
    }
    
    private void gestioninicioe() {
        principal.irAInicio(this);

    }
    
    
}
