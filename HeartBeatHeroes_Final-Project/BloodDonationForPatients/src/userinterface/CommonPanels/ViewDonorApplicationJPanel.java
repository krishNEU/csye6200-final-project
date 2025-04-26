/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommonPanels;

import Business.BloodTypes.PersonBloodTypes;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Requests.DonorRequest;
import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Image;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author siddh
 */
public class ViewDonorApplicationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorApplicationJPanel
     */
    private boolean emailValid;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private byte[] tempdP;
    private ButtonGroup radioGroup1;
    private ButtonGroup radioGroup2;
    private ButtonGroup radioGroup3;
    private ButtonGroup radioGroup4;
    private JPanel userProcessContainer;
    DonorRequest donorRequest;

    public ViewDonorApplicationJPanel(EcoSystem system, DonorRequest donorRequest, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.donorRequest = donorRequest;
        this.radioGroup1 = new ButtonGroup();
        this.radioGroup2 = new ButtonGroup();
        this.radioGroup3 = new ButtonGroup();
        this.radioGroup4 = new ButtonGroup();

        // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(btnYesQ1);
        radioGroup1.add(btnNoQ1);

        //  ButtonGroup radioGroup2 = new ButtonGroup();
        radioGroup2.add(btnYesQ2);
        radioGroup2.add(btnNoQ2);

        //  ButtonGroup radioGroup3 = new ButtonGroup();
        // ButtonGroup radioGroup4 = new ButtonGroup();
        radioGroup4.add(btnYesQ4);
        radioGroup4.add(btnNoQ4);

        populateGenderComboBox();
        populateStateComboBox();
        populatebloodTypeComboBox();

        populateDonorRequestData();
        disableAllButton();

    }

    private void populateGenderComboBox() {
        genderJComboBox.addItem("Male");
        genderJComboBox.addItem("Female");
        genderJComboBox.addItem("Other");
    }

    private void populateStateComboBox() {
        // Add all states to the JComboBox using a loop
        String[] states = {
            "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware",
            "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
            "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
            "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
            "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
            "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
            "Wisconsin", "Wyoming"
        };

        for (String state : states) {
            stateJComboBox.addItem(state);
        }

    }

    public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }

    public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
    }

    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private void disableAllButton() {

        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        ageText.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderJComboBox.setEnabled(false);

//        bloodTypesTextField.setEnabled(false);
        bloodTypeComboBox.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateJComboBox.setEnabled(false);
        zipText.setEnabled(false);
        btnYesQ1.setEnabled(false);
        btnNoQ1.setEnabled(false);
        btnYesQ2.setEnabled(false);
        btnNoQ2.setEnabled(false);
        btnYesQ4.setEnabled(false);
        btnNoQ4.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnYesQ2 = new javax.swing.JRadioButton();
        btnNoQ2 = new javax.swing.JRadioButton();
        btnNoQ1 = new javax.swing.JRadioButton();
        btnYesQ1 = new javax.swing.JRadioButton();
        btnNoQ4 = new javax.swing.JRadioButton();
        btnYesQ4 = new javax.swing.JRadioButton();
        dobDateField = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        stateJComboBox = new javax.swing.JComboBox();
        genderJComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        bloodTypeComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(1280, 685));
        setPreferredSize(new java.awt.Dimension(1280, 685));
        setRequestFocusEnabled(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        nameText.setBackground(new java.awt.Color(0, 153, 153));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 180, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 218, -1, -1));

        uidText.setBackground(new java.awt.Color(0, 153, 153));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 180, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("DOB:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("Age:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        ageText.setBackground(new java.awt.Color(0, 153, 153));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setEnabled(false);
        ageText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageTextMouseClicked(evt);
            }
        });
        ageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextKeyPressed(evt);
            }
        });
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 180, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Gender:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Blood Type:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, 20));

        streetText.setBackground(new java.awt.Color(0, 153, 153));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 180, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Street address:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("City:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        cityText.setBackground(new java.awt.Color(0, 153, 153));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("States:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setText("ZipCode:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 153, 153));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 180, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setText("Phone Number:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 153, 153));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("Email:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        emailText.setBackground(new java.awt.Color(0, 153, 153));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel19.setText("Do you have any chronic conditions?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel20.setText("Are you currently feeling unwell?");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel22.setText("Do you have any contagious diseases?");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 630, 20));

        btnYesQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ2.setText("Yes");
        add(btnYesQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, -1, -1));

        btnNoQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ2.setText("No");
        add(btnNoQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 450, -1, -1));

        btnNoQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ1.setText("No");
        btnNoQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoQ1ActionPerformed(evt);
            }
        });
        add(btnNoQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 400, -1, -1));

        btnYesQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ1.setText("Yes");
        add(btnYesQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, -1));

        btnNoQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ4.setText("No");
        add(btnNoQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, -1, -1));

        btnYesQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ4.setText("Yes");
        add(btnYesQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, -1, -1));

        dobDateField.setBackground(new java.awt.Color(255, 255, 255));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agePop(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 180, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, 120, 40));

        stateJComboBox.setBackground(new java.awt.Color(0, 153, 153));
        stateJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 180, -1));

        genderJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboBoxActionPerformed(evt);
            }
        });
        add(genderJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 180, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setBackground(new java.awt.Color(0, 102, 102));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(" Donor Application Form ");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 410, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 1140, 20));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setText("Address Details");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 20, 310));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setText("Elibility Requirements:");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        bloodTypeComboBox.setBackground(new java.awt.Color(0, 153, 153));
        bloodTypeComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeComboBoxActionPerformed(evt);
            }
        });
        add(bloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 180, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("PIN:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        returnToCustomerWorkArea();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed


    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void genderJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderJComboBoxActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(emailText.getText())) {
            emailValid = false;
        } else {
//            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailText.setForeground(Color.BLACK);
            emailValid = true;
        }


    }//GEN-LAST:event_uEmailKeyTyped

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void uDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uDobKeyTyped
        // TODO add your handling code here:
        // System.out.println("date");
        /*

        Date dob = dobDateField.getDate();
    
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
    String dobq=  calculateAge(dob, today);    
        
    }

    
         */
 /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
  
         */
    }//GEN-LAST:event_uDobKeyTyped

    private void ageTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextKeyPressed

    private void ageTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTextMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));

        /*  LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);  
         */

    }//GEN-LAST:event_ageTextMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        // System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //    Date dob = dobDateField.getDate();
        //       System.out.println(dob.getYear());
        //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private ImageIcon setPicture(String carImageLocation, JLabel carImage) {

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);

        return selectedCarPicture;
    }

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed


    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void agePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agePop
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));

    }//GEN-LAST:event_agePop

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        // TODO add your handling code here:

        Date dob = dobDateField.getDate();
        //  System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));
    }//GEN-LAST:event_emailTextMouseClicked

    private void bloodTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }

    private void populatebloodTypeComboBox() {
        bloodTypeComboBox.removeAllItems();
        for (PersonBloodTypes.BloodType bt : system.getPersonBloodTypes().getBloodTypeList()) {
            bloodTypeComboBox.addItem(bt.toString());
        }
    }//GEN-LAST:event_bloodTypeComboBoxActionPerformed

    private void btnNoQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNoQ1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox<String> bloodTypeComboBox;
    private javax.swing.JRadioButton btnNoQ1;
    private javax.swing.JRadioButton btnNoQ2;
    private javax.swing.JRadioButton btnNoQ4;
    private javax.swing.JRadioButton btnYesQ1;
    private javax.swing.JRadioButton btnYesQ2;
    private javax.swing.JRadioButton btnYesQ4;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    private void returnToCustomerWorkArea() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void populateDonorRequestData() {
        
        uidText.setText(donorRequest.getDonorID());
        nameText.setText(donorRequest.getName());
        dobDateField.setDate(donorRequest.getDob());
        ageText.setText(String.valueOf(donorRequest.getAge()));
        genderJComboBox.setSelectedItem(donorRequest.getGender());
        streetText.setText(donorRequest.getStreetAddress());
        cityText.setText(donorRequest.getCity());
        stateJComboBox.setSelectedItem(donorRequest.getState());
        zipText.setText(String.valueOf(donorRequest.getZipCode()));
        contactText.setText(String.valueOf(donorRequest.getContact()));
        emailText.setText(donorRequest.getEmailID());
        btnNoQ1.setSelected(true);
        btnNoQ2.setSelected(true);
        btnNoQ4.setSelected(true);
        
    }

}
