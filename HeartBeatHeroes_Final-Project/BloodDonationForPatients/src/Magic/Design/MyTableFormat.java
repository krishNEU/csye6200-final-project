/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magic.Design;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author krish19
 */
public class MyTableFormat extends DefaultTableCellRenderer {

    // Constructor that sets the cell renderer as opaque
    public MyTableFormat() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable myTable, Object value, boolean selected, boolean focused, int row, int column) {
        // Calls the parent method to set default cell rendering
        super.getTableCellRendererComponent(myTable, value, selected, focused, row, column);
        
        // Set the background color of the table cell
        setBackground(new java.awt.Color(241, 250, 238)); 
        
        // Set the foreground (text) color of the table cell
        setForeground(new java.awt.Color(0, 0, 0));
        
        // Set the table to fill the viewport height
        myTable.setFillsViewportHeight(true);
        
        // Set the border for the table cell
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        // Enable grid visibility in the table
        myTable.setShowGrid(true);
        
        // Get the default renderer from the table header
        TableCellRenderer rendererFromHeader = myTable.getTableHeader().getDefaultRenderer();
        
        // Cast the renderer to a JLabel to modify header appearance
        JLabel headerLabel = (JLabel) rendererFromHeader;
        
        // Set the header text alignment to center
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        
        return this;  // Return the current cell renderer
    }
}

