
package hospital;

import javax.swing.JOptionPane;


public class Forget extends javax.swing.JFrame {

  Codes co=new Codes();
  public void display()
  {
      
  }
    public Forget() {
        initComponents();
        display();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        question = new RSMaterialComponent.RSTextFieldMaterial();
        answer = new RSMaterialComponent.RSTextFieldMaterial();
        username = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialGradientOne1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        email = new RSMaterialComponent.RSTextFieldMaterial();
        password = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Forget FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        rSButtonIconShadow1.setBackground(new java.awt.Color(255, 0, 153));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 100));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USERNAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PASSWORD");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sec-Question");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 30));

        question.setBackground(new java.awt.Color(102, 0, 102));
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setCaretColor(new java.awt.Color(255, 255, 255));
        question.setColorMaterial(new java.awt.Color(255, 255, 255));
        question.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        question.setPhColor(new java.awt.Color(255, 255, 255));
        question.setPlaceholder("Secret_Question");
        question.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        answer.setBackground(new java.awt.Color(102, 0, 102));
        answer.setForeground(new java.awt.Color(255, 255, 255));
        answer.setCaretColor(new java.awt.Color(255, 255, 255));
        answer.setColorMaterial(new java.awt.Color(255, 255, 255));
        answer.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        answer.setPhColor(new java.awt.Color(255, 255, 255));
        answer.setPlaceholder("Answer");
        answer.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        username.setBackground(new java.awt.Color(102, 0, 102));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        username.setColorMaterial(new java.awt.Color(255, 255, 255));
        username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username.setPhColor(new java.awt.Color(255, 255, 255));
        username.setPlaceholder("User-Name");
        username.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        rSButtonMaterialGradientOne1.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        rSButtonMaterialGradientOne1.setText("OK");
        rSButtonMaterialGradientOne1.setColorPrimario(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne1.setColorPrimarioHover(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne1.setColorSecundario(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne1.setColorSecundarioHover(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButtonMaterialGradientOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialGradientOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialGradientOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, -1));

        rSButtonMaterialGradientOne2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        rSButtonMaterialGradientOne2.setText("Search");
        rSButtonMaterialGradientOne2.setColorPrimario(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne2.setColorPrimarioHover(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne2.setColorSecundario(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne2.setColorSecundarioHover(new java.awt.Color(102, 0, 102));
        rSButtonMaterialGradientOne2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButtonMaterialGradientOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialGradientOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialGradientOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, -1));

        email.setBackground(new java.awt.Color(102, 0, 102));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setCaretColor(new java.awt.Color(255, 255, 255));
        email.setColorMaterial(new java.awt.Color(255, 255, 255));
        email.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        email.setPhColor(new java.awt.Color(255, 255, 255));
        email.setPlaceholder("Email");
        email.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(102, 0, 102));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setColorMaterial(new java.awt.Color(255, 255, 255));
        password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        password.setPhColor(new java.awt.Color(255, 255, 255));
        password.setPlaceholder("Password");
        password.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void rSButtonMaterialGradientOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialGradientOne1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="SELECT * FROM `login` WHERE Answer='"+answer.getText()+ "' and email='"+email.getText()+"'";
            co.search(sql);
            if(username.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "UserName Is Required ");
            if(co.rs.next()){
                password.setText(co.rs.getString("password"));
                
            }
            else if(answer.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Answer Field Must Not Empty ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Foundn This Answer ");
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }//GEN-LAST:event_rSButtonMaterialGradientOne1ActionPerformed

    private void rSButtonMaterialGradientOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialGradientOne2ActionPerformed
        // TODO add your handling code here:
            try{
            String sql="SELECT * FROM users WHERE username ='"+username.getText()+"'";
            co.search(sql);
            if(username.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "UserName Is Required!!");
            if(co.rs.next()){
                email.setText(co.rs.getString("email"));
                question.setText(co.rs.getString("Sec_qu"));
                answer.setEditable(true);
            }
            else if(username.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "User Field Must Not Empty!");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Found This Username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_rSButtonMaterialGradientOne2ActionPerformed

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
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial answer;
    private RSMaterialComponent.RSTextFieldMaterial email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSTextFieldMaterial password;
    private RSMaterialComponent.RSTextFieldMaterial question;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne2;
    private RSMaterialComponent.RSTextFieldMaterial username;
    // End of variables declaration//GEN-END:variables
}
