 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Chathu_PC
 */
public class Suppliers extends javax.swing.JFrame {

    Supplier_class s = new Supplier_class();
    public Suppliers() {
        initComponents();
        
         //populate the jtable
        s.fillSupplierJTable(jTable1);
        jTextFieldsupid.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldsupname = new javax.swing.JTextField();
        jTextFieldsuptype = new javax.swing.JTextField();
        jTextFieldphno = new javax.swing.JTextField();
        jTextFieldcity = new javax.swing.JTextField();
        jButtonadd = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonref = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldsupid = new javax.swing.JTextField();
        jButtonexprt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Supplier");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Supplier Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Supplier Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("City");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Supplier Name", "Supplier Typel", "Phone Number", "City"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}

    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jTextFieldsupname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextFieldsupnameActionPerformed(evt);
        }
    });

    jTextFieldphno.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextFieldphnoKeyTyped(evt);
        }
    });

    jButtonadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonadd.setText("Add");
    jButtonadd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonaddActionPerformed(evt);
        }
    });

    jButtonupdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonupdate.setText("Update");
    jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonupdateActionPerformed(evt);
        }
    });

    jButtondelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtondelete.setText("Delete");
    jButtondelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtondeleteActionPerformed(evt);
        }
    });

    jButtonclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonclear.setText("Clear Fields");
    jButtonclear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonclearActionPerformed(evt);
        }
    });

    jButtonref.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonref.setText("Refresh");
    jButtonref.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonrefActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel6.setText("Supplier ID");

    jButtonexprt.setText("Export");
    jButtonexprt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonexprtActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(jButtonupdate)
                    .addGap(97, 97, 97)
                    .addComponent(jButtondelete))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jTextFieldsuptype, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldphno, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldcity, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldsupid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldsupname, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(487, 487, 487)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonexprt)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonref, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(33, 33, 33))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldsupid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldsupname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldsuptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(51, 51, 51)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(80, 80, 80)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonexprt)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonref)
                    .addGap(29, 29, 29))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
       //get data from the fields
        String supname= jTextFieldsupname.getText();
        String suptype= jTextFieldsuptype.getText();
        String phno= jTextFieldphno.getText();
        String city= jTextFieldcity.getText();
        
        if(supname.trim().equals("")|| suptype.trim().equals("")|| phno.trim().equals("")|| city.trim().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            }else{
                if(s.addSupplier( supname, suptype, phno, city )){
                JOptionPane.showMessageDialog(rootPane, "New Supplier Added Successfully", "Add Supplier", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Supplier not Added", "Add Supplier Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    
        
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
       //get data from the fields
        int supid = 0;
        String supname= jTextFieldsupname.getText();
        String suptype= jTextFieldsuptype.getText();
        String phno= jTextFieldphno.getText();
        String city= jTextFieldcity.getText();
        
        if(supname.trim().equals("")|| suptype.trim().equals("")|| phno.trim().equals("")|| city.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "All Fields are Required", "Empty Fields", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                supid = Integer.valueOf(jTextFieldsupid.getText()); 
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Employee ID(number)","Employee ID Error ", JOptionPane.WARNING_MESSAGE);
            }
        }
            if(s.editSupplier( supid, supname , suptype ,  phno, city)){
            JOptionPane.showMessageDialog(rootPane, "Supplier Updateded Successfully", "Updateded Supplier", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Supplier not Updateded", "Updateded Supplier Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        //get the selected raw indexes
        int rIndex = jTable1.getSelectedRow();
        
        //display data
        jTextFieldsupid.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldsupname.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldsuptype.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldphno.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldcity.setText(model.getValueAt(rIndex, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // delete the selected client
        try{
               int supid = Integer.valueOf(jTextFieldsupid.getText()); 
               
               if(s.removeSupplier(supid)){
                    JOptionPane.showMessageDialog(rootPane, "Supplier Removed Successfully", "Remove Supplier", JOptionPane.INFORMATION_MESSAGE);
               }else{
                    JOptionPane.showMessageDialog(rootPane, "Supplier not Remved", "Removed Supplier Error", JOptionPane.ERROR_MESSAGE);
            
        }
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Supplier ID(number)","Supplier ID Error ", JOptionPane.WARNING_MESSAGE);
            }
       
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
         // remove text from all the jtextboxes
        jTextFieldsupid.setText("");
        jTextFieldsupname.setText("");
        jTextFieldsuptype.setText("");
        jTextFieldphno.setText("");        
        jTextFieldcity.setText("");   
        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefActionPerformed
           //clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"supid", "supname", "suptype", "phno", "city"} ));
        
        //populate the jtable
        s.fillSupplierJTable(jTable1);
    }//GEN-LAST:event_jButtonrefActionPerformed

    private void jTextFieldsupnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsupnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsupnameActionPerformed

    private void jTextFieldphnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldphnoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldphnoKeyTyped

    private void jButtonexprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexprtActionPerformed
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;
        
        JFileChooser excelfilecChooser = new JFileChooser("C:\\Users\\Administrator\\Downloads");
        excelfilecChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls","xlsx","xlsm");
        excelfilecChooser.setFileFilter(fnef);
        int excelchoocer =  excelfilecChooser.showSaveDialog(null);
        
        if(excelchoocer == JFileChooser.APPROVE_OPTION){
            
            try {
                //Employee_class excelJTableExporter = new Employee_class();
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                for(int i = 0; i <jTable1.getRowCount(); i++){
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for(int j = 0; j< jTable1.getColumnCount(); j++){
                        XSSFCell excelCell = excelRow.createCell(j);
                        
                        excelCell.setCellValue(jTable1.getValueAt(i,j).toString());
                        
                    }
                }   
                excelFOU = new FileOutputStream(excelfilecChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null,"Exported Successfully ");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try { 
                    if(excelBOU != null){
                        excelBOU.close();
                    }
                    if(excelFOU != null){
                        excelFOU.close();
                    }
                    if(excelJTableExporter != null){
                        excelJTableExporter.close();
                    }
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButtonexprtActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonexprt;
    private javax.swing.JButton jButtonref;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldcity;
    private javax.swing.JTextField jTextFieldphno;
    private javax.swing.JTextField jTextFieldsupid;
    private javax.swing.JTextField jTextFieldsupname;
    private javax.swing.JTextField jTextFieldsuptype;
    // End of variables declaration//GEN-END:variables

   
}
