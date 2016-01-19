/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.Gson;
import domen.StavkaMenija;
import domen.Korisnik;
import domen.Potkategorija;
import domen.Kategorija;
import domen.Narudzbina;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        ucitajPodatke();
//        //kategorije
//        Kategorija k1 = new Kategorija();
//        k1.setNaziv("hrana");
//        k1.setKljucneReci("#food#hrana");
//        Kategorija k2 = new Kategorija();
//        k2.setNaziv("piće");
//        k2.setKljucneReci("#drink#pice");
//        kategorije.add(k1);
//        kategorije.add(k2);
//
//        //potkategorije
//        Potkategorija pk1 = new Potkategorija();
//        pk1.setNaziv("Sladoled");
//        pk1.setKategorija(k1);
//
//        Potkategorija pk3 = new Potkategorija();
//        pk3.setNaziv("Predjelo");
//        pk3.setKategorija(k1);
//
//        Potkategorija pk2 = new Potkategorija();
//        pk2.setNaziv("Gazirani sokovi");
//        pk2.setKategorija(k2);
//
//        Potkategorija pk4 = new Potkategorija();
//        pk4.setNaziv("Gusti sokovi");
//        pk4.setKategorija(k2);
//
//        potkategorije.add(pk3);
//        potkategorije.add(pk4);
//        potkategorije.add(pk1);
//        potkategorije.add(pk2);
//
//        //stavke menija
//        StavkaMenija sm1 = new StavkaMenija();
//        sm1.setNaziv("Ben and Jerry's");
//        sm1.setCena(580);
//        sm1.setPotkategorija(pk1);
//
//        StavkaMenija sm2 = new StavkaMenija();
//        sm2.setNaziv("Coca-Cola");
//        sm2.setCena(120);
//        sm2.setPotkategorija(pk2);
//
//        StavkaMenija sm3 = new StavkaMenija();
//        sm3.setNaziv("Slana torta");
//        sm3.setCena(580);
//        sm3.setPotkategorija(pk3);
//
//        StavkaMenija sm4 = new StavkaMenija();
//        sm4.setNaziv("Arizona ice tea");
//        sm4.setCena(580);
//        sm4.setPotkategorija(pk4);
//
//        stavkeMenija.add(sm3);
//        stavkeMenija.add(sm2);
//        stavkeMenija.add(sm1);
//        stavkeMenija.add(sm4);
//
//        //korisnici
//        Korisnik ko1 = new Korisnik();
//        ko1.setKorisnickoIme("mm19g");
//        ko1.setKorisnickaSifra("mm19g");
//        ko1.setTelefon("66589521");
//        ko1.setEmail("mm19g@mail.com");
//        ko1.setTipKorisnika("konobar");
//        ko1.setIme("Marko");
//        ko1.setPrezime("Marković");
//        ko1.setSlika("slika1.jpg");
//
//        Korisnik ko2 = new Korisnik();
//        ko2.setKorisnickoIme("markom5");
//        ko2.setKorisnickaSifra("markom5");
//        ko2.setIme("Marko");
//        ko2.setPrezime("Petrović");
//        ko2.setSlika("slika2.jpg");
//        ko2.setTelefon("87278227");
//        ko2.setEmail("markom5@mail.com");
//        ko2.setTipKorisnika("konobar");
//
//        Korisnik ko3 = new Korisnik();
//        ko3.setKorisnickoIme("marko");
//        ko3.setKorisnickaSifra("marko");
//        ko3.setIme("Marko");
//        ko3.setPrezime("Nikolić");
//        ko3.setSlika("../slika3.jpg");
//        ko3.setTelefon("66587771");
//        ko3.setEmail("marko@mail.com");
//        ko3.setTipKorisnika("konobar");
//
//        Korisnik ko4 = new Korisnik();
//        ko4.setKorisnickoIme("admin");
//        ko4.setKorisnickaSifra("admin");
//        ko4.setIme("Admin");
//        ko4.setPrezime("Adminović");
//        ko4.setSlika("slika3.jpg");
//        ko4.setTelefon("6777187771");
//        ko4.setEmail("admin@mail.com");
//        ko4.setTipKorisnika("administrator");
//
//        korisnici.add(ko1);
//        korisnici.add(ko2);
//        korisnici.add(ko3);
//        korisnici.add(ko4);
//
//        Narudzbina n1 = new Narudzbina();
//        n1.setSto("sto1");
//        n1.setKonobar(ko3);
//
//        String year = "2016";
//        String month = "1";
//        String day = "1";
//
//        GregorianCalendar newGregCal = new GregorianCalendar(Integer.parseInt(year),
//                Integer.parseInt(month) - 1, Integer.parseInt(day), 12, 0);
//        n1.setVreme(newGregCal.getTime());
//
//        StavkaNarudzbine sn1 = new StavkaNarudzbine();
//        sn1.setStavkaMenija(sm3);
//        sn1.setPlaceno(true);
//        StavkaNarudzbine sn2 = new StavkaNarudzbine();
//        sn2.setStavkaMenija(sm2);
//        sn2.setPlaceno(false);
//
//        n1.getStavke().add(sn2);
//        n1.getStavke().add(sn1);
//
//        Narudzbina n2 = new Narudzbina();
//        n2.setSto("sto5");
//        n2.setKonobar(ko3);
//
//        String year2 = "2016";
//        String month2 = "1";
//        String day2 = "5";
//
//        GregorianCalendar newGregCal2 = new GregorianCalendar(Integer.parseInt(year2),
//                Integer.parseInt(month2) - 1, Integer.parseInt(day2), 10, 0);
//        n2.setVreme(newGregCal2.getTime());
//
//        n2.getStavke().add(sn2);
//        n2.getStavke().add(sn1);
//
//        Narudzbina n3 = new Narudzbina();
//        n3.setSto("sto2");
//        n3.setKonobar(ko3);
//
//        String year3 = "2016";
//        String month3 = "1";
//        String day3 = "13";
//        GregorianCalendar newGregCal3 = new GregorianCalendar(Integer.parseInt(year3),
//                Integer.parseInt(month3) - 1, Integer.parseInt(day3), 14, 0);
//        n3.setVreme(newGregCal3.getTime());
//
//        n3.getStavke().add(sn2);
//        n3.getStavke().add(sn1);
//
//        Narudzbina n4 = new Narudzbina();
//        n4.setSto("sto6");
//        n4.setKonobar(ko1);
//        String year4 = "2016";
//        String month4 = "1";
//        String day4 = "25";
//
//        GregorianCalendar newGregCal4 = new GregorianCalendar(Integer.parseInt(year4),
//                Integer.parseInt(month4) - 1, Integer.parseInt(day4), 13, 0);
//        n4.setVreme(newGregCal4.getTime());
//
//        n4.getStavke().add(sn2);
//        n4.getStavke().add(sn1);
//
//        narudzbine.add(n1);
//        narudzbine.add(n2);
//        narudzbine.add(n3);
//        narudzbine.add(n4);

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

    public List<Potkategorija> getPotkategorije(String kategorija) {
        List<Potkategorija> lista = new LinkedList<>();
        for (int i = 0; i < getPotkategorije().size(); i++) {
            Potkategorija pk = getPotkategorije().get(i);
            if (pk.getKategorija().getNaziv().equals(kategorija)) {
                lista.add(pk);

            }
        }
        return lista;
    }

    public List<StavkaMenija> getStavkeMenija(String potkategorija) {
        List<StavkaMenija> lista = new LinkedList<>();
        for (int i = 0; i < getStavkeMenija().size(); i++) {
            StavkaMenija sm = getStavkeMenija().get(i);
            if (sm.getPotkategorija().getNaziv().equals(potkategorija)) {
                lista.add(sm);
            }
        }
        return lista;
    }

    public void odstampajPodatke() {

        String json = new Gson().toJson(narudzbine);
        String json2 = new Gson().toJson(kategorije);
        String json3 = new Gson().toJson(potkategorije);
        String json4 = new Gson().toJson(stavkeMenija);
        String json5 = new Gson().toJson(korisnici);

        try {
            PrintWriter out = new PrintWriter("narudzbine.txt");
            out.println(json);
            out.close();

            PrintWriter out2 = new PrintWriter("kategorije.txt");
            out2.println(json2);
            out2.close();

            PrintWriter out3 = new PrintWriter("potkategorije.txt");
            out3.println(json3);
            out3.close();

            PrintWriter out4 = new PrintWriter("stavkemenija.txt");
            out4.println(json4);
            out4.close();

            PrintWriter out5 = new PrintWriter("korisnici.txt");
            out5.println(json5);
            out5.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SingletonHolder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ucitajPodatke() {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("narudzbine.txt"));
            String narudzbineString = in.readLine();
            Narudzbina[] narudzbineNiz = new Gson().fromJson(narudzbineString, Narudzbina[].class);
            narudzbine = Arrays.asList(narudzbineNiz);

            in = new BufferedReader(new FileReader("kategorije.txt"));
            String kategorijeString = in.readLine();
            Kategorija[] kategorijeNiz = new Gson().fromJson(kategorijeString, Kategorija[].class);
            kategorije = Arrays.asList(kategorijeNiz);

            in = new BufferedReader(new FileReader("potkategorije.txt"));
            String potkategorijeString = in.readLine();
            Potkategorija[] potkategorijeNiz = new Gson().fromJson(potkategorijeString, Potkategorija[].class);
            potkategorije = Arrays.asList(potkategorijeNiz);

            in = new BufferedReader(new FileReader("stavkemenija.txt"));
            String stavkemenijaString = in.readLine();
            StavkaMenija[] stavkemenijaNiz = new Gson().fromJson(stavkemenijaString, StavkaMenija[].class);
            stavkeMenija = Arrays.asList(stavkemenijaNiz);

            in = new BufferedReader(new FileReader("korisnici.txt"));
            String korisniciString = in.readLine();
            Korisnik[] korisniciNiz = new Gson().fromJson(korisniciString, Korisnik[].class);
            korisnici = Arrays.asList(korisniciNiz);

            in.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SingletonHolder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SingletonHolder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
