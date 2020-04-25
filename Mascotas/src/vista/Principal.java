
package vista;

import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    private Inicio inicio;
    
    public Principal() {
        //initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setName("pricipalJFrame");
        setTitle("Mascotas");
        this.setBounds(0,0,1280,750);//tamaño y ubicacion
        setResizable(false);
        pack();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        iniciar();
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
private void iniciar() {
        inicio = new Inicio(this);
        inicio.setVisible(true);
        add(inicio);
        pack();
        setLocationRelativeTo(null);

    }
    
}

