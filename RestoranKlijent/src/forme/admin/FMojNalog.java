/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import domen.Korisnik;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import util.SingletonHolder;

/**
 *
 * @author Megi
 */
public class FMojNalog extends javax.swing.JPanel {

    private BufferedImage image;
    private String putanjaSlike;
    Korisnik korisnik;

    /**
     * Creates new form FMojNalog
     */
    public FMojNalog() {
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
        jtxtLozinka = new javax.swing.JTextField();
        jtxtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtBrojTelefona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtnPotvrdi = new javax.swing.JButton();
        jbtnDodaj = new javax.swing.JButton();
        jtxtSlika = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpnlSlika = new javax.swing.JPanel();

        jLabel1.setText("Lozinka*");

        jLabel2.setText("Ime*");

        jLabel3.setText("Prezime*");

        jLabel4.setText("Broj telefona");

        jLabel5.setText("E-mail");

        jbtnPotvrdi.setText("Potvrdi");
        jbtnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotvrdiActionPerformed(evt);
            }
        });

        jbtnDodaj.setText("Dodaj...");
        jbtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Moj nalog");

        javax.swing.GroupLayout jpnlSlikaLayout = new javax.swing.GroupLayout(jpnlSlika);
        jpnlSlika.setLayout(jpnlSlikaLayout);
        jpnlSlikaLayout.setHorizontalGroup(
            jpnlSlikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jpnlSlikaLayout.setVerticalGroup(
            jpnlSlikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtSlika, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDodaj)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpnlSlika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jbtnPotvrdi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jpnlSlika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDodaj)
                    .addComponent(jtxtSlika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnPotvrdi)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotvrdiActionPerformed
        SingletonHolder.getInstance().getUlogovaniKorisnik().setKorisnickaSifra(jtxtLozinka.getText());
        SingletonHolder.getInstance().getUlogovaniKorisnik().setIme(jtxtIme.getText());
        SingletonHolder.getInstance().getUlogovaniKorisnik().setPrezime(jtxtPrezime.getText());
        SingletonHolder.getInstance().getUlogovaniKorisnik().setTelefon(jtxtBrojTelefona.getText());
        SingletonHolder.getInstance().getUlogovaniKorisnik().setEmail(jtxtEmail.getText());
        SingletonHolder.getInstance().getUlogovaniKorisnik().setSlika(jtxtSlika.getText());

        JOptionPane.showMessageDialog(this, "Uspešno ste izmenili nalog!", "Izmena naloga", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbtnPotvrdiActionPerformed

    private void jbtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajActionPerformed
        FIzborSlike fis = new FIzborSlike(this, null);
        fis.setVisible(true);
    }//GEN-LAST:event_jbtnDodajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnDodaj;
    private javax.swing.JButton jbtnPotvrdi;
    private javax.swing.JPanel jpnlSlika;
    private javax.swing.JTextField jtxtBrojTelefona;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIme;
    private javax.swing.JTextField jtxtLozinka;
    private javax.swing.JTextField jtxtPrezime;
    private javax.swing.JTextField jtxtSlika;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        korisnik = SingletonHolder.getInstance().getUlogovaniKorisnik();
        jtxtLozinka.setText(korisnik.getKorisnickaSifra());
        jtxtIme.setText(korisnik.getKorisnickoIme());
        jtxtPrezime.setText(korisnik.getPrezime());
        jtxtBrojTelefona.setText(korisnik.getTelefon());
        jtxtEmail.setText(korisnik.getEmail());
        jtxtSlika.setText(korisnik.getSlika());

        try {
            BufferedImage myPicture = ImageIO.read(new File(korisnik.getSlika()));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));                 
            jpnlSlika.add(picLabel);
            jpnlSlika.revalidate();
            jpnlSlika.repaint();
        } catch (IOException ex) {
        }
    }

    public String getPutanjaSlike() {
        return putanjaSlike;
    }

    public void setPutanjaSlike(String putanjaSlike) {
        this.putanjaSlike = putanjaSlike;
        jtxtSlika.setText(putanjaSlike);
        korisnik.setSlika(putanjaSlike);
    }
}
