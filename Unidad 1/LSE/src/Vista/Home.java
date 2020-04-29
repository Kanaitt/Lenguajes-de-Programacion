package Vista;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        initComponents();
        this.setTitle("L. S. E. logisitc systems events");
        this.setBounds(0,0,1280,750);//tamaño y ubicacion
        this.setVisible(true);//visibilidad de la interfaz
        this.setLocationRelativeTo(null);//aparezca en el centro
        this.setResizable(false);//Modificar el tamaño de la interfaz*/
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
        jPanel1 = new javax.swing.JPanel();
        Icono_StarM = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarbotom.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        iniciarbotom.setForeground(new java.awt.Color(0, 0, 0));
        iniciarbotom.setText("INCIAR");
        getContentPane().add(iniciarbotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 120, 40));

        inicio_sesion.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        inicio_sesion.setForeground(new java.awt.Color(0, 0, 0));
        inicio_sesion.setText("INICIO DE SESION");
        getContentPane().add(inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 210, 350, 50));

        password_inicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        password_inicio.setForeground(new java.awt.Color(0, 0, 0));
        password_inicio.setText("Password");
        getContentPane().add(password_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 100, 50));

        usuario_inicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        usuario_inicio.setForeground(new java.awt.Color(0, 0, 0));
        usuario_inicio.setText("Usuario");
        getContentPane().add(usuario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 80, 50));

        entradausuario_inicio.setBackground(new java.awt.Color(255, 255, 255));
        entradausuario_inicio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        entradausuario_inicio.setForeground(new java.awt.Color(0, 0, 0));
        entradausuario_inicio.setText("Usuario");
        getContentPane().add(entradausuario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 220, 50));

        entradapassword_inicio.setBackground(new java.awt.Color(255, 255, 255));
        entradapassword_inicio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        entradapassword_inicio.setForeground(new java.awt.Color(0, 0, 0));
        entradapassword_inicio.setText("Contraseña");
        entradapassword_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradapassword_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(entradapassword_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 220, 50));

        jPanel1.setBackground(new java.awt.Color(9, 98, 202));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(7, 0, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 140, 370, 440));

        Icono_StarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/Iconos/Logo.png"))); // NOI18N
        getContentPane().add(Icono_StarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 270));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradapassword_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradapassword_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradapassword_inicioActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono_StarM;
    private javax.swing.JPasswordField entradapassword_inicio;
    private javax.swing.JTextField entradausuario_inicio;
    private javax.swing.JButton iniciarbotom;
    private javax.swing.JLabel inicio_sesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password_inicio;
    private javax.swing.JLabel usuario_inicio;
    // End of variables declaration//GEN-END:variables
}
