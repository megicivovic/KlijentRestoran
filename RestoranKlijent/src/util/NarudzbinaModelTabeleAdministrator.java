/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.Narudzbina;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class NarudzbinaModelTabeleAdministrator extends AbstractTableModel {

    List<Narudzbina> ln;

    public NarudzbinaModelTabeleAdministrator(List<Narudzbina> lp) {
        this.ln = lp;
    }

    @Override
    public int getRowCount() {
        return this.ln.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Narudzbina p = null;
        try {
            p = (Narudzbina) ln.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(NarudzbinaModelTabeleAdministrator.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getSto();
            case 1:
                return p.getKonobar();
            case 2:
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy");
                return sdf.format(p.getVreme());
            case 3:
                return "...";

            default:
                return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Sto";
            case 1:
                return "Konobar";
            case 2:
                return "Vreme";
            case 3:
                return "Detalji";
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
        if (columnIndex == 3) {
            return true;
        }
        return false;
    }
}
