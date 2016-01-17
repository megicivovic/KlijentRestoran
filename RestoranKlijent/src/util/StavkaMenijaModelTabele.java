/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.StavkaMenija;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class StavkaMenijaModelTabele extends AbstractTableModel {

    List<StavkaMenija> lsm;

    public StavkaMenijaModelTabele(List<StavkaMenija> lp) {
        this.lsm = lp;
    }

    @Override
    public int getRowCount() {
        return this.lsm.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaMenija p = null;
        try {
            p = (StavkaMenija) lsm.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(StavkaMenijaModelTabele.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getNaziv();
            case 1:
                return p.getCena();
            case 2:
                return p.getPotkategorija();
            case 3:
                return p.getPotkategorija().getKategorija();
            case 4:
                return "...";
            case 5:
                return "x";
            default:
                return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Naziv stavke";
            case 1:
                return "Cena";
            case 2:
                return "Potkategorija";
            case 3:
                return "Kategorija";
            case 4:
                return "Izmeni";
            case 5:
                return "Obriši";
            default:
                return "Greska";
        }
    }

    public void obrisiRed(int red) {
        this.lsm.remove(red);
        fireTableDataChanged();
    }

    public void dodajRed(StavkaMenija stavka) {
        this.lsm.add(stavka);
        fireTableDataChanged();
    }

    public List<StavkaMenija> vratiListu() {
        return this.lsm;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 4 || columnIndex == 5) {
            return true;
        }
        return false;
    }
}
