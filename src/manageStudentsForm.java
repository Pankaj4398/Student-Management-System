
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankaj
 */
public class manageStudentsForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentsForm
     */
    student std = new student();
    DefaultTableModel model;
    public manageStudentsForm() {
        initComponents();
        std.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLACK);
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jDateChooserBirthDate = new javax.swing.JFormattedTextField();
        jButtonRemoveStudent = new javax.swing.JButton();
        jButtonAddStudent = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_STD_ID = new javax.swing.JTextField();
        jButtonEditStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Val_Find = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Last Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Sex :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Birth Date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Phone :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Address :");

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNameActionPerformed(evt);
            }
        });

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jRadioButtonMale.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButtonMale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButtonFemale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonFemale.setText("Female");

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Address);

        jDateChooserBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jDateChooserBirthDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRemoveStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel (1).png"))); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonRemoveStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemoveStudent.setIconTextGap(8);
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/299068-32.png"))); // NOI18N
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonAddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAddStudent.setIconTextGap(8);
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("YYYY-MM-DD");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Id:");

        jTextField_STD_ID.setEditable(false);
        jTextField_STD_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_STD_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_STD_IDActionPerformed(evt);
            }
        });

        jButtonEditStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_Compose_1891025.png"))); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonEditStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEditStudent.setIconTextGap(8);
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "BirthDate", "Phone", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField_Val_Find.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Val_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Enter Value To Search :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMale)
                                        .addGap(25, 25, 25)
                                        .addComponent(jRadioButtonFemale))
                                    .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_STD_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonFemale)
                                .addComponent(jRadioButtonMale)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6))
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // Allow Only Numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
        if(jTextField_STD_ID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Student Selected");
        }else{
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
        std.fillStudentJtable(jTable1, "");
        jTable1.setModel(new DefaultTableModel(null ,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
        MainForm.jLabel_StdCount.setText("Student Count = "+Integer.toString(MyFunction.countData("student")));
        
        jTextField_STD_ID.setText("");
        jTextArea_Address.setText("");
        jTextField_FName.setText("");
        jTextField_LName.setText("");
        jTextField_Phone.setText("");
        jRadioButtonFemale.setSelected(false);
        jRadioButtonMale.setSelected(false);
        jDateChooserBirthDate.setText("");
        }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    public boolean verifText(){
        
        if(jTextField_FName.getText().equals("") || jTextField_LName.getText().equals("") ||
                 jTextField_Phone.getText().equals("") || jTextArea_Address.getText().equals("") || 
                jTextField_STD_ID.getText().equals("") || jDateChooserBirthDate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "One or More Empty Field");
            return false;
        } else{
            return true;
        }
                
    }
    
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        AddStudentForm AddSf = new AddStudentForm();
        AddSf.setVisible(true);
        AddSf.pack();
        AddSf.setLocationRelativeTo(null);
        AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextArea_Address.getText();
        int id = Integer.valueOf(jTextField_STD_ID.getText());
        String sex ="Male";
        if(jRadioButtonFemale.isSelected()){
            sex = "Female";
        }
//      else if(jRadioButtonMale.isSelected()){
//            sex = "Male";
//        }
        String bdate = jDateChooserBirthDate.getText();
        if(verifText()){
        student std = new student();
        std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address);
        //MainForm.jLabel_StdCount.setText("Student Count = "+Integer.toString(MyFunction.countData("student")));
        
        //refresh jtable 
        manageStudentsForm.jTable1.setModel(new DefaultTableModel(null ,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(manageStudentsForm.jTable1, "");
        }
    }//GEN-LAST:event_jButtonEditStudentActionPerformed

    int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // get a new model
        model = (DefaultTableModel)jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
            jRadioButtonFemale.setSelected(false);
            jRadioButtonMale.setSelected(false);
        if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
            jRadioButtonMale.setSelected(true);
           
        }else{
            jRadioButtonFemale.setSelected(true);
            
        }
        jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
        jDateChooserBirthDate.setText(model.getValueAt(rowIndex, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_Val_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyTyped
        
    }//GEN-LAST:event_jTextField_Val_FindKeyTyped

    private void jTextField_Val_FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyPressed
        
    }//GEN-LAST:event_jTextField_Val_FindKeyPressed

    private void jTextField_Val_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyReleased
        jTable1.setModel(new DefaultTableModel(null ,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
    }//GEN-LAST:event_jTextField_Val_FindKeyReleased

    private void jTextField_STD_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_STD_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_STD_IDActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
            rowIndex = jTable1.getSelectedRow();
            jTextField_STD_ID.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            jDateChooserBirthDate.setText(model.getValueAt(rowIndex, 4).toString());
        
            if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
                jRadioButtonMale.setSelected(true);
                jRadioButtonFemale.setSelected(false);
            }else{
                jRadioButtonFemale.setSelected(true);
                jRadioButtonMale.setSelected(false);
            }
        }
   
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNameActionPerformed

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
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private javax.swing.JFormattedTextField jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID;
    private javax.swing.JTextField jTextField_Val_Find;
    // End of variables declaration//GEN-END:variables
}
