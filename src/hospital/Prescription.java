
package hospital;

import static hospital.PrescriptionTable.prescription;
import javax.swing.JOptionPane;


public class Prescription extends javax.swing.JFrame {

    Codes co =new Codes();
    String id="";
    public void display()
    {
        co.fillCombo("SELECT em_no , name from employee",  visitCombox, "name");
    }
    
    public Prescription() {
        initComponents();
        display();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonIconShadow2 = new RSMaterialComponent.RSButtonIconShadow();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        prename = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel7 = new javax.swing.JLabel();
        visitCombox = new RSMaterialComponent.RSComboBox();
        jLabel5 = new javax.swing.JLabel();
        description = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconShadow2.setBackground(new java.awt.Color(255, 0, 204));
        rSButtonIconShadow2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconShadow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconShadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Checkment Registeration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pres_Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        prename.setBackground(new java.awt.Color(102, 0, 102));
        prename.setColorMaterial(new java.awt.Color(255, 255, 255));
        prename.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        prename.setPhColor(new java.awt.Color(255, 255, 255));
        prename.setPlaceholder("Enter Prescription");
        prename.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(prename, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\delete.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Update.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\Save.png")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AbdiQani\\Downloads\\search.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        txtsearch.setBackground(new java.awt.Color(102, 0, 102));
        txtsearch.setForeground(new java.awt.Color(0, 0, 0));
        txtsearch.setColorMaterial(new java.awt.Color(255, 255, 255));
        txtsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtsearch.setPhColor(new java.awt.Color(255, 255, 255));
        txtsearch.setPlaceholder("Search");
        txtsearch.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doctor");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));

        visitCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Visit" }));
        jPanel2.add(visitCombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 260, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrition");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));

        description.setBackground(new java.awt.Color(102, 0, 102));
        description.setColorMaterial(new java.awt.Color(255, 255, 255));
        description.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        description.setPhColor(new java.awt.Color(255, 255, 255));
        description.setPlaceholder("Enter Description");
        description.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 450, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconShadow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_rSButtonIconShadow2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        
        String sql ="call prescription_proc('"+id+"','"+prename.getText()+"','"+description.getText()+"',(SELECT v_no FROM employee e, visit v WHERE v.em_no=e.em_no and name='"+visitCombox.getSelectedItem()+"'),'delete')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `prescription_view1` ", prescription);
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
               String sql ="call prescription_proc('"+id+"','"+prename.getText()+"','"+description.getText()+"',(SELECT v_no FROM employee e, visit v WHERE v.em_no=e.em_no and name='"+visitCombox.getSelectedItem()+"'),'update')";

//            String sql ="call prescription_proc('"+id+"''"+prename.getText()+"','"+description.getText()+"',(select em_no from employee where name"
//        + "='"+visitCombox.getSelectedItem()+"'),'update')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `prescription_view1` ", prescription);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        //        String oper="insert";
        
   //     String sql="call daawo(null,(SELECT v_no FROM employee e, visit v WHERE v.em_no_fk=e.em_no and em_name='"+txt1.getSelectedItem()+"'),'"+txt2.getText()+"','"+txt3.getText()+"','insert')";
      // co.setSql(sql);
        
       String sql ="call prescription_proc(null,'"+prename.getText()+"','"+description.getText()+"',(SELECT v_no FROM employee e, visit v WHERE v.em_no=e.em_no and name='"+visitCombox.getSelectedItem()+"'),'insert')";
        co.setSql(sql);
        co.viewTable("SELECT * FROM `prescription_view1` ", prescription);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
          String f = "";
       try{
            String sql="SELECT * FROM `prescription` WHERE pr_no='"+txtsearch.getText()+"'";
            co.search(sql);
            if(co.rs.next()){
                id=co.rs.getString("pr_no");
                id = co.rs.getString("pr_no");
                 prename.setText(co.rs.getString("pres_name"));
                description.setText(co.rs.getString("descrition"));
              
                try {
                        
                    
                   String sql2=" SELECT name FROM employee e, visit v,prescription p WHERE v.em_no=e.em_no and p.v_no=v.v_no and pr_no='"+id+"' ";
                    co.search(sql2);
                    if(co.rs.next()){
                        
                        visitCombox.setSelectedItem(co.rs.getString("_name"));
               
                    }
                
                
                }catch(Exception ex) { }

            }
       
       
       }catch(Exception ex) { }
//        
//        
//        
//        String pr="";
//        try{
//            String sql="SELECT * FROM `prescription` WHERE pr_no='"+txtsearch.getText()+"'";
//            co.search(sql);
//            if(co.rs.next()){
//                id=co.rs.getString("pr_no");
//                prename.setText(co.rs.getString("pres_name"));
//                description.setText(co.rs.getString("descrition"));
//                pr=co.rs.getString("em_no");
//                
////                try {
////                    String sql1="SELECT cat_name FROM `categories` WHERE cat_no='"+cat+"'";
////                    co.search(sql1);
////                    if(co.rs.next()){
////                    catCombox.setSelectedItem(co.rs.getString("cat_name"));
////                    }
//                    
//                    
//                try {
//                    String sql1="SELECT name FROM `employee` WHERE em_no='"+pr+"'";
//                    co.search(sql1);
//                    if(co.rs.next()){
//                        visitCombox.setSelectedItem(co.rs.getString("name"));
//                    }
//                }catch(Exception e){}
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "Xogtaada Lama Helin");
//            }
//        }catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
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
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSTextFieldMaterial prename;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow2;
    private RSMaterialComponent.RSTextFieldMaterial txtsearch;
    private RSMaterialComponent.RSComboBox visitCombox;
    // End of variables declaration//GEN-END:variables
}
