
package time_table_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import time_table_management_system.AddWorkingDays;
import java.sql.Statement;


public class SystemWorkingDays extends javax.swing.JFrame {

    
    public SystemWorkingDays() {
        initComponents();
        table_view();
        getidCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectidcombo = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        jTextField_nodays = new javax.swing.JTextField();
        jTextField_days = new javax.swing.JTextField();
        jTextField_whour = new javax.swing.JTextField();
        jTextField_timeslot = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectidcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectidcomboActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jToggleButton1.setText("Add Working Days and Hours");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No of Days", "Days", "Work Hours", "Time Slot"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jTextField_nodays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nodaysActionPerformed(evt);
            }
        });

        jTextField_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_daysActionPerformed(evt);
            }
        });

        jTextField_whour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_whourActionPerformed(evt);
            }
        });

        jLabel2.setText("Select ID");

        jLabel3.setText("No Of Days");

        jLabel4.setText("Days");

        jLabel5.setText("Work Hours");

        jLabel6.setText("Time Slot");

        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 152, 117));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time Table Management System");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(449, 449, 449)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_whour)
                            .addComponent(jTextField_timeslot)
                            .addComponent(jTextField_nodays)
                            .addComponent(jTextField_days)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 75, Short.MAX_VALUE))))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nodays, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_days, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_whour, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_timeslot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement show;
    PreparedStatement delete;
    PreparedStatement update;
    
    private void table_view(){
            
            int c;
                    
             try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

                show = con.prepareStatement("select * from workdays");
                ResultSet rs = show.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
                c=Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
                Df.setRowCount(0);
                
                while(rs.next()){
                    Vector v = new Vector();
                    
                    for(int a=1;a<=c;a++){
                        v.add(rs.getString("id"));
                        v.add(rs.getString("Noworkday"));
                        v.add(rs.getString("workday"));  
                        v.add(rs.getString("worktime"));
                        v.add(rs.getString("timeslot"));
                        
                    }
                    
                    Df.addRow(v);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
    private void getidCombo(){
            
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT id FROM workdays";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {      
                String id = rs.getString("id");         
                selectidcombo.addItem(rs.getString("id"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        new AddWorkingDays().setVisible(true);
       dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectidcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectidcomboActionPerformed
        // TODO add your handling code here:
         String selectedID = (String)selectidcombo.getSelectedItem();
               
             try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

                show = con.prepareStatement("select * from workdays where id = '"+selectedID+"'");
                ResultSet rs = show.executeQuery();
                               
                while (rs.next())
                {      
                   jTextField_nodays.setText(rs.getString("Noworkday"));
                   jTextField_days.setText(rs.getString("workday"));
                   jTextField_whour.setText(rs.getString("worktime"));
                   jTextField_timeslot.setText(rs.getString("timeslot"));
                }//end while        
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_selectidcomboActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
     
        String selectedIDs = (String)selectidcombo.getSelectedItem();
        

        try {
            
            int dialogres = JOptionPane.showConfirmDialog(null, "Do you want to remove "+selectedIDs+ " from the System?","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogres == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
            
            delete = con.prepareStatement("delete from workdays where id= '"+selectedIDs+"'");
            delete.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "WorkDays&Hours "+ selectedIDs +" deleted successfully!");

            new SystemWorkingDays().setVisible(true);
            dispose();
            
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTextField_nodaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nodaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nodaysActionPerformed

    private void jTextField_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_daysActionPerformed

    private void jTextField_whourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_whourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_whourActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        
        
        String selectedIDs = selectidcombo.getSelectedItem().toString();
        String noDays = jTextField_nodays.getText();
        String days = jTextField_days.getText();
        String Hours = jTextField_whour.getText();
        String tslot = jTextField_timeslot.getText();
        

        try {
            
            int dialogres = JOptionPane.showConfirmDialog(null, "Do you want to Edit "+selectedIDs+"");
            if(dialogres == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
                 
            update = con.prepareStatement("UPDATE workdays SET Noworkday = '"+ noDays +"', workday = '"+ days +"', worktime = '"+ Hours +"', timeslot = '"+ tslot +"' WHERE id = '"+selectedIDs+"'");
            update.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "WorkDays&Hours "+ selectedIDs +" Updated successfully!");

            new SystemWorkingDays().setVisible(true);
            dispose();
            
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemWorkingDays().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_days;
    private javax.swing.JTextField jTextField_nodays;
    private javax.swing.JTextField jTextField_timeslot;
    private javax.swing.JTextField jTextField_whour;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> selectidcombo;
    // End of variables declaration//GEN-END:variables

    private static class subjectlist {

        public subjectlist() {
        }
    }

    private static class AddLecturer {

        public AddLecturer() {
        }
    }
}
