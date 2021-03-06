/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_table_management_system;

//import static com.itextpdf.text.SpecialSymbol.index;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author NISHADI
 */
public class TableStudentGroups extends javax.swing.JFrame {

    /**
     * Creates new form TableStudentGroups
     */
    public TableStudentGroups() {
        initComponents();
    }

    
      
        
     ManageStudentsGroups jtRowData = new  ManageStudentsGroups(); 
     
             
   /*    public ArrayList<Students> getStudentsList()
    {
        ArrayList<Students> studentsList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `student`";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Students students;
            while(rs.next()){
                students= new Students(rs.getInt("sId"),rs.getString("sYear"),rs.getString("sSemester"),rs.getString("sProgramme"),rs.getString("sMaiGroupNumber"),rs.getString("sSubGroupNumber"),rs.getString("sMainGroupId"),rs.getString("sSubGroupId"));
                studentsList.add(students);
                
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return studentsList;
    } 
       
       
               //display data in jTable
    public void Show_StudentTable_In_JTable(){
        ArrayList<Students> list = getStudentsList();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getSID();
            row[1] = list.get(i).getYear();
            row[2] = list.get(i).getSemester();
            row[3] = list.get(i).getProgramme();
            row[4] = list.get(i).getMainGroupNumber();
            row[5] = list.get(i).getSubGroupNumber();
            row[6] = list.get(i).getMainGroupId();
            row[7] = list.get(i).getSubGroupId();
            
            
            model.addRow(row);
            
            
        }
    }
       */
    public static void AddRowToJTable(Object[] dataRow){
                        
        try{
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/itpmnew","root","");
            
            
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM `student`";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                //data will be added until finish
                String sId = String.valueOf(rs.getInt("sID"));
                String sYear = String.valueOf(rs.getString("sYear"));
                String sSemester = String.valueOf(rs.getString("sSemester"));
                String sProgramme = String.valueOf(rs.getString("sProgramme"));
                String sMainGroupNumber = String.valueOf(rs.getString("sMaiGroupNumber"));
                String sSubGroupNumber = String.valueOf(rs.getString("sSubGroupNumber"));
                String sMainGroupId = String.valueOf(rs.getString("sMainGroupId"));
                String sSubGroupId = String.valueOf(rs.getString("sSubGroupId"));
                
                //String array forforme data into jtable
                
                String student[] = {sId,sYear,sSemester,sProgramme,sMainGroupNumber,sSubGroupNumber,sMainGroupId,sSubGroupId };
               // DefaultTableModel studentTable = (DefaultTableModel)studentTable.getModel();
                DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
                
                //add string array data into jTable
                model.addRow(student);
            }
            
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            
            
        }
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Year", "Semester", "Programme", "Main Group", "Sub Group", "Main Group ID", "Sub Group ID"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(44, 62, 80));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Groups Table");

        jToggleButton1.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
                //Display the selected row in JTexteFields
        int i = studentTable.getSelectedRow();
        TableModel model =studentTable.getModel();
       // Int sId = model.getValueAt(index, 0).toString());
      //  ManProgramme.setText(model.getValueAt(i, 3).toString());*/
        String sId =  model.getValueAt(i, 0).toString();
        String yaer = model.getValueAt(i, 1).toString();
        String semester = model.getValueAt(i, 2).toString();
        String programme = model.getValueAt(i, 3).toString();
        String mainGroupNumber = model.getValueAt(i, 4).toString();
        String subGroupNumber  = model.getValueAt(i, 5).toString();
        String sMainGroupId   = model.getValueAt(i, 6).toString();
        String subGroupId = model.getValueAt(i, 7).toString();
        
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jtRowData.ManID.setText(sId);
        jtRowData.manYear.setSelectedItem(yaer);
        jtRowData.manSemeseter.setSelectedItem(semester);
        jtRowData.ManProgramme.setText(programme);
        jtRowData.ManMainGroupNumber.setText(mainGroupNumber);
        jtRowData.ManSubGroupNumber.setText(subGroupNumber);
       // jtRowData.mainGroupID.setText(sMainGroupId);
        
        jtRowData.GroupID.setText(mainGroupNumber);
        jtRowData.subGroupID.setText(subGroupId);
        
    }//GEN-LAST:event_studentTableMouseClicked

    
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
            java.util.logging.Logger.getLogger(StudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableStudentGroups().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private static javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
