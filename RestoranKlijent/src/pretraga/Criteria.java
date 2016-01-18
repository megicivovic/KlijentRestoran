/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretraga;

import domen.Korisnik;
import java.util.List;

public interface Criteria {
   public List<Korisnik> meetCriteria(List<Korisnik> korisnici,String kriterijum);
}