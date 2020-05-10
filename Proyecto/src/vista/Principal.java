package vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 * Sebastian Rodriguez 
 * Marlon Aponte
 */
public final class Principal extends javax.swing.JFrame {

    //RELACIONES
    private Inicio inicio;
    private Home home;
    private Usuarios usuarios;
    private CrearUsuarios crearusuarios;
    private ModificarUsuarios modificarusuarios;
    private CambioContrasenna cambioContrasenna;
    private CRUDclientes crudclientes;
    private CRUDcotizacion crudcotizacion;

    public Principal() {
        //initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setName("pricipalJFrame");
        setTitle("L. S. E. logisitc systems events");
        this.setBounds(0,0,1280,750);//tamaño y ubicacion
        setResizable(false);
        pack();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        iniciar();
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/Iconos/Logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void iniciar() {
        inicio = new Inicio(this);
        inicio.setVisible(true);
        add(inicio);
        pack();
        setLocationRelativeTo(null);

    }
    
    protected void irAHome(JPanel jPanel) {
        remove(jPanel);
        home = new Home(this);
        home.setVisible(true);
        add(home);
        pack();
        setLocationRelativeTo(null);         
    }
    
      protected void irAInicio(JPanel jPanel) {        
        remove(jPanel);
        inicio = new Inicio(this);
        inicio.setVisible(true);
        add(inicio);
        pack();
        setLocationRelativeTo(null); 
    }
      
      protected void irAUsuarios(JPanel jPanel) {        
        remove(jPanel);
        usuarios = new Usuarios(this);
        usuarios.setVisible(true);
        add(usuarios);
        pack();
        setLocationRelativeTo(null); 
    }
      
    protected void irACrearUsuarios(JPanel jPanel) {        
        remove(jPanel);
        crearusuarios = new CrearUsuarios(this);
        crearusuarios.setVisible(true);
        add(crearusuarios);
        pack();
        setLocationRelativeTo(null); 
    }
    
    protected void irAModificarUsuarios(JPanel jPanel) {        
        remove(jPanel);
        modificarusuarios = new ModificarUsuarios(this);
        modificarusuarios.setVisible(true);
        add(modificarusuarios);
        pack();
        setLocationRelativeTo(null); 
    }
    
    protected void irACambioContrasenna(JPanel jPanel) {        
        remove(jPanel);
        cambioContrasenna = new CambioContrasenna(this);
        cambioContrasenna.setVisible(true);
        add(cambioContrasenna);
        pack();
        setLocationRelativeTo(null); 
    }
    
    protected void irAClientes(JPanel jPanel) {        
        remove(jPanel);
        crudclientes = new CRUDclientes(this);
        crudclientes.setVisible(true);
        add(crudclientes);
        pack();
        setLocationRelativeTo(null); 
    }
    
    protected void irACotizacion(JPanel jPanel) {        
        remove(jPanel);
        crudcotizacion = new CRUDcotizacion(this);
        crudcotizacion.setVisible(true);
        add(crudcotizacion);
        pack();
        setLocationRelativeTo(null); 
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
