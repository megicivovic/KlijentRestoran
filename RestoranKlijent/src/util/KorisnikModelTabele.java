/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.Korisnik;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class KorisnikModelTabele extends AbstractTableModel {

    List<Korisnik> lk;

    public KorisnikModelTabele(List<Korisnik> lp) {
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
        Korisnik p = null;
        try {
            p = (Korisnik) lk.get(rowIndex);
        } catch (Exception ex) {
            Logger.getLogger(KorisnikModelTabele.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (columnIndex) {
            case 0:
                return p.getKorisnickoIme();
            case 1:
                return p.getIme();
            case 2:
                return p.getPrezime();
            case 3:
                return p.getSlika();
            case 4:
                return p.getTipKorisnika();                
            default:
                return "Greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Korisničko ime";
            case 1:
                return "Ime";
            case 2:
                return "Prezime";
            case 3:
                return "Slika";
            case 4:
                return "Tip korisnika";
            default:
                return "Greška";
        }
    }

    public void obrisiRed(int red) {
        this.lk.remove(red);
        fireTableDataChanged();
    }

    public void dodajRed(Korisnik korisnik) {
        this.lk.add(korisnik);
        fireTableDataChanged();
    }

    public List<Korisnik> vratiListu() {
        return this.lk;
    }

}
