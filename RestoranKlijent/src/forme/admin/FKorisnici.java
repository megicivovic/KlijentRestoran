/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import domen.Korisnik;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.KorisnikModelTabele;
import util.SingletonHolder;

/**
 *
 * @author Megi
 */
public class FKorisnici extends javax.swing.JPanel {

    /**
     * Creates new form FKorisnici
     */
    public FKorisnici() {
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtKorisnickoIme = new javax.swing.JTextField();
        jtxtLozinka = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtIme = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtPrezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBtnPonisti = new javax.swing.JButton();
        comboTipKorisnika = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblKorisnici = new javax.swing.JTable();
        jbtnDodajKorisnika = new javax.swing.JButton();
        jbtnObrisi = new javax.swing.JButton();
        jBtnPronadji = new javax.swing.JButton();

        jLabel1.setText("Korisničko ime");

        jLabel2.setText("Lozinka");

        jLabel3.setText("Ime");

        jLabel4.setText("Prezime");

        jLabel5.setText("Telefon");

        jLabel6.setText("Email");

        jBtnPonisti.setText("X   Poništi filtere");
        jBtnPonisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPonistiActionPerformed(evt);
            }
        });

        comboTipKorisnika.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrator", "konobar", " " }));

        jLabel7.setText("Tip korisnika");

        jtblKorisnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblKorisnici);

        jbtnDodajKorisnika.setText("+ Dodaj korisnika");
        jbtnDodajKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajKorisnikaActionPerformed(evt);
            }
        });

        jbtnObrisi.setText("Obriši");
        jbtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiActionPerformed(evt);
            }
        });

        jBtnPronadji.setText("Pronađi");
        jBtnPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPronadjiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(548, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnPronadji)
                                .addGap(72, 72, 72)
                                .addComponent(jBtnPonisti))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(comboTipKorisnika, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnObrisi)
                        .addGap(113, 113, 113)
                        .addComponent(jbtnDodajKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDodajKorisnika)
                    .addComponent(jbtnObrisi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiActionPerformed
        if (jtblKorisnici.getSelectedRow() > -1) {
            int n = JOptionPane.showConfirmDialog(this.getParent(), "Da li ste sigurni da želite da"
                    + " obrišete korisnika?",
                    "Brisanje korisnika",
                    JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                ((KorisnikModelTabele) jtblKorisnici.getModel()).obrisiRed(jtblKorisnici.getSelectedRow());
                jtblKorisnici.revalidate();
                jtblKorisnici.repaint();
                JOptionPane.showMessageDialog(this, "Uspešno ste obrisali korisnika!", "Brisanje korisnika", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Morate selektovati korisnika za brisanje!", "Brisanje korisnika", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnObrisiActionPerformed

    private void jbtnDodajKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajKorisnikaActionPerformed
        this.removeAll();
        this.repaint();
        JPanel jpnlUnosKorisnika = new FUnosKorisnika();
        jpnlUnosKorisnika.setSize(this.getWidth(), this.getHeight());
        this.add(jpnlUnosKorisnika);
        this.validate();

    }//GEN-LAST:event_jbtnDodajKorisnikaActionPerformed

    private void jBtnPonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPonistiActionPerformed
        jtblKorisnici.setModel(new KorisnikModelTabele(SingletonHolder.getInstance().getKorisnici()));
        jtxtEmail.setText("");
        jtxtIme.setText("");
        jtxtKorisnickoIme.setText("");
        jtxtLozinka.setText("");
        jtxtPrezime.setText("");
        jtxtTelefon.setText("");
    }//GEN-LAST:event_jBtnPonistiActionPerformed

    private void jBtnPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPronadjiActionPerformed
        // List<Korisnik> korisnici = new LinkedList<>(((KorisnikModelTabele) jtblKorisnici.getModel()).vratiListu());
        jtblKorisnici.setModel(new KorisnikModelTabele(SingletonHolder.getInstance().getKorisnici()));
        List<Korisnik> korisniciPretraga = new LinkedList<Korisnik>(SingletonHolder.getInstance().getKorisnici());

        if (!jtxtKorisnickoIme.getText().equals("")) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n = korisniciPretraga.get(i);
                if (!n.getKorisnickoIme().contains(jtxtKorisnickoIme.getText())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        if (!jtxtLozinka.getText().equals("")) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n1 = korisniciPretraga.get(i);
                if (!n1.getKorisnickaSifra().contains(jtxtLozinka.getText())) {
                    korisniciPretraga.remove(n1);
                }
            }
        }

        if (!jtxtIme.getText().equals("")) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n = korisniciPretraga.get(i);
                if (!n.getIme().contains(jtxtIme.getText())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        if (!jtxtPrezime.getText().equals("")) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n = korisniciPretraga.get(i);
                if (!n.getPrezime().contains(jtxtPrezime.getText())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        if (comboTipKorisnika.getSelectedIndex() > -1) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n = korisniciPretraga.get(i);
                if (!n.getTipKorisnika().equals(comboTipKorisnika.getSelectedItem())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        if (!jtxtTelefon.getText().equals("")) {
            for (int i = 0; i < korisniciPretraga.size(); i++) {
                Korisnik n = korisniciPretraga.get(i);
                if (!n.getTelefon().contains(jtxtTelefon.getText())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        if (!jtxtEmail.getText().equals("")) {
            for (Korisnik n : korisniciPretraga) {
                if (!n.getEmail().contains(jtxtEmail.getText())) {
                    korisniciPretraga.remove(n);
                }
            }
        }

        jtblKorisnici.setModel(new KorisnikModelTabele(korisniciPretraga));
        jtblKorisnici.revalidate();
        jtblKorisnici.repaint();

        if (korisniciPretraga.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nema korisnika koji zadovoljavaju rezultate pretrage!", "Pretraga", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jBtnPronadjiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboTipKorisnika;
    private javax.swing.JButton jBtnPonisti;
    private javax.swing.JButton jBtnPronadji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDodajKorisnika;
    private javax.swing.JButton jbtnObrisi;
    private javax.swing.JTable jtblKorisnici;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIme;
    private javax.swing.JTextField jtxtKorisnickoIme;
    private javax.swing.JTextField jtxtLozinka;
    private javax.swing.JTextField jtxtPrezime;
    private javax.swing.JTextField jtxtTelefon;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jtblKorisnici.setModel(new KorisnikModelTabele(SingletonHolder.getInstance().getKorisnici()));
    }
}
