
package hotel_pearl_inn;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chathu_PC
 */
public class Employee_class {
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    //create a function to add a employee
    public boolean addEmployee(String name,String Address, String email,String Tele,String Gender,String DOB, String exp, String Desg,String Dep, String Basicsal,String EmpType)
    {
        
        PreparedStatement st;
        String addQuery="INSERT INTO `employee`(`Name`, `Address`, `Email`, `Telephone`,`Gender`,`DOB`, `Experience`, `Designation`, `Department`, `BasicSalary`,`EmployeeType`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            st=my_connection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, name);
            st.setString(2, Address);
            st.setString(3, email);
            st.setString(4, Tele);
            st.setString(5, Gender);
            st.setString(6, DOB);
            st.setString(7, exp);
            st.setString(8, Desg);
            st.setString(9, Dep);
            st.setString(10, Basicsal);
            st.setString(11, EmpType);
            
            
            
            
            return (st.executeUpdate() > 0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to edit the selected employee
    public boolean editEmployee(int empid,String name,String Address, String email,String Tele,String Gender,String DOB, String exp, String Desg,String Dep, String Basicsal,String EmpType)
    {
        PreparedStatement st;
        String editQuery="UPDATE `employee` SET `Name`=?,`Address`=?,`Email`=?,`Telephone`=?,`Gender`=?,`DOB`=?,`Experience`=?,`Designation`=?,`Department`=?,`BasicSalary`=?,`EmployeeType`=? WHERE `EmpID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, name);
            st.setString(2, Address);
            st.setString(3, email);
            st.setString(4, Tele);
            st.setString(5, Gender);
            st.setString(6, DOB);
            st.setString(7, exp);
            st.setString(8, Desg);
            st.setString(9, Dep);
            st.setString(10, Basicsal);
            st.setString(11, EmpType);
            st.setInt(12, empid);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    //create a function to remove the selected employee
     public boolean removeEmployee(int EmpID){
         PreparedStatement st;
         String deleteQuery="DELETE FROM `employee` WHERE `EmpID`=?";
        
        try {
            st=my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, EmpID);
            
            return (st.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     }
    //create a function to return a list of all employee(Jtable)
    public void fillEmployeeJTable(JTable table){
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT * FROM `employee`";
        
        
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs= ps.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[12];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
               row[11] = rs.getString(12);
                
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
