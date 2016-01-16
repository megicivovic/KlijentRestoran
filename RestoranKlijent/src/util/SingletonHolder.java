/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domen.StavkaMenija;
import domen.Korisnik;
import domen.Potkategorija;
import domen.Kategorija;
import domen.Narudzbina;
import domen.StavkaNarudzbine;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Megi
 */
public final class SingletonHolder {

    private static SingletonHolder instance;
    private List<Kategorija> kategorije = new LinkedList<>();
    private List<Potkategorija> potkategorije = new LinkedList<>();
    private List<StavkaMenija> stavkeMenija = new LinkedList<>();
    private List<Korisnik> korisnici = new LinkedList<>();
    private List<Narudzbina> narudzbine = new LinkedList<>();

    private Korisnik ulogovaniKorisnik;

    public SingletonHolder() {
        //kategorije
        Kategorija k1 = new Kategorija();
        k1.setNaziv("hrana");
        k1.setKljucneReci("#food#hrana");
        Kategorija k2 = new Kategorija();
        k2.setNaziv("piće");
        k2.setKljucneReci("#drink#pice");
        kategorije.add(k1);
        kategorije.add(k2);

        //potkategorije
        Potkategorija pk1 = new Potkategorija();
        pk1.setNaziv("Sladoled");
        pk1.setKategorija(k1);

        Potkategorija pk3 = new Potkategorija();
        pk3.setNaziv("Predjelo");
        pk3.setKategorija(k1);

        Potkategorija pk2 = new Potkategorija();
        pk2.setNaziv("Gazirani sokovi");
        pk2.setKategorija(k2);

        Potkategorija pk4 = new Potkategorija();
        pk4.setNaziv("Gusti sokovi");
        pk4.setKategorija(k2);

        potkategorije.add(pk3);
        potkategorije.add(pk4);
        potkategorije.add(pk1);
        potkategorije.add(pk2);

        //stavke menija
        StavkaMenija sm1 = new StavkaMenija();
        sm1.setNaziv("Ben and Jerry's");
        sm1.setCena(580);
        sm1.setPotkategorija(pk1);

        StavkaMenija sm2 = new StavkaMenija();
        sm2.setNaziv("Coca-Cola");
        sm2.setCena(120);
        sm2.setPotkategorija(pk2);

        StavkaMenija sm3 = new StavkaMenija();
        sm3.setNaziv("Slana torta");
        sm3.setCena(580);
        sm3.setPotkategorija(pk3);

        StavkaMenija sm4 = new StavkaMenija();
        sm4.setNaziv("Arizona ice tea");
        sm4.setCena(580);
        sm4.setPotkategorija(pk4);

        stavkeMenija.add(sm3);
        stavkeMenija.add(sm2);
        stavkeMenija.add(sm1);
        stavkeMenija.add(sm4);

        //korisnici
        Korisnik ko1 = new Korisnik();
        ko1.setKorisnickoIme("mm19g");
        ko1.setKorisnickaSifra("mm19g");
        ko1.setTelefon("66589521");
        ko1.setEmail("mm19g@mail.com");
        ko1.setTipKorisnika("konobar");
        ko1.setIme("Marko");
        ko1.setPrezime("Marković");
        ko1.setSlika("../slika1.jpg");

        Korisnik ko2 = new Korisnik();
        ko2.setKorisnickoIme("markom5");
        ko2.setKorisnickaSifra("markom5");
        ko2.setIme("Marko");
        ko2.setPrezime("Petrović");
        ko2.setSlika("../slika2.jpg");
        ko2.setTelefon("87278227");
        ko2.setEmail("markom5@mail.com");
        ko2.setTipKorisnika("konobar");

        Korisnik ko3 = new Korisnik();
        ko3.setKorisnickoIme("marko");
        ko3.setKorisnickaSifra("marko");
        ko3.setIme("Marko");
        ko3.setPrezime("Nikolić");
        ko3.setSlika("../slika3.jpg");
        ko3.setTelefon("66587771");
        ko3.setEmail("marko@mail.com");
        ko3.setTipKorisnika("konobar");

        Korisnik ko4 = new Korisnik();
        ko4.setKorisnickoIme("admin");
        ko4.setKorisnickaSifra("admin");
        ko4.setIme("Admin");
        ko4.setPrezime("Adminović");
        ko4.setSlika("C:\\Users\\Megi\\Documents\\Bluetooth Folder\\20150721_185759.jpg");
        ko4.setTelefon("6777187771");
        ko4.setEmail("admin@mail.com");
        ko4.setTipKorisnika("administrator");

        korisnici.add(ko1);
        korisnici.add(ko2);
        korisnici.add(ko3);
        korisnici.add(ko4);

        Narudzbina n1 = new Narudzbina();
        n1.setSto("sto1");
        n1.setKonobar(ko3);
        n1.setVreme(new Date(2015, 10, 3, 14, 0));
        StavkaNarudzbine sn1 = new StavkaNarudzbine();
        sn1.setStavkaMenija(sm3);
        sn1.setPlaceno(true);
        StavkaNarudzbine sn2 = new StavkaNarudzbine();
        sn2.setStavkaMenija(sm2);
        sn2.setPlaceno(false);

        n1.getStavke().add(sn2);
        n1.getStavke().add(sn1);

        Narudzbina n2 = new Narudzbina();
        n2.setSto("sto5");
        n2.setKonobar(ko3);
        n2.setVreme(new Date(2015, 10, 3, 12, 0));
        n2.getStavke().add(sn2);
        n2.getStavke().add(sn1);

        Narudzbina n3 = new Narudzbina();
        n3.setSto("sto1");
        n3.setKonobar(ko3);
        n3.setVreme(new Date(2015, 10, 3, 8, 0));
        n3.getStavke().add(sn2);
        n3.getStavke().add(sn1);

        Narudzbina n4 = new Narudzbina();
        n4.setSto("sto6");
        n4.setKonobar(ko1);
        n4.setVreme(new Date(2015, 10, 3, 10, 0));
        n4.getStavke().add(sn2);
        n4.getStavke().add(sn1);

        narudzbine.add(n1);
        narudzbine.add(n2);
        narudzbine.add(n3);
        narudzbine.add(n4);
    }

