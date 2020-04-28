
package vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends javax.swing.JPanel {
    private final Principal principal;
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

        jLabel1 = new javax.swing.JLabel();
        whatsappIcon = new javax.swing.JLabel();
        clientesLabel1 = new javax.swing.JLabel();
        logo_eventos = new javax.swing.JLabel();
        clientesLabel = new javax.swing.JLabel();
        logo_clientes = new javax.swing.JLabel();
        usuariosLabel = new javax.swing.JLabel();
        logo_usuarios = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        LSE = new javax.swing.JLabel();
        Icono_StarM = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/iconoLinkedin.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 3, -1, -1));

        whatsappIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/iconoWhatsapp.png"))); // NOI18N
        whatsappIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whatsappIconMouseClicked(evt);
            }
        });
        add(whatsappIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        clientesLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        clientesLabel1.setForeground(new java.awt.Color(0, 0, 0));
        clientesLabel1.setText("EVENTOS");
        add(clientesLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 300, -1, -1));

        logo_eventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/logoEventos.png"))); // NOI18N
        logo_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logo_eventosMouseClicked(evt);
            }
        });
        add(logo_eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        clientesLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        clientesLabel.setForeground(new java.awt.Color(0, 0, 0));
        clientesLabel.setText("CLIENTES");
        add(clientesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 300, -1, -1));

        logo_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/logoClientes.png"))); // NOI18N
        logo_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logo_clientesMouseClicked(evt);
            }
        });
        add(logo_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        usuariosLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        usuariosLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuariosLabel.setText("USUARIOS");
        add(usuariosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        logo_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/logoUsuarios.png"))); // NOI18N
        logo_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logo_usuariosMouseClicked(evt);
            }
        });
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

    private void logo_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_usuariosMouseClicked
        // TODO add your handling code here:
        ingresarausuarios();
    }//GEN-LAST:event_logo_usuariosMouseClicked

    private void logo_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_clientesMouseClicked
        // TODO add your handling code here:
        ingresaraclientes();
    }//GEN-LAST:event_logo_clientesMouseClicked

    private void whatsappIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsappIconMouseClicked
        
        try {
            if (Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI ("https://api.whatsapp.com/send?phone=573112847120&text=Excelente%20proyecto"));
                }
            }    
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_whatsappIconMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        try {
            if (Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI ("https://www.linkedin.com/in/sebastian-rodriguez-parra--/"));
                }
            }    
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jLabel1MouseClicked

    private void logo_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_eventosMouseClicked
        // TODO add your handling code here:
        ingresarCotizacion();
    }//GEN-LAST:event_logo_eventosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM;
    private javax.swing.JLabel LSE;
    private javax.swing.JLabel clientesLabel;
    private javax.swing.JLabel clientesLabel1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo_clientes;
    private javax.swing.JLabel logo_eventos;
    private javax.swing.JLabel logo_usuarios;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel usuariosLabel;
    private javax.swing.JLabel whatsappIcon;
    // End of variables declaration//GEN-END:variables
    
    
    private void regresar() {
        principal.irAInicio(this);
    }
    
    private void ingresarausuarios() {
        principal.irAUsuarios(this);
    }
    
    private void ingresaraclientes(){
        principal.irAClientes(this);
    }
    
    private void ingresarCotizacion(){
        principal.irACotizacion(this);
    }
}

