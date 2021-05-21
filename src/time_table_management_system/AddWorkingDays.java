
package time_table_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddWorkingDays extends javax.swing.JFrame {

   
    public AddWorkingDays() {
        initComponents();
         p1.setVisible(true);
         p2.setVisible(false);
         p3.setVisible(false);
         p4.setVisible(false);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pp1 = new javax.swing.JButton();
        pp2 = new javax.swing.JButton();
        pp3 = new javax.swing.JButton();
        pp4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        Noworkday = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        p1next = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        workday = new javax.swing.JCheckBox();
        monday = new javax.swing.JCheckBox();
        tuesday = new javax.swing.JCheckBox();
        wednesday = new javax.swing.JCheckBox();
        thursday = new javax.swing.JCheckBox();
        friday = new javax.swing.JCheckBox();
        saturday = new javax.swing.JCheckBox();
        p2next = new javax.swing.JButton();
        p2back = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        worktime = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        worktime2 = new javax.swing.JSpinner();
        p3next = new javax.swing.JButton();
        p3back = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        timeslot = new javax.swing.JRadioButton();
        timeslot2 = new javax.swing.JRadioButton();
        Submit = new javax.swing.JButton();
        p4back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pp1.setText("Number of Working Days Per Week");
        pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
        });
        pp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp1ActionPerformed(evt);
            }
        });

        pp2.setText("Working Days");
        pp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
        });
        pp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp2ActionPerformed(evt);
            }
        });

        pp3.setText("Working Time Per Day");
        pp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
        });
        pp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp3ActionPerformed(evt);
            }
        });

        pp4.setText("Time Slot");
        pp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
        });
        pp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
            .addComponent(pp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp1.getAccessibleContext().setAccessibleName("pp1");
        pp2.getAccessibleContext().setAccessibleName("pp2");
        pp3.getAccessibleContext().setAccessibleName("pp3");
        pp4.getAccessibleContext().setAccessibleName("pp4");

        jPanel2.setBackground(new java.awt.Color(1, 152, 117));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Time Table Management System");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        p1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p1.setPreferredSize(new java.awt.Dimension(1090, 494));

        Noworkday.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Number of Working Days Per Week");

        p1next.setText("Next");
        p1next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1next(evt);
            }
        });
        p1next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1nextActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(Noworkday, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(510, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1next, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(Noworkday, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        p2.setPreferredSize(new java.awt.Dimension(1090, 494));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Working Days");

        workday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        workday.setText("Sunday");
        workday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workdayActionPerformed(evt);
            }
        });

        monday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        monday.setText("Monday");
        monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayActionPerformed(evt);
            }
        });

        tuesday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tuesday.setText("Tuesday");
        tuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayActionPerformed(evt);
            }
        });

        wednesday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wednesday.setText("Wednesday");

        thursday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        thursday.setText("Thursday");
        thursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayActionPerformed(evt);
            }
        });

        friday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        friday.setText("Friday");
        friday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayActionPerformed(evt);
            }
        });

        saturday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saturday.setText("Saturday");

        p2next.setText("Next");
        p2next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2nextMouseClicked(evt);
            }
        });
        p2next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2nextActionPerformed(evt);
            }
        });

        p2back.setText("Back");
        p2back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2backMouseClicked(evt);
            }
        });
        p2back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addGap(0, 679, Short.MAX_VALUE)
                .addComponent(p2back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2next, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monday)
                            .addComponent(workday)
                            .addComponent(wednesday)
                            .addComponent(thursday)
                            .addComponent(friday)
                            .addComponent(saturday)
                            .addComponent(tuesday))))
                .addContainerGap(684, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(workday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wednesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thursday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(friday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saturday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        p3.setPreferredSize(new java.awt.Dimension(1090, 494));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Working Time Per Day");

        worktime.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Hours");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Minutes");

        worktime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        p3next.setText("Next");
        p3next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3nextMouseClicked(evt);
            }
        });
        p3next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3nextActionPerformed(evt);
            }
        });

        p3back.setText("Back");
        p3back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(worktime, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(worktime2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(483, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(p3back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3next, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(85, 85, 85)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(worktime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(worktime2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        p4.setPreferredSize(new java.awt.Dimension(1090, 494));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Time Slot");

        timeslot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        timeslot.setText("One hour time slots");
        timeslot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeslotActionPerformed(evt);
            }
        });

        timeslot2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        timeslot2.setText("Thirty minutes time slots ");
        timeslot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeslot2ActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        p4back.setText("Back");
        p4back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4backMouseClicked(evt);
            }
        });
        p4back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeslot2)
                            .addComponent(timeslot))))
                .addContainerGap(604, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(p4back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(timeslot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeslot2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        p1.getAccessibleContext().setAccessibleName("p1");
        p2.getAccessibleContext().setAccessibleName("p2");
        p3.getAccessibleContext().setAccessibleName("p3");
        p4.getAccessibleContext().setAccessibleName("p4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    PreparedStatement insert;
    
    private void pp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp4ActionPerformed

    private void pp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp3ActionPerformed

    private void pp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp1ActionPerformed

    private void pp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp2ActionPerformed

    private void workdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workdayActionPerformed

    private void p1nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1nextActionPerformed

    private void p3nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3nextActionPerformed

    private void timeslotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeslotActionPerformed
        // TODO add your handling code here:
        if(timeslot.isSelected()){
            timeslot2.setSelected(false);
        }
    }//GEN-LAST:event_timeslotActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        //--NO OF DAYS--
        Integer myInt1 = (Integer)Noworkday.getValue();
        String Noworkday = myInt1.toString();
        
        //--WORK DAYS--
        String workdays = "";
        
        if(workday.isSelected()){
            String myStr1 = (String)workday.getText();
            String workday = myStr1.toString();
            workdays = workdays+" "+ workday;
        }
        
        if(monday.isSelected()){
            String myStr2 = (String)monday.getText();
            String monday = myStr2.toString();
            workdays = workdays+","+ monday;
        }
        
        if(tuesday.isSelected()){
            String myStr3 = (String)tuesday.getText();
            String tuesday = myStr3.toString();
            workdays = workdays+","+ tuesday;
        }
        
        if(wednesday.isSelected()){
            String myStr4 = (String)wednesday.getText();
            String wednesday = myStr4.toString();
            workdays = workdays+","+ wednesday;
        }
        
        if(thursday.isSelected()){
            String myStr5 = (String)thursday.getText();
            String thursday = myStr5.toString();
            workdays = workdays+","+ thursday;
        }
        
        if(friday.isSelected()){
            String myStr6 = (String)friday.getText();
            String friday = myStr6.toString();
            workdays = workdays+","+ friday;
        }
        
        if(saturday.isSelected()){
            String myStr7 = (String)saturday.getText();
            String saturday = myStr7.toString();
            workdays = workdays+","+ saturday;
        }
        
        //--WORK TIME--
        
        String worktime1;
        Integer myInt2 = (Integer)worktime.getValue();   
        String worktime = myInt2.toString();
        
        Integer myInt3 = (Integer)worktime2.getValue();   
        String worktime2 = myInt3.toString();
        
        worktime1 = worktime+","+worktime2;        
        
        //---TIME SLOT--
        String timeslot1;
        if(timeslot.isSelected()) {   
                String myStr8 = (String)timeslot.getText();
                timeslot1 = myStr8.toString();
                
        }else{
            String myStr9 = (String)timeslot2.getText();
                timeslot1 = myStr9.toString();
        }
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
            
            insert = con.prepareStatement("insert into workdays(Noworkday,workday,worktime,timeslot) values(?,?,?,?)");
            insert.setString(1, Noworkday);
            insert.setString(2, workdays);
            insert.setString(3, worktime1);
            insert.setString(4, timeslot1);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Work Days & Hours Added to the System!");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddWorkingDays.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddWorkingDays.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new SystemWorkingDays().setVisible(true);
       dispose();
    }//GEN-LAST:event_SubmitActionPerformed

    private void MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClicked
            if (evt.getSource()==pp1){
                p1.setVisible(true);
                p2.setVisible(false);
                p3.setVisible(false);
                p4.setVisible(false);
            }
            
            if (evt.getSource()==pp2){
                p1.setVisible(false);
                p2.setVisible(true);
                p3.setVisible(false);
                p4.setVisible(false);
            }
            
            if (evt.getSource()==pp3){
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(true);
                p4.setVisible(false);
            } 

            if (evt.getSource()==pp4){
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(false);
                p4.setVisible(true);
            } // TODO add your handling code here:
    }//GEN-LAST:event_MouseClicked

    private void tuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesdayActionPerformed

    private void thursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thursdayActionPerformed

    private void fridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fridayActionPerformed

    private void p1next(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1next
        // TODO add your handling code here:
        if (evt.getSource()==p1next){
                p1.setVisible(false);
                p2.setVisible(true);
                p3.setVisible(false);
                p4.setVisible(false);
            }
    }//GEN-LAST:event_p1next

    private void p2nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2nextActionPerformed

    private void p2nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2nextMouseClicked
        // TODO add your handling code here:
            if (evt.getSource()==p2next){
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(true);
                p4.setVisible(false);
            }
    }//GEN-LAST:event_p2nextMouseClicked

    private void p2backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2backActionPerformed

    private void p2backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2backMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==p2back){
                p1.setVisible(true);
                p2.setVisible(false);
                p3.setVisible(false);
                p4.setVisible(false);
            }
    }//GEN-LAST:event_p2backMouseClicked

    private void p3nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3nextMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==p3next){
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(false);
                p4.setVisible(true);
            }
    }//GEN-LAST:event_p3nextMouseClicked

    private void p3backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3backMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==p3back){
                p1.setVisible(false);
                p2.setVisible(true);
                p3.setVisible(false);
                p4.setVisible(false);
            }
    }//GEN-LAST:event_p3backMouseClicked

    private void p4backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4backMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==p4back){
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(true);
                p4.setVisible(false);
            }
    }//GEN-LAST:event_p4backMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new SystemWorkingDays().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void p4backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4backActionPerformed

    private void mondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mondayActionPerformed

    private void timeslot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeslot2ActionPerformed
        // TODO add your handling code here:
        if(timeslot2.isSelected()){
            timeslot.setSelected(false);
        }
    }//GEN-LAST:event_timeslot2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddWorkingDays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWorkingDays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWorkingDays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWorkingDays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWorkingDays().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Noworkday;
    private javax.swing.JButton Submit;
    private javax.swing.JCheckBox friday;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox monday;
    private javax.swing.JPanel p1;
    private javax.swing.JButton p1next;
    private javax.swing.JPanel p2;
    private javax.swing.JButton p2back;
    private javax.swing.JButton p2next;
    private javax.swing.JPanel p3;
    private javax.swing.JButton p3back;
    private javax.swing.JButton p3next;
    private javax.swing.JPanel p4;
    private javax.swing.JButton p4back;
    private javax.swing.JButton pp1;
    private javax.swing.JButton pp2;
    private javax.swing.JButton pp3;
    private javax.swing.JButton pp4;
    private javax.swing.JCheckBox saturday;
    private javax.swing.JCheckBox thursday;
    private javax.swing.JRadioButton timeslot;
    private javax.swing.JRadioButton timeslot2;
    private javax.swing.JCheckBox tuesday;
    private javax.swing.JCheckBox wednesday;
    private javax.swing.JCheckBox workday;
    private javax.swing.JSpinner worktime;
    private javax.swing.JSpinner worktime2;
    // End of variables declaration//GEN-END:variables
}
