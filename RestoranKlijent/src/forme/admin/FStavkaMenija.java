/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.admin;

import domen.Kategorija;
import domen.Potkategorija;
import domen.StavkaMenija;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import util.SingletonHolder;
import util.StavkaMenijaModelTabele;

/**
 *
 * @author Megi
 */
public class FStavkaMenija extends javax.swing.JFrame {
    
    private StavkaMenija stavkaMenija;
    private JTable tabela;
    private int index;
    
    public FStavkaMenija(StavkaMenija stavkaMenija, JTable tabela) {
        initComponents();
        this.stavkaMenija = stavkaMenija;
        this.tabela = tabela;
        this.index = tabela.getSelectedRow();
        srediFormu();
    }

    /**
     * Creates new form FStavkaMenija
     */
    public FStavkaMenija() {
        initComponents();
    }
    
    FStavkaMenija(JTable jtblStavke) {
        tabela = jtblStavke;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCena = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboKategorija = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtxtKljucneReci = new javax.swing.JTextField();
        jbtnOdustani = new javax.swing.JButton();
        jbtnPotvrdi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboPotkategorija = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNaziv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stavka menija");

        jLabel3.setText("Kategorija");

        comboKategorija.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hrana" }));

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

        jLabel1.setText("Cena");

        comboPotkategorija.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sladoledi" }));

        jLabel4.setText("Potkategorija");

        jLabel5.setText("Naziv");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPotvrdi)
                                .addGap(46, 46, 46)
                                .addComponent(jbtnOdustani))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtCena)
                                    .addComponent(jtxtKljucneReci)
                                    .addComponent(comboKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(comboPotkategorija, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboKategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboPotkategorija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtKljucneReci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnOdustani)
                    .addComponent(jbtnPotvrdi))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotvrdiActionPerformed
        if (stavkaMenija != null) {
            ((StavkaMenijaModelTabele) tabela.getModel()).vratiListu().
                    get(index).setNaziv(jtxtCena.getText());
            ((StavkaMenijaModelTabele) tabela.getModel()).vratiListu()
                    .get(index).setCena(Integer.parseInt(jtxtCena.getText()));
            ((StavkaMenijaModelTabele) tabela.getModel()).vratiListu()
                    .get(index).setPotkategorija((Potkategorija) comboPotkategorija.getSelectedItem());
            tabela.repaint();
        } else {
            StavkaMenija sm = new StavkaMenija();
            sm.setNaziv(jtxtCena.getText());
            sm.setCena(Integer.parseInt(jtxtCena.getText()));
            sm.setPotkategorija((Potkategorija) comboPotkategorija.getSelectedItem());
            ((StavkaMenijaModelTabele) tabela.getModel()).vratiListu().add(sm);
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
            java.util.logging.Logger.getLogger(FStavkaMenija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FStavkaMenija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FStavkaMenija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FStavkaMenija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FStavkaMenija().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboKategorija;
    private javax.swing.JComboBox comboPotkategorija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnOdustani;
    private javax.swing.JButton jbtnPotvrdi;
    private javax.swing.JTextField jtxtCena;
    private javax.swing.JTextField jtxtKljucneReci;
    private javax.swing.JTextField jtxtNaziv;
    // End of variables declaration//GEN-END:variables

    public StavkaMenija getStavkaMenija() {
        return stavkaMenija;
    }
    
    public void setStavkaMenija(StavkaMenija stavkaMenija) {
        this.stavkaMenija = stavkaMenija;
    }
    
    private void srediFormu() {
         comboKategorija.setModel(new DefaultComboBoxModel(SingletonHolder.getInstance().getKategorije().toArray()));
         comboPotkategorija.setModel(new DefaultComboBoxModel(SingletonHolder.getInstance().getPotkategorije().toArray()));
         
        jtxtCena.setText(stavkaMenija.getNaziv());
        jtxtKljucneReci.setText(stavkaMenija.getPotkategorija().getKategorija().getKljucneReci());
        comboPotkategorija.setSelectedItem(stavkaMenija.getPotkategorija());
        comboKategorija.setSelectedItem(stavkaMenija.getPotkategorija().getKategorija());
    }
}