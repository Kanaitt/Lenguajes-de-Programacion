package vista;

import controlador.Validacion;
import modelo.Usuarios;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JPanel {

    private final Principal principal;
    Validacion validar_usuario = new Validacion();

    public Inicio(Principal principal) {
        this.principal = principal;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciarbotom = new javax.swing.JButton();
        inicio_sesion = new javax.swing.JLabel();
        password_inicio = new javax.swing.JLabel();
        usuario_inicio = new javax.swing.JLabel();
        entradausuario_inicio = new javax.swing.JTextField();
        entradapassword_inicio = new javax.swing.JPasswordField();
        Icono_StarM = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarbotom.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        iniciarbotom.setForeground(new java.awt.Color(0, 0, 0));
        iniciarbotom.setText("INCIAR");
        iniciarbotom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbotomActionPerformed(evt);
            }
        });
        add(iniciarbotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 120, 40));

        inicio_sesion.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        inicio_sesion.setForeground(new java.awt.Color(0, 0, 0));
        inicio_sesion.setText("INICIO DE SESION");
        add(inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 210, 350, 50));

        password_inicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        password_inicio.setForeground(new java.awt.Color(0, 0, 0));
        password_inicio.setText("Password");
        add(password_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 100, 50));

        usuario_inicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        usuario_inicio.setForeground(new java.awt.Color(0, 0, 0));
        usuario_inicio.setText("Usuario");
        add(usuario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 80, 50));

        entradausuario_inicio.setBackground(new java.awt.Color(255, 255, 255));
        entradausuario_inicio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        entradausuario_inicio.setForeground(new java.awt.Color(88, 88, 88));
        entradausuario_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradausuario_inicioActionPerformed(evt);
            }
        });
        add(entradausuario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 220, 50));

        entradapassword_inicio.setBackground(new java.awt.Color(255, 255, 255));
        entradapassword_inicio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        entradapassword_inicio.setForeground(new java.awt.Color(88, 88, 88));
        entradapassword_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradapassword_inicioActionPerformed(evt);
            }
        });
        add(entradapassword_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 220, 50));

        Icono_StarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logo.png"))); // NOI18N
        add(Icono_StarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 270));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void entradapassword_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradapassword_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradapassword_inicioActionPerformed

    private void iniciarbotomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbotomActionPerformed
        String user = entradausuario_inicio.getText();
        String pass = entradapassword_inicio.getText();

        iniciarSesion(user, pass);


    }//GEN-LAST:event_iniciarbotomActionPerformed

    private void entradausuario_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradausuario_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradausuario_inicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM;
    private javax.swing.JPasswordField entradapassword_inicio;
    private javax.swing.JTextField entradausuario_inicio;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton iniciarbotom;
    private javax.swing.JLabel inicio_sesion;
    private javax.swing.JLabel password_inicio;
    private javax.swing.JLabel usuario_inicio;
    // End of variables declaration//GEN-END:variables

    private void iniciarSesion(String user, String pass) {
        if (user.equals("") || pass.equals("")) {

            JOptionPane.showMessageDialog(null, "no puede dejar campos vacios");
        } else {
            Usuarios datos = validar_usuario.iniciar_sesion(user, pass);

            if (datos != null) {

                if ("123".equals(pass)) {
                    cambiarContrasennas();
                } else {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + user);

                    gestionCliente();
                }

            } else {
                JOptionPane.showMessageDialog(null, "No existe usuario...");
            }
        }
    }

    private void gestionCliente() {
        principal.irAHome(this);

    }

    private void cambiarContrasennas() {
        principal.irACambioContrasenna(this);

    }

}
