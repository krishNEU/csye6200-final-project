/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magic.Design;

/**
 *
 * @author krish19
 */
public class MyJLabel extends javax.swing.JLabel {

    // Constructor to initialize custom JLabel
    public MyJLabel() {
        setMagicDesign();  // Apply custom design settings
    }

    // Method to set the label's design properties
    private void setMagicDesign() {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));  // Set the cursor to hand when hovering
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Align text to the center
        this.setForeground(new java.awt.Color(0, 0, 0));  // Set the text color to black
        this.setBackground(new java.awt.Color(255, 255, 255)); // Set the background color to white
        // this.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N // Font setting commented out
    }
}