    public static SingletonHolder getInstance() {
        if (instance == null) {
            instance = new SingletonHolder();
        }
        return instance;
    }

    public List<Kategorija> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<Kategorija> kategorije) {
        this.kategorije = kategorije;
    }

    public List<Potkategorija> getPotkategorije() {
        return potkategorije;
    }

    public void setPotkategorije(List<Potkategorija> potkategorije) {
        this.potkategorije = potkategorije;
    }

    public List<StavkaMenija> getStavkeMenija() {
        return stavkeMenija;
    }

    public void setStavkeMenija(List<StavkaMenija> stavkeMenija) {
        this.stavkeMenija = stavkeMenija;
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getUlogovaniKorisnik() {
        return ulogovaniKorisnik;
    }

    public void setUlogovaniKorisnik(Korisnik ulogovaniKorisnik) {
        this.ulogovaniKorisnik = ulogovaniKorisnik;
    }

    public List<Narudzbina> getNarudzbine() {
        return narudzbine;
    }

    public void setNarudzbine(List<Narudzbina> narudzbine) {
        this.narudzbine = narudzbine;
    }

    public List<Narudzbina> getNarudzbine(Korisnik ulogovaniKorisnik) {
        LinkedList<Narudzbina> narudzbineKorisnik = new LinkedList<>();
        for (Narudzbina narudzbina : narudzbine) {
            if (narudzbina.getKonobar().equals(ulogovaniKorisnik)) {
                narudzbineKorisnik.add(narudzbina);
            }
        }
        return narudzbineKorisnik;
    }

}
