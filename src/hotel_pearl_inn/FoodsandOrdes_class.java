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

public class FoodsandOrdes_class {
     MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a client
    public boolean addOrder(String oname, String quantity,String price, String OrderStatus)
    {
        PreparedStatement st;
        String addQuery="INSERT INTO `order_food`(`OrderName`, `Quantity`, `Price`, `OrderStatus`) VALUES (?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, oname);
            st.setString(2, quantity);
            st.setString(3, price);
            st.setString(4, OrderStatus);
            
            
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(FoodsandOrdes_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to edit the selected client
    public boolean editOrder(int oid,String oname, String quantity,String price, String OrderStatus)
    {
        PreparedStatement st;
        String editQuery="UPDATE `order_food` SET `OrderName`=?,`Quantity`=?,`Price`=?,`OrderStatus`=? WHERE `OrderID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, oname);
            st.setString(2, quantity);
            st.setString(3, price);
            st.setString(4, OrderStatus);
            st.setInt(5, oid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(FoodsandOrdes_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected client
     public boolean removeOrder(int oid){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `order_food` WHERE `OrderID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, oid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(FoodsandOrdes_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all client(Jtable)
    public void fillOrderJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `order_food`";
        
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
            Logger.getLogger(FoodsandOrdes_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
