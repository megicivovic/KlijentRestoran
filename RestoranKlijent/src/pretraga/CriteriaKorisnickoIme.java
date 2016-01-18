/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretraga;

import domen.Korisnik;
import java.util.ArrayList;
import java.util.List;

public class CriteriaKorisnickoIme implements Criteria {

    @Override
    public List<Korisnik> meetCriteria(List<Korisnik> korisnici, String kriterijum) {
        List<Korisnik> korisniciSaKorisnickimImenom = new ArrayList<Korisnik>();

        for (Korisnik korisnik : korisnici) {
            if (korisnik.getKorisnickoIme().equalsIgnoreCase(kriterijum)) {
                korisniciSaKorisnickimImenom.add(korisnik);
            }
        }
        return korisniciSaKorisnickimImenom;
    }
}
