
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


public class CRUDclientes extends javax.swing.JPanel {
    
    private final Principal principal;
    
    ClienteCrear clientecrear = new ClienteCrear();
    ClienteModificar clientemodificar = new ClienteModificar();
    ClienteBorrar clienteborrar = new ClienteBorrar();
    
    Conexion conectar = new Conexion();
    Connection conector = Conexion.getConnection();
    
    DefaultTableModel tabla;
    int filas;
    
    public CRUDclientes(Principal principal) {
        this.principal = principal;
        initComponents();
        listar();
    }
    
    public void limpiar(){
        empresaText.setText("");
        correoText.setText("");
        representanteText.setText("");
        cargoText.setText("");
        celularText.setText("");
        direccionText.setText("");
       
    }


        void listar() {
        tabla = new DefaultTableModel();
        tabla.addColumn("     ID");
        tabla.addColumn("EMPRESA");
        tabla.addColumn("CORREO");
        tabla.addColumn("REPRESENTANTE");
        tabla.addColumn("CARGO");
        tabla.addColumn("CELULAR");
        tabla.addColumn("DIRECCION");
        
        this.tableClientes.setModel(tabla);
        
        String mostrarDatos = "SELECT * FROM Clientes";
        
        String datos[] = new String[7];
        
        tableClientes.getColumnModel().getColumn(0).setPreferredWidth(0);//Ancho de columna
        
        try {
            Statement st = conector.createStatement();
            ResultSet rs = st.executeQuery(mostrarDatos);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                tabla.addRow(datos);
            }
            tableClientes.setModel(tabla);
        } catch (SQLException e) {
            System.out.println("no se pudieron mostrar los datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonBorrarCliente = new javax.swing.JButton();
        botonModificarCliente = new javax.swing.JButton();
        botomCrearCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        labelDireccion = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        labelRepresentante = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelEmpresa = new javax.swing.JLabel();
        idempresaText = new javax.swing.JTextField();
        direccionText = new javax.swing.JTextField();
        celularText = new javax.swing.JTextField();
        cargoText = new javax.swing.JTextField();
        representanteText = new javax.swing.JTextField();
        correoText = new javax.swing.JTextField();
        empresaText = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        Usuarios = new javax.swing.JLabel();
        LSE = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBorrarCliente.setText("BORRAR");
        botonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarClienteActionPerformed(evt);
            }
        });
        add(botonBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 110, 35));

        botonModificarCliente.setText("MODIFICAR");
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });
        add(botonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 110, 35));

        botomCrearCliente.setText("CREAR");
        botomCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botomCrearClienteActionPerformed(evt);
            }
        });
        add(botomCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 110, 35));

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 820, 230));

        labelDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("Direccion");
        add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        labelCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCelular.setForeground(new java.awt.Color(0, 0, 0));
        labelCelular.setText("Celular");
        add(labelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        labelCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(0, 0, 0));
        labelCargo.setText("Cargo");
        add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        labelRepresentante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRepresentante.setForeground(new java.awt.Color(0, 0, 0));
        labelRepresentante.setText("Representante");
        add(labelRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        labelCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        labelCorreo.setText("Correo");
        add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        labelEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        labelEmpresa.setText("Empresa");
        add(labelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));
        add(idempresaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, 30));
        add(direccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 150, 30));
        add(celularText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 150, 30));
        add(cargoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 150, 30));

        representanteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representanteTextActionPerformed(evt);
            }
        });
        add(representanteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 30));
        add(correoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 150, 30));
        add(empresaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, 30));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton1.setText("VOLVER");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Clientes.png"))); // NOI18N
        add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        regresaraHome();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void representanteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representanteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_representanteTextActionPerformed

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        // TODO add your handling code here:
        int seleccion = tableClientes.getSelectedRow();
        
        idempresaText.setText(tableClientes.getValueAt(seleccion, 0).toString());
        empresaText.setText(tableClientes.getValueAt(seleccion, 1).toString());
        correoText.setText(tableClientes.getValueAt(seleccion, 2).toString());
        representanteText.setText(tableClientes.getValueAt(seleccion, 3).toString());
        cargoText.setText(tableClientes.getValueAt(seleccion, 4).toString());
        celularText.setText(tableClientes.getValueAt(seleccion, 5).toString());
        direccionText.setText(tableClientes.getValueAt(seleccion, 6).toString());
        
        filas=seleccion;
    }//GEN-LAST:event_tableClientesMouseClicked

    private void botomCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botomCrearClienteActionPerformed
        // TODO add your handling code here:
        String empresa = empresaText.getText();
        String correo = correoText.getText();
        String representante = representanteText.getText();
        String cargo = cargoText.getText();
        String celular = celularText.getText();
        String direccion = direccionText.getText();
        
        clientecrear.crear_cliente(empresa, correo, representante, cargo, celular, direccion);
        
    }//GEN-LAST:event_botomCrearClienteActionPerformed

    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
        // TODO add your handling code here:
        String idempresa = idempresaText.getText();
        String empresa = empresaText.getText();
        String correo = correoText.getText();
        String representante = representanteText.getText();
        String cargo = cargoText.getText();
        String celular = celularText.getText();
        String direccion = direccionText.getText();
        
        clientemodificar.modificarClienteBD(idempresa, empresa, correo, representante, cargo, celular, direccion);
        limpiar();
    }//GEN-LAST:event_botonModificarClienteActionPerformed

    private void botonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarClienteActionPerformed
        // TODO add your handling code here:
        String idempresa = idempresaText.getText();
        String empresa = empresaText.getText();
        String correo = correoText.getText();
        String representante = representanteText.getText();
        String cargo = cargoText.getText();
        String celular = celularText.getText();
        String direccion = direccionText.getText();
        
        clienteborrar.borrarClienteBD(idempresa, empresa, correo, representante, cargo, celular, direccion);
        limpiar();
    }//GEN-LAST:event_botonBorrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JLabel LSE;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JButton botomCrearCliente;
    private javax.swing.JButton botonBorrarCliente;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JTextField cargoText;
    private javax.swing.JTextField celularText;
    private javax.swing.JTextField correoText;
    private javax.swing.JTextField direccionText;
    private javax.swing.JTextField empresaText;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idempresaText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelRepresentante;
    private javax.swing.JTextField representanteText;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        principal.irAInicio(this);
    }
    
    private void regresaraHome() {
        principal.irAHome(this);
    }
}
