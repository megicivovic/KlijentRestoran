/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import domen.Kategorija;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author student1
 */
public class KategorijaModelTabele extends AbstractTableModel {

    List<Kategorija> lk;

    public KategorijaModelTabele(List<Kategorija> lp) {
        this.lk = lp;
    }

    @Override
    public int getRowCount() {
        return this.lk.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Kategorija p = null;
        try {
            p = (Kategorija) lk.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(KategorijaModelTabele.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getNaziv();  
                case 1:
                    return "...";
                case 2:
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
                return "Izmeni";
            case 2:
                return "Obriši";
            default:
                return "Greska";
        }
    }

    public void obrisiRed(int red) {
        this.lk.remove(red);
        fireTableDataChanged();
    }
    public void dodajRed(Kategorija kategorija) {
        this.lk.add(kategorija);
        fireTableDataChanged();
    }

    public List<Kategorija> vratiListu() {
        return this.lk;
    }

    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2) {
            return true;
        }
        return false;
    }
}
