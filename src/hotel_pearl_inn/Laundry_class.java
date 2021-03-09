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

public class Laundry_class {
    
     MY_CONNECTION my_connection = new MY_CONNECTION();
    
     
    public boolean addLaundry(String lname,String roomnum,String Pickupdate, String clothtyp,String clothquantity)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `laundry`( `Name`, `RoomNumber`,`PickUpDate`, `ClothType`, `ClothQuantity`) VALUES (?,?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, lname);
            st.setString(2, roomnum);
            st.setString(3, Pickupdate);
            st.setString(4, clothtyp);
            st.setString(5, clothquantity);
            
           
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Laundry_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
     public boolean editLaundry(int clothcd,String lname,String roomnum,String Pickupdate, String clothtyp,String clothquantity)
    {
        PreparedStatement st;
        String editQuery="UPDATE `laundry` SET `Name`=?,`RoomNumber`=?,`PickUpDate`=?,`ClothType`=?,`ClothQuantity`=? WHERE `ClothID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, lname);
            st.setString(2, roomnum);
            st.setString(3, Pickupdate);
            st.setString(4, clothtyp);
            st.setString(5, clothquantity);
            st.setInt(6, clothcd);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Laundry_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
     
      //create a function to remove the selected client
     public boolean removeLaundry(int clothcd){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `laundry` WHERE `ClothID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, clothcd);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Laundry_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
     
     public void fillStoreJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `laundry`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
               
                
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Laundry_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


