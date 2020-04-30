
package vista;

import controlador.CotizacionCrear;
import controlador.CotizacionModificar;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class CRUDcotizacion extends javax.swing.JPanel {

    private final Principal principal;
    
    CotizacionCrear cotizacioncrear = new CotizacionCrear();
    CotizacionModificar cotizacionmodificar = new CotizacionModificar();
    
    Conexion conectar = new Conexion();
    Connection conector = Conexion.getConnection();
    
    DefaultTableModel tabla2;
    int filasCliente;
    int filasCotizacion;
    
    public CRUDcotizacion(Principal principal) {
        this.principal = principal;
        initComponents();
        listarCliente();
        listarCotizacion();
    }
    
    public void limpiar(){
        textIdCotizacion.setText("");
        textIdCliente.setText("");
        textEmpresa.setText("");
        textRepresentante.setText("");
        textCelular.setText("");
        textProyecto.setText("");
        textFechaMontaje.setText("");
        textFechaActividad.setText("");
        textCiudad.setText("");
        textPago.setText("");
        textFechaElaboracion.setText("");
        textCedulaUsuario.setText("");
        textObservacion.setText("");
       
    }
    
    void listarCliente() {
        tabla2 = new DefaultTableModel();
        tabla2.addColumn("ID");
        tabla2.addColumn("EMPRESA");
        tabla2.addColumn("REPRESENTANTE");
        tabla2.addColumn("CELULAR");
        
        this.tableCliente.setModel(tabla2);
        
        String mostrarDatos = "SELECT IdEmpresa, Empresa, Representante, Celular FROM Clientes";
        
        String datos[] = new String[4];
        
        tableCliente.getColumnModel().getColumn(0).setPreferredWidth(0);//Ancho de columna
        
        try {
            Statement st = conector.createStatement();
            ResultSet rs = st.executeQuery(mostrarDatos);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                tabla2.addRow(datos);
            }
            tableCliente.setModel(tabla2);
        } catch (SQLException e) {
            System.out.println("no se pudieron mostrar los datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
    }
    
    void listarCotizacion() {
        tabla2 = new DefaultTableModel();
        tabla2.addColumn("ID");
        tabla2.addColumn("ID EMP");
        tabla2.addColumn("EMPRESA");
        tabla2.addColumn("REPRESENTANTE");
        tabla2.addColumn("CELULAR");
        tabla2.addColumn("PROYECTO");
        tabla2.addColumn("FECHA MONTAJE");
        tabla2.addColumn("FECHA ACTIVIDAD");
        tabla2.addColumn("CIUDAD");
        tabla2.addColumn("PAGO");
        tabla2.addColumn("FECHA");
        tabla2.addColumn("CEDULA");
        tabla2.addColumn("NOMBRE");
        tabla2.addColumn("OBSERVACION");
        
        this.tableCotizacion.setModel(tabla2);
        
        String mostrarDatos = "SELECT IdCotizacion, Clientes.IdEmpresa, Clientes.Empresa, Clientes.Representante, Clientes.Celular, Proyecto, FechaMontaje ,FechaActividad Date, Ciudad, Pago, FechaElaboracion, Usuarios.Cedula, Usuarios.Nombre, Observacion FROM Cotizacion INNER JOIN Clientes ON Cotizacion.IdEmpresa = Clientes.IdEmpresa INNER JOIN Usuarios ON Cotizacion.Cedula = Usuarios.Cedula";
        
        String datos2[] = new String[14];
        
        tableCotizacion.getColumnModel().getColumn(0).setPreferredWidth(0);//Ancho de columna
        tableCotizacion.getColumnModel().getColumn(1).setPreferredWidth(45);
        
        try {
            Statement st = conector.createStatement();
            ResultSet rs = st.executeQuery(mostrarDatos);
            
            while (rs.next()){
                datos2[0]=rs.getString(1);
                datos2[1]=rs.getString(2);
                datos2[2]=rs.getString(3);
                datos2[3]=rs.getString(4);
                datos2[4]=rs.getString(5);
                datos2[5]=rs.getString(6);
                datos2[6]=rs.getString(7);
                datos2[7]=rs.getString(8);
                datos2[8]=rs.getString(9);
                datos2[9]=rs.getString(10);
                datos2[10]=rs.getString(11);
                datos2[11]=rs.getString(12);
                datos2[12]=rs.getString(13);
                datos2[13]=rs.getString(14);
                
                tabla2.addRow(datos2);
            }
            tableCotizacion.setModel(tabla2);
        } catch (SQLException e) {
            System.out.println("no se pudieron mostrar los datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
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
        tableCliente = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCotizacion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textObservacion = new javax.swing.JTextArea();
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

        tableCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableCliente);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 280, 230));

        tableCotizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCotizacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCotizacion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 1090, 260));

        textObservacion.setColumns(20);
        textObservacion.setRows(5);
        jScrollPane2.setViewportView(textObservacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 460, 80));

        botomCrearCotizacion1.setText("MODIFICAR COTIZACIÓN");
        botomCrearCotizacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botomCrearCotizacion1ActionPerformed(evt);
            }
        });
        add(botomCrearCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        botomCrearCotizacion.setText("CREAR COTIZACIÓN");
        botomCrearCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botomCrearCotizacionActionPerformed(evt);
            }
        });
        add(botomCrearCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

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

        textFechaActividad.setText("(año-mes-dia)");
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

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        // TODO add your handling code here:
        int seleccion = tableCliente.getSelectedRow();
        
        textIdCliente.setText(tableCliente.getValueAt(seleccion, 0).toString());
        textEmpresa.setText(tableCliente.getValueAt(seleccion, 1).toString());
        textRepresentante.setText(tableCliente.getValueAt(seleccion, 2).toString());
        textCelular.setText(tableCliente.getValueAt(seleccion, 3).toString());       
        filasCliente=seleccion;   
             
    }//GEN-LAST:event_tableClienteMouseClicked

    private void tableCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCotizacionMouseClicked
        // TODO add your handling code here:
       
        int seleccion = tableCotizacion.getSelectedRow();
        
        textIdCotizacion.setText(tableCotizacion.getValueAt(seleccion, 0).toString());
        textIdCliente.setText(tableCotizacion.getValueAt(seleccion, 1).toString());
        textEmpresa.setText(tableCotizacion.getValueAt(seleccion, 2).toString());
        textRepresentante.setText(tableCotizacion.getValueAt(seleccion, 3).toString());
        textCelular.setText(tableCotizacion.getValueAt(seleccion, 4).toString());  
        textProyecto.setText(tableCotizacion.getValueAt(seleccion, 5).toString());
        textFechaMontaje.setText(tableCotizacion.getValueAt(seleccion, 6).toString());
        textFechaActividad.setText(tableCotizacion.getValueAt(seleccion, 7).toString());
        textCiudad.setText(tableCotizacion.getValueAt(seleccion, 8).toString());
        textPago.setText(tableCotizacion.getValueAt(seleccion, 9).toString());
        textFechaElaboracion.setText(tableCotizacion.getValueAt(seleccion, 10).toString());
        textCedulaUsuario.setText(tableCotizacion.getValueAt(seleccion, 11).toString());
        textObservacion.setText(tableCotizacion.getValueAt(seleccion, 13).toString()); 
        filasCotizacion=seleccion;    
    }//GEN-LAST:event_tableCotizacionMouseClicked

    private void botomCrearCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botomCrearCotizacionActionPerformed
        // TODO add your handling code here:
        String IdEmpresa = textIdCliente.getText();
        String Proyecto = textProyecto.getText();
        String FechaMontaje = textFechaMontaje.getText();
        String FechaActividad = textFechaActividad.getText();
        String Ciudad = textCiudad.getText();
        String Pago = textPago.getText();
        String FechaElaboracion = textFechaElaboracion.getText();
        String Cedula = textCedulaUsuario.getText();
        String Observacion = textObservacion.getText();
        
        cotizacioncrear.crear_cotizacion(IdEmpresa, Proyecto, FechaMontaje, FechaActividad, Ciudad, Pago, FechaElaboracion, Cedula, Observacion);
        limpiar();
    }//GEN-LAST:event_botomCrearCotizacionActionPerformed

    private void botomCrearCotizacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botomCrearCotizacion1ActionPerformed
        // TODO add your handling code here:
        
        String Proyecto = textProyecto.getText();
        String FechaMontaje = textFechaMontaje.getText();
        String FechaActividad = textFechaActividad.getText();
        String Ciudad = textCiudad.getText();
        String Pago = textPago.getText();
        String FechaElaboracion = textFechaElaboracion.getText();
        String Observacion = textObservacion.getText();
        String IdCotizacion = textIdCotizacion.getText();
        
        cotizacionmodificar.modificarCotizacionBD(Proyecto, FechaMontaje, FechaActividad, Ciudad, Pago, FechaElaboracion, Observacion, IdCotizacion, IdCotizacion);
        limpiar();
    }//GEN-LAST:event_botomCrearCotizacion1ActionPerformed


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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel observacionLabel;
    private javax.swing.JLabel pagoLabel;
    private javax.swing.JLabel proyectoLabel;
    private javax.swing.JLabel representanteLabel;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTable tableCotizacion;
    private javax.swing.JTextField textCedulaUsuario;
    private javax.swing.JTextField textCelular;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JTextField textEmpresa;
    private javax.swing.JTextField textFechaActividad;
    private javax.swing.JTextField textFechaElaboracion;
    private javax.swing.JTextField textFechaMontaje;
    private javax.swing.JTextField textIdCliente;
    private javax.swing.JTextField textIdCotizacion;
    private javax.swing.JTextArea textObservacion;
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
