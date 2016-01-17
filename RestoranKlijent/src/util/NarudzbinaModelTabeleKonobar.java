/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.Narudzbina;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class NarudzbinaModelTabeleKonobar extends AbstractTableModel {

    List<Narudzbina> ln;

    public NarudzbinaModelTabeleKonobar(List<Narudzbina> lp) {
        this.ln = lp;
    }

    @Override
    public int getRowCount() {
        return this.ln.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Narudzbina p = null;
        try {
            p = (Narudzbina) ln.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(NarudzbinaModelTabeleKonobar.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getSto();
            case 1:
                return "...";
            case 2:
                return "x";
            default:
                return "Greska";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Narudzbina t = (Narudzbina) this.ln.get(rowIndex);

        switch (columnIndex) {
            case 0:
                t.setSto((String) aValue);
                break;
            case 1:
                break;
            case 2:
                break;

            default:
            // return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Sto";
            case 1:
                return "Detalji";
            case 2:
                return "Obriši";
            case 3:
            default:
                return "Greška";
        }
    }

    public void obrisiRed(int red) {
        this.ln.remove(red);
        fireTableDataChanged();
    }

    public void dodajRed(Narudzbina narudzbina) {
        this.ln.add(narudzbina);
        fireTableDataChanged();
    }

    public List<Narudzbina> vratiListu() {
        return this.ln;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2) {
            return true;
        }
        return false;
    }

}
