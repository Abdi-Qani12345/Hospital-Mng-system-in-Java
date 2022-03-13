
package hospital;

import static hospital.SpecializationTable.spectable;
import javax.swing.JOptionPane;

public class Specialization extends javax.swing.JFrame {

    Codes co=new Codes();
    String id="";
    public void display()
    {
        
    }
    public Specialization() {
        initComponents();
        display();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSTextFieldMaterial1 = new RSMaterialComponent.RSTextFieldMaterial();
        rSTextFieldMaterial2 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSTextFieldMaterial3 = new RSMaterialComponent.RSTextFieldMaterial();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Specialization Registeration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        rSButtonIconShadow1.setBackground(new java.awt.Color(255, 0, 204));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Specialization");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 30));

        rSTextFieldMaterial1.setBackground(new java.awt.Color(102, 0, 102));
        rSTextFieldMaterial1.setPhColor(new java.awt.Color(255, 255, 255));
        rSTextFieldMaterial1.setPlaceholder("Enter Description");
        jPanel2.add(rSTextFieldMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 260, 40));

        rSTextFieldMaterial2.setBackground(new java.awt.Color(102, 0, 102));
        rSTextFieldMaterial2.setPhColor(new java.awt.Color(255, 255, 255));
        rSTextFieldMaterial2.setPlaceholder("Enter Specialization");
        jPanel2.add(rSTextFieldMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\delete.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Update.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Save.png")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\search.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        rSTextFieldMaterial3.setBackground(new java.awt.Color(102, 0, 102));
        rSTextFieldMaterial3.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldMaterial3.setPhColor(new java.awt.Color(255, 255, 255));
        rSTextFieldMaterial3.setPlaceholder("Search");
        jPanel2.add(rSTextFieldMaterial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 450, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        String oper="insert";
        String sql="Call specialization_proc(null,'"+rSTextFieldMaterial2.getText()+"','"+rSTextFieldMaterial1.getText()+"','"+oper+"')";
        co.setSql(sql);
         co.viewTable("SELECT * FROM `specialization_view` ", spectable);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         String oper="update";
        String sql="Call specialization_proc('"+id+"','"+rSTextFieldMaterial2.getText()+"','"+rSTextFieldMaterial1.getText()+"','"+oper+"')";
        co.setSql(sql);
         co.viewTable("SELECT * FROM `specialization_view` ", spectable);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        String oper="delete";
        String sql="Call specialization_proc('"+id+"','"+rSTextFieldMaterial2.getText()+"','"+rSTextFieldMaterial1.getText()+"','"+oper+"')";
        co.setSql(sql);
         co.viewTable("SELECT * FROM `specialization_view` ", spectable);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        try{
            String sql="SELECT * FROM `specialization` WHERE sp_no='"+rSTextFieldMaterial3.getText()+"'";
            co.search(sql);
            if(co.rs.next())
            {
                id=co.rs.getString("sp_no");
                rSTextFieldMaterial2.setText(co.rs.getString("sp_name"));
                rSTextFieldMaterial1.setText(co.rs.getString("description"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Specialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Specialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Specialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Specialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Specialization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial1;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial2;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial3;
    // End of variables declaration//GEN-END:variables
}
