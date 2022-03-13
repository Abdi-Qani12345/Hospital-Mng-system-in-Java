
package hospital;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
//import net.proteanit.sql.DbUtils;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JRDesignQuery;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JRDesignQuery;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JRDesignQuery;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;
public class Codes {
    Connection con;
    Statement std;
    CallableStatement cs;
 public   ResultSet rs;
    public void getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            std=con.createStatement();
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void setSql(String sql){
        
        try{
             getConnection();
             rs=std.executeQuery(sql);
             if(rs.next())
                 JOptionPane.showMessageDialog(null, rs.getString("msg"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      
    }
    public void viewTable(String sql, JTable table){
        try{
            getConnection();
            rs=std.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ResultSet search(String sql){
         try{
            getConnection();
            rs=std.executeQuery(sql);
             }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
    
    public void fillCombo(String sql, JComboBox box, String field){
         try{
            getConnection();
            rs=std.executeQuery(sql);
            while(rs.next())
          box.addItem(rs.getString(field));
            con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void Call(String st){
        try{
        cs=con.prepareCall(st);
        rs=cs.executeQuery();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
       public void report(String path, String sql){
        try{
            getConnection();          
JasperDesign design=JRXmlLoader.load(path);
JRDesignQuery query=new JRDesignQuery();
query.setText(sql);
design.setQuery(query);
JasperReport report=JasperCompileManager.compileReport(design);
JasperPrint pr=JasperFillManager.fillReport(report,null,con);
JasperViewer.viewReport(pr, false);
     }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    
}

//    void fillCombo(String select_Name_as_reader_from_readers_order_, JTextField txtdes, String reader) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
