/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.Kategorija;
import forme.admin.FKategorija;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CheckboxEditorCekirajStavku extends DefaultCellEditor {

    protected JCheckBox cb;

    private String label;

    private boolean isPushed;

    public CheckboxEditorCekirajStavku(JCheckBox checkBox, JTable tabela) {
        super(checkBox);
        cb = new JCheckBox();
        cb.setOpaque(true);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {//         
                int id = tabela.getSelectedRow();
                Kategorija kategorija = ((KategorijaModelTabele) tabela.getModel()).vratiListu().get(id);
                FKategorija fk = null;
                try {
                    fk = new FKategorija(kategorija, tabela);
                    fk.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CheckboxEditorCekirajStavku.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            cb.setForeground(table.getSelectionForeground());
            cb.setBackground(table.getSelectionBackground());
        } else {
            cb.setForeground(table.getForeground());
            cb.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        cb.setText(label);
        isPushed = true;
        return cb;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            // 
            // 
            JOptionPane.showMessageDialog(cb, label + ": Ouch!");
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
