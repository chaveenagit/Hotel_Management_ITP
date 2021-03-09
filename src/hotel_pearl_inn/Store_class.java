/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Store_class {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
     
    public boolean addStore(String itmname,String reqammount, String crntammount,String warlvl)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `store`(`ItemName`, `RequiredAmount`, `CurrentAmount`, `WarningAmount`) VALUES (?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, itmname);
            st.setString(2, reqammount);
            st.setString(3, crntammount);
            st.setString(4, warlvl);
           
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
     public boolean editStore(int itmid,String itmname,String reqammount, String crntammount,String warlvl)
    {
        PreparedStatement st;
        String editQuery="UPDATE `store` SET `ItemName`=?,`RequiredAmount`=?,`CurrentAmount`=?,`WarningAmount`=? WHERE `Itemcode`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, itmname);
            st.setString(2, reqammount);
            st.setString(3, crntammount);
            st.setString(4, warlvl);
            st.setInt(5, itmid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
     
      //create a function to remove the selected client
     public boolean removeStore(int itmid){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `store` WHERE `Itemcode`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, itmid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
     
     public void fillStoreJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `store`";
        
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
            Logger.getLogger(Store_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
