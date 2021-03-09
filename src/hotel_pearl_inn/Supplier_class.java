package hotel_pearl_inn;

import hotel_pearl_inn.Employee_class;
import hotel_pearl_inn.MY_CONNECTION;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Supplier_class {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    public boolean addSupplier(String supname,String suptype,String phno,String city )
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `supplier`(`Supplier Name`, `Type`, `Phone Number`, `City`) VALUES (?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, supname);
            st.setString(2, suptype);
            st.setString(3, phno);
            st.setString(4, city);
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //create a function to add a client
   
    
    //create a function to edit the selected client
    public boolean editSupplier(int supid,String supname ,String suptype , String phno,String city)
    {
        PreparedStatement st;
        String editQuery="UPDATE `supplier` SET `Supplier Name`=?,`Type`=?,`Phone Number`=?,`City`=? WHERE `Supplier ID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
             st.setString(1, supname);
            st.setString(2, suptype);
            st.setString(3, phno);
            st.setString(4, city);
            st.setInt(5, supid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected client
     public boolean removeSupplier(int supid){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `supplier` WHERE `Supplier ID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, supid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all client(Jtable)
    public void fillSupplierJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `supplier`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
               
                
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
