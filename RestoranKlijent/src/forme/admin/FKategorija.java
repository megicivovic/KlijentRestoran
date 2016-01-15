/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import domen.Kategorija;
import javax.swing.JTable;
import util.KategorijaModelTabele;

/**
 *
 * @author Megi
 */
public class FKategorija extends javax.swing.JFrame {

    Kategorija kategorija = null;
    JTable tabela;
    private int index;

    /**
     * Creates new form FKategorija
     */
    public FKategorija(Kategorija kategorija, JTable jtblKategorije) {
        initComponents();
        this.kategorija = kategorija;
        this.tabela = tabela;
        this.index = tabela.getSelectedRow();
        srediFormu();

    }

    public FKategorija() {
        initComponents();
    }

    public FKategorija(JTable jtblKategorije) {
        initComponents();
        tabela = jtblKategorije;

    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
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
        jtxtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtKljucneReci = new javax.swing.JTextField();
        jbtnOdustani = new javax.swing.JButton();
        jbtnPotvrdi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kategorija");

        jLabel1.setText("Naziv");

        jLabel2.setText("Ključne reči");

        jbtnOdustani.setText("Odustani");
        jbtnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOdustaniActionPerformed(evt);
            }
        });

        jbtnPotvrdi.setText("Potvrdi");
        jbtnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotvrdiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnPotvrdi)
                        .addGap(46, 46, 46)
                        .addComponent(jbtnOdustani))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtKljucneReci, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtKljucneReci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnOdustani)
                    .addComponent(jbtnPotvrdi))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotvrdiActionPerformed
        if (kategorija != null) {
            ((KategorijaModelTabele) tabela.getModel()).vratiListu().get(index).setNaziv(jtxtNaziv.getText());
            ((KategorijaModelTabele) tabela.getModel()).vratiListu().get(index).setKljucneReci(jtxtKljucneReci.getText());
            tabela.repaint();
        } else {
            Kategorija k = new Kategorija();
            k.setNaziv(jtxtNaziv.getText());
            k.setKljucneReci(jtxtKljucneReci.getText());
            ((KategorijaModelTabele) tabela.getModel()).vratiListu().add(k);
            tabela.repaint();
        }
    }//GEN-LAST:event_jbtnPotvrdiActionPerformed

    private void jbtnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnOdustaniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FKategorija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FKategorija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FKategorija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FKategorija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FKategorija().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnOdustani;
    private javax.swing.JButton jbtnPotvrdi;
    private javax.swing.JTextField jtxtKljucneReci;
    private javax.swing.JTextField jtxtNaziv;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jtxtNaziv.setText(kategorija.getNaziv());
        jtxtKljucneReci.setText(kategorija.getKljucneReci());
    }
}
