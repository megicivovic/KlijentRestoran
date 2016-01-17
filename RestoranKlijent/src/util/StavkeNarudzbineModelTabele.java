/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.StavkaNarudzbine;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class StavkeNarudzbineModelTabele extends AbstractTableModel {

    List<StavkaNarudzbine> listaStavki;

    public StavkeNarudzbineModelTabele(List<StavkaNarudzbine> lp) {
        this.listaStavki = lp;
    }

    @Override
    public int getRowCount() {
        return this.listaStavki.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaNarudzbine p = null;
        try {
            p = (StavkaNarudzbine) listaStavki.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(StavkeNarudzbineModelTabele.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getStavkaMenija().getNaziv();
            case 1:
                return p.getStavkaMenija().getCena();
            case 2:
                return p.isPlaceno();
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
                return "Plaćeno";
            default:
                return "Greška";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        StavkaNarudzbine sn = (StavkaNarudzbine) this.listaStavki.get(rowIndex);
        switch (columnIndex) {
            case 0:
                sn.getStavkaMenija().setNaziv((String) aValue);
                break;
            case 1:
                sn.getStavkaMenija().setCena((int) aValue);
                break;
            case 2:
                sn.setPlaceno(!sn.isPlaceno());
                break;
            default:
            // return "Greska";
        }
    }

    @Override
    public Class getColumnClass(int column
    ) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Boolean.class;
            default:
                return Boolean.class;
        }
    }

    public void obrisiRed(int red) {
        this.listaStavki.remove(red);
        fireTableDataChanged();
    }

    public void dodajRed(StavkaNarudzbine stavkaMenija) {
        this.listaStavki.add(stavkaMenija);
        fireTableDataChanged();
    }

    public List<StavkaNarudzbine> vratiListu() {
        return this.listaStavki;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            return true;
        }
        return false;
    }
}
