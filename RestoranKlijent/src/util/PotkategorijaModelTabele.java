/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.Potkategorija;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class PotkategorijaModelTabele extends AbstractTableModel {

    List<Potkategorija> lk;

    public PotkategorijaModelTabele(List<Potkategorija> lp) {
        this.lk = lp;
    }

    @Override
    public int getRowCount() {
        return this.lk.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Potkategorija p = null;
        try {
            p = (Potkategorija) lk.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(PotkategorijaModelTabele.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getNaziv();
            case 1:
                return p.getKategorija();
            case 2:
                return "...";
            case 3:
                return "x";
            default:
                return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Naziv";
            case 1:
                return "Kategorija";
            case 2:
                return "Izmeni";
            case 3:
                return "Obriši";
            default:
                return "Greska";
        }
    }

    public void obrisiRed(int red) {
        this.lk.remove(red);
        fireTableDataChanged();
    }

    public void dodajRed(Potkategorija kategorija) {
        this.lk.add(kategorija);
        fireTableDataChanged();
    }

    public List<Potkategorija> vratiListu() {
        return this.lk;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 3 || columnIndex == 2) {
            return true;
        }
        return false;
    }
}
