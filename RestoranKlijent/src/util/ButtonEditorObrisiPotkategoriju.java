/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import forme.admin.FKategorija;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ButtonEditorObrisiPotkategoriju extends DefaultCellEditor {

    protected JButton button;

    private String label;

    private boolean isPushed;

    public ButtonEditorObrisiPotkategoriju(JCheckBox checkBox, JTable tabela) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {//         
                int id = tabela.getSelectedRow();
                String potkategorija = (String) tabela.getModel().getValueAt(id, 0);
                
                 int n = JOptionPane.showConfirmDialog(tabela, "Da li ste sigurni da želite da"
                + " obrišete potkategoriju - "+potkategorija+"?",
                "Brisanje potkategorije",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
             ((PotkategorijaModelTabele)tabela.getModel()).obrisiRed(id);
            tabela.repaint();
            JOptionPane.showMessageDialog(tabela,"Uspešno ste obrisali potkategoriju!", "Brisanje potkategorije",JOptionPane.INFORMATION_MESSAGE );
        } else if (n == JOptionPane.NO_OPTION) {

        } 

            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            // 
            // 
            JOptionPane.showMessageDialog(button, label + ": Ouch!");
            // System.out.println(label + ": Ouch!");
        }
        isPushed = false;
        return new String(label);
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }

}
