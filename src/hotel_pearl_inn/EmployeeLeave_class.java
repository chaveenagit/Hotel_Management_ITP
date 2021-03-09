/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chathu_PC
 */
public class EmployeeLeave_class {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a leave
    public boolean addEmployeeLeave(String empid,String ename, String categery,String type,String datefrom,String day, String des)
    {
        
        PreparedStatement st;
        String addQuery="INSERT INTO `emp_leave`(`EmpID`, `Name`, `Category`, `LeaveType`, `FromDate`, `DayCount`, `Description`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, empid);
            st.setString(2, ename);
            st.setString(3, categery);
            st.setString(4, type);
            st.setString(5, datefrom);
            st.setString(6, day);
            st.setString(7, des);
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
