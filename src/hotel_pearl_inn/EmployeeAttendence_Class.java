/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu_PC
 */
public class EmployeeAttendence_Class {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a client
    public boolean addEmployeeAttendence(String date, String empName,String status,String timeSatus)
    {
        
        PreparedStatement st;
        
        String addQuery="INSERT INTO `emp_attendance`(`date`, `empName`, `status`, `timeStatus`) VALUES (?,?,?,?)";
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            
            st.setString(1, date);
            st.setString(2, empName);
            st.setString(3, status);
            st.setString(4, timeSatus);
            
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
     //create a function to return a list of all employee(Jtable)
    public void fillEmployeeAttendanceJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `emp_attendance`";
        
        
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                
                
                
                tablemodel.addRow(row);
                   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillEmployeeJTableSearch(JTable table){
        Connection conn = my_connection.createConnection();
        
        
    }
    
}
