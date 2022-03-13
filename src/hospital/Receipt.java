
package hospital;

import static hospital.ReceiptTable.receiptTable;
import java.sql.Date;
import javax.swing.JOptionPane;


public class Receipt extends javax.swing.JFrame {

    Codes co=new Codes();
    String id="";
    public void display()
    {
        co.fillCombo("SELECT p_no,name FROM patient", compat, "name");
        co.fillCombo("SELECT acc_no , acc_name from accounts", rSComboBox1, "acc_name");
    }
    public Receipt() {
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
        rSTextFieldMaterial2 = new RSMaterialComponent.RSTextFieldMaterial();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rSComboBox1 = new RSMaterialComponent.RSComboBox();
        jLabel8 = new javax.swing.JLabel();
        search = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        compat = new RSMaterialComponent.RSComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Receipt Registeration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

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
        jLabel5.setText("Amounts");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Receipt_Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Account_Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        rSTextFieldMaterial2.setBackground(new java.awt.Color(102, 0, 102));
        rSTextFieldMaterial2.setPhColor(new java.awt.Color(255, 255, 255));
        rSTextFieldMaterial2.setPlaceholder("Enter Amounts");
        rSTextFieldMaterial2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(rSTextFieldMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 260, 40));

        rSComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Accounts" }));
        jPanel2.add(rSComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 260, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\search.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 100, -1));

        search.setBackground(new java.awt.Color(102, 0, 102));
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setPhColor(new java.awt.Color(255, 255, 255));
        search.setPlaceholder("Search");
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 210, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\delete.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Update.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Save.png")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Patient_Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        compat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient" }));
        jPanel2.add(compat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 260, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Date d=new Date(jDateChooser1.getDate().getTime());
        String sql="Call receipt_proc(null,'"+d+"','"+rSTextFieldMaterial2.getText()
                +"',(select p_no from patient where name='"+compat.getSelectedItem()+"'),(select acc_no from accounts where acc_name='"+rSComboBox1.getSelectedItem()+"'),'insert')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `receipt_view` ", receiptTable);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         Date d=new Date(jDateChooser1.getDate().getTime());
        String sql="Call receipt_proc('"+id+"','"+d+"','"+rSTextFieldMaterial2.getText()
                +"',(select p_no from patient where name='"+compat.getSelectedItem()+"'),(select acc_no from accounts where acc_name='"+rSComboBox1.getSelectedItem()+"'),'update')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `receipt_view` ", receiptTable);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
          Date d=new Date(jDateChooser1.getDate().getTime());
        String sql="Call receipt_proc('"+id+"','"+d+"','"+rSTextFieldMaterial2.getText()
                +"',(select p_no from patient where name='"+compat.getSelectedItem()+"'),(select acc_no from accounts where acc_name='"+rSComboBox1.getSelectedItem()+"'),'delete')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `receipt_view` ", receiptTable);
    
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        String pat="";
        String acc="";
        try{
            String sql="SELECT * FROM `receipt` WHERE rec_no='"+search.getText()+"'";
            co.search(sql);
            if(co.rs.next())
            {
                id=co.rs.getString("rec_no");
                jDateChooser1.setDate(co.rs.getDate("rec_date"));
                rSTextFieldMaterial2.setText(co.rs.getString("amount"));
                pat=co.rs.getString("p_no");
                acc=co.rs.getString("acc_no");
                 try {
                    String sql1="SELECT name FROM `patient` WHERE p_no='"+pat+"'";
                    co.search(sql1);
                    if(co.rs.next()){
                    compat.setSelectedItem(co.rs.getString("name"));
                    }
                } catch (Exception e) {}
                  try {
                    String sql2="SELECT acc_name FROM `accounts` WHERE acc_no='"+acc+"'";
                    co.search(sql2);
                    if(co.rs.next()){
                    rSComboBox1.setSelectedItem(co.rs.getString("acc_name"));
                    }
                } catch (Exception e) {}
            }
            else{
                JOptionPane.showMessageDialog(null, "Xogtaada Lama Helin");
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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBox compat;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSComboBox rSComboBox1;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial2;
    private RSMaterialComponent.RSTextFieldMaterial search;
    // End of variables declaration//GEN-END:variables
}
