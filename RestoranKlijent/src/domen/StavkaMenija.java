/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Objects;

/**
 *
 * @author Megi
 */
public class StavkaMenija {

    private String naziv;
    private Potkategorija potkategorija;
    private int cena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Potkategorija getPotkategorija() {
        return potkategorija;
    }

    public void setPotkategorija(Potkategorija potkategorija) {
        this.potkategorija = potkategorija;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StavkaMenija other = (StavkaMenija) obj;
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        return true;
    }

}
