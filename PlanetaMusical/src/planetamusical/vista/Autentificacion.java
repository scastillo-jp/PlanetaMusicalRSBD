
package planetamusical.vista;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandro Castillo P
 * valida el usuario y clave ingresados, si son correcotos muesta 
 * la ventana principal.
 */
public class Autentificacion extends javax.swing.JPanel {

    /**
     * Creates new form Autentificar
     */
    public Autentificacion() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnGuardarCuenta = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        JTextUserName = new javax.swing.JTextField();
        JPassUserClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setText("Usuario :");

        jLabel3.setText("Clave :");

        BtnGuardarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaPlanetaMusical/imagenes/confirmar-20x20.png"))); // NOI18N
        BtnGuardarCuenta.setText("Acceder");
        BtnGuardarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCuentaActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaPlanetaMusical/imagenes/close-20x20.png"))); // NOI18N
        BtnCancelar.setText("Salir");

        JTextUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTextUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextUserNameActionPerformed(evt);
            }
        });

        JPassUserClave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaPlanetaMusical/imagenes/user-login-50x50.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("BIENVENIDO AL SISTEMA DE ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaPlanetaMusical/imagenes/next-28x28.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("AUTENTIFICACIÓN PLANETA MUSICAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPassUserClave)
                            .addComponent(JTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnGuardarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JPassUserClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarCuenta)
                    .addComponent(BtnCancelar))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTextUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextUserNameActionPerformed

    private void BtnGuardarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCuentaActionPerformed
        // TODO add your handling code here:

//        Cuenta cu = new Cuenta();
//        //String Pass =new String(JPassUserClave.getPassword());
//        if (JTextUserName.getText().equals(cu.getUsername())&& JPassUserClave.equals(cu.getClave())) {
//            
//            JOptionPane.showMessageDialog(null,"Clave correcta");
//             
//            JFrame jf = new JFrame();
//            jf.pack();
//            VentanaPrincipal vp = new VentanaPrincipal();
//            vp.pack();
//            vp.setVisible(true); 
//        }else{
//            JOptionPane.showMessageDialog(null,"Ingrese Nuevamente la clave ");
//        }
        // consultar si el usuasui servicio cuetnta esta si el usuaruio persona esta disponible
        // un if para copmparar el texto ingresado en el archivo json
        // dentrp deñl if si cumple la condicion llama a la ventana principal. 
        
//        if (JTextUserName.getText() != "UserSandro" && JPassUserClave.getText()!= "1234567890") {
//            // consultar si el usuasui servicio cuetnta esta si el usuaruio persona esta disponible
//            // un if para copmparar el tecto ingresado en el archivo json 
//            // dentrp deñl if si cumple la condicion llama a la ventana principal.
//            JOptionPane.showMessageDialog(null, "Clave  correcta");
//            JFrame jf = new JFrame();
//            jf.pack();
//            VentanaPrincipal vp = new VentanaPrincipal();
//            vp.pack();
//            vp.setVisible(true);
//        }else {
//            JOptionPane.showMessageDialog(null, "Ingrese Nuevamente la clave ");
//        }
           
        String UserName1="UserSandro";
        String Clave1="1234567890";
        
        
        
        String Pass= new String(JPassUserClave.getPassword());
        if (JTextUserName.getText().equals(UserName1)&&Pass.equals(Clave1)) {
            
            JOptionPane.showMessageDialog(null, "Clave  correcta");
            JFrame jf = new JFrame();
            jf.pack();
            VentanaPrincipal vp = new VentanaPrincipal();
            vp.setVisible(true);
            vp.pack();
            
            
    
        }
        
    }//GEN-LAST:event_BtnGuardarCuentaActionPerformed
        
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardarCuenta;
    private javax.swing.JPasswordField JPassUserClave;
    private javax.swing.JTextField JTextUserName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}