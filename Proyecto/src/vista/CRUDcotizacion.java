
package vista;

import controlador.ClienteCrear;
import controlador.ClienteModificar;
import controlador.ClienteBorrar;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class CRUDcotizacion extends javax.swing.JPanel {

    private final Principal principal;
    
    public CRUDcotizacion(Principal principal) {
        this.principal = principal;
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tebleCliente = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCotizacion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botomCrearCotizacion1 = new javax.swing.JToggleButton();
        botomCrearCotizacion = new javax.swing.JToggleButton();
        observacionLabel = new javax.swing.JLabel();
        cedulaUsuairoLabel = new javax.swing.JLabel();
        textCedulaUsuario = new javax.swing.JTextField();
        fechaElaboracionLabel = new javax.swing.JLabel();
        textFechaElaboracion = new javax.swing.JTextField();
        textPago = new javax.swing.JTextField();
        pagoLabel = new javax.swing.JLabel();
        textCiudad = new javax.swing.JTextField();
        ciudadLabel = new javax.swing.JLabel();
        textFechaActividad = new javax.swing.JTextField();
        fechaActividadLabel1 = new javax.swing.JLabel();
        textFechaMontaje = new javax.swing.JTextField();
        fechaMontajeLabel = new javax.swing.JLabel();
        textProyecto = new javax.swing.JTextField();
        proyectoLabel = new javax.swing.JLabel();
        textCelular = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        textRepresentante = new javax.swing.JTextField();
        representanteLabel = new javax.swing.JLabel();
        textEmpresa = new javax.swing.JTextField();
        empresaLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        textIdCotizacion = new javax.swing.JTextField();
        textIdCliente = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        LSE = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tebleCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tebleCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EMPRESA", "REPRESENTANTE", "CELULAR"
            }
        ));
        jScrollPane3.setViewportView(tebleCliente);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 280, 210));

        tableCotizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID COTIZ.", "ID EMPRESA", "EMPRESA", "REPRESENTANTE", "CELULAR", "PROYECTO", "FECHA MONTAJE", "FECHA ACTIVIDAD", "CIUDAD", "PAGO", "FECHA", "CEDULA", "NOMBRE", "OBSERVACION"
            }
        ));
        jScrollPane1.setViewportView(tableCotizacion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 1100, 260));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 460, 50));

        botomCrearCotizacion1.setText("MODIFICAR COTIZACIÓN");
        add(botomCrearCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        botomCrearCotizacion.setText("CREAR COTIZACIÓN");
        add(botomCrearCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, -1));

        observacionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        observacionLabel.setForeground(new java.awt.Color(0, 0, 0));
        observacionLabel.setText("Observación");
        add(observacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        cedulaUsuairoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cedulaUsuairoLabel.setForeground(new java.awt.Color(0, 0, 0));
        cedulaUsuairoLabel.setText("Elaborado por C.C.");
        add(cedulaUsuairoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        add(textCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 150, -1));

        fechaElaboracionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaElaboracionLabel.setForeground(new java.awt.Color(0, 0, 0));
        fechaElaboracionLabel.setText("Fecha Elaboración");
        add(fechaElaboracionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        textFechaElaboracion.setText("(dd-mm-aa)");
        add(textFechaElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 150, -1));
        add(textPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 150, -1));

        pagoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pagoLabel.setForeground(new java.awt.Color(0, 0, 0));
        pagoLabel.setText("Forma de pago");
        add(pagoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, -1, -1));
        add(textCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 150, -1));

        ciudadLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ciudadLabel.setForeground(new java.awt.Color(0, 0, 0));
        ciudadLabel.setText("Ciudad de ejecución");
        add(ciudadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        textFechaActividad.setText("(dd-mm-aa)");
        add(textFechaActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, -1));

        fechaActividadLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaActividadLabel1.setForeground(new java.awt.Color(0, 0, 0));
        fechaActividadLabel1.setText("Fecha Actividad");
        add(fechaActividadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        textFechaMontaje.setText("(dd-mm-aa)");
        add(textFechaMontaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 150, -1));

        fechaMontajeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaMontajeLabel.setForeground(new java.awt.Color(0, 0, 0));
        fechaMontajeLabel.setText("Fecha Montaje");
        add(fechaMontajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        add(textProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, -1));

        proyectoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        proyectoLabel.setForeground(new java.awt.Color(0, 0, 0));
        proyectoLabel.setText("Proyecto");
        add(proyectoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));
        add(textCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, -1));

        celularLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular");
        add(celularLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));
        add(textRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, -1));

        representanteLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        representanteLabel.setForeground(new java.awt.Color(0, 0, 0));
        representanteLabel.setText("Representante");
        add(representanteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        add(textEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, -1));

        empresaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        empresaLabel.setForeground(new java.awt.Color(0, 0, 0));
        empresaLabel.setText("Empresa");
        add(empresaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        idLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("Id");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        add(textIdCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 50, -1));
        add(textIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, -1));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 810, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        regresaraHome();
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JLabel LSE;
    private javax.swing.JToggleButton botomCrearCotizacion;
    private javax.swing.JToggleButton botomCrearCotizacion1;
    private javax.swing.JLabel cedulaUsuairoLabel;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel empresaLabel;
    private javax.swing.JLabel fechaActividadLabel1;
    private javax.swing.JLabel fechaElaboracionLabel;
    private javax.swing.JLabel fechaMontajeLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel observacionLabel;
    private javax.swing.JLabel pagoLabel;
    private javax.swing.JLabel proyectoLabel;
    private javax.swing.JLabel representanteLabel;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tableCotizacion;
    private javax.swing.JTable tebleCliente;
    private javax.swing.JTextField textCedulaUsuario;
    private javax.swing.JTextField textCelular;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JTextField textEmpresa;
    private javax.swing.JTextField textFechaActividad;
    private javax.swing.JTextField textFechaElaboracion;
    private javax.swing.JTextField textFechaMontaje;
    private javax.swing.JTextField textIdCliente;
    private javax.swing.JTextField textIdCotizacion;
    private javax.swing.JTextField textPago;
    private javax.swing.JTextField textProyecto;
    private javax.swing.JTextField textRepresentante;
    // End of variables declaration//GEN-END:variables


    private void regresar() {
        principal.irAInicio(this);
    }
    
    private void regresaraHome() {
        principal.irAHome(this);
    }
}
