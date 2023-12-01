/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DatosPersonales extends javax.swing.JFrame {

    /**
     * Creates new form DatosPersonales
     */
    public DatosPersonales() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();
        lblIngresoDatos = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Datos Personales");

        lblIngresoDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblIngresoDatos.setForeground(new java.awt.Color(0, 0, 0));
        lblIngresoDatos.setText("Ingrese sus datos estudiantiles: ");

        lblCorreoElectronico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(0, 0, 255));
        lblCorreoElectronico.setText("Correo Electrónico:");

        lblCedula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 255));
        lblCedula.setText("Cédula: ");

        lblCelular.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 0, 255));
        lblCelular.setText("Celular:");

        lblClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblClave.setForeground(new java.awt.Color(0, 0, 255));
        lblClave.setText("Contraseña:");

        txtCorreoElectronico.setForeground(new java.awt.Color(204, 204, 204));

        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtCelular.setForeground(new java.awt.Color(204, 204, 204));

        txtClave.setForeground(new java.awt.Color(204, 204, 204));

        btnValidar.setText("Validar Datos");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 255));
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 255));
        lblApellido.setText("Apellido:");

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));

        txtApellido.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClave)
                            .addComponent(lblCorreoElectronico))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave)
                            .addComponent(txtCorreoElectronico)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblApellido))
                                    .addComponent(lblCelular)
                                    .addComponent(lblCedula)
                                    .addComponent(lblNombre))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtCedula)
                                    .addComponent(txtCelular)
                                    .addComponent(txtNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIngresoDatos)
                                .addGap(0, 119, Short.MAX_VALUE)))))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnValidar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblIngresoDatos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoElectronico))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClave))
                .addGap(36, 36, 36)
                .addComponent(btnValidar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:

        // Creamos el objeto a expresar
        String correo=txtCorreoElectronico.getText();
        String cedula=txtCedula.getText();
        String celular=txtCelular.getText();
        String clave=txtClave.getText();

        // Realizamos la expresión regular para validar cada campo de texto que se ingrese
        String regexCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"; //Regulamos el campo de correo
        String regexCedula = "\\d{10}"; //Regulamos el campo de cedula para que solo se ingrese 10 datos numericos
        String regexCelular = "\\d{10}"; //Regulamos el campo de celular para que solo se ingrese 10 datos numericos
        String regexClave = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; //Regulamos el campo de clave

        //Validación de cada campo por medio de un boolean
        boolean correoValido = correo.matches(regexCorreo);
        boolean cedulaValida = cedula.matches(regexCedula);
        boolean celularValido = celular.matches(regexCelular);
        boolean claveSegura = clave.matches(regexClave);

        //Mandamos a imprimir por medio de un cuadro de diálogo
        if(correoValido && cedulaValida && celularValido && claveSegura){
            JOptionPane.showMessageDialog(this, "Todos los campos ingresados son correctos"+"/n"
                +"Se ha registrado con exito :)");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Algunos de los campos ingresados son incorrectos");
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    
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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblIngresoDatos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}